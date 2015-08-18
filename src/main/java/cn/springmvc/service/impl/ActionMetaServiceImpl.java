package cn.springmvc.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.springmvc.dao.ActionMetaDao;
import cn.springmvc.model.TActionMeta;
import cn.springmvc.model.TActionMetaVariable;
import cn.springmvc.service.ActionMetaService;
import cn.springmvc.util.BasePage;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Service("actionMetaService")
@Transactional
public class ActionMetaServiceImpl implements ActionMetaService{
    
	@Resource
	private ActionMetaDao actionMetaDao;
	
	
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	@Override
	public BasePage getPageActionMeta(BasePage basePage, String actionMetaName) {
		Map map =basePage.getPaging(); 
		map.put("name", actionMetaName);
		basePage.setList(actionMetaDao.findPageDataByHql(map));
		basePage.setRecordNum(actionMetaDao.findTotalCount(map));
		return basePage;
	}
    /**
     * 保存动作类型
     */
	@Override
	public void saveActionMeta(TActionMeta actionMeta,List<String> variableList) {
		actionMetaDao.saveActionMeta(actionMeta);
		actionMeta = actionMetaDao.getActionMetaByName(actionMeta.getName());
		Integer id =  actionMeta.getId();
		for(String ids : variableList){
			String[] idArr = ids.split(",");
			TActionMetaVariable variable = new TActionMetaVariable();
			variable.setName(idArr[0]);
			variable.setIdentify(idArr[1]);
			variable.setActionMetaId(id);
			actionMetaDao.saveActionMetaVariable(variable);
		}
	}
    /**
     * 根据id查询动作类型
     */
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	@Override
	public TActionMeta getActionMetaById(Integer id) {
		return actionMetaDao.getActionMetaById(id);
	}
    /**
     * 更新动作类型
     */
	@Override
	public void updateActionMeta(TActionMeta actionMeta,List<String> variableList) {
		actionMetaDao.updateActionMeta(actionMeta);	
		Integer id = actionMeta.getId();
		actionMetaDao.deleteActionMetaVariable(id);
		for(String ids : variableList){
			String[] idArr = ids.split(",");
			TActionMetaVariable variable = new TActionMetaVariable();
			variable.setName(idArr[0]);
			variable.setIdentify(idArr[1]);
			variable.setActionMetaId(id);
			actionMetaDao.saveActionMetaVariable(variable);
		}
		
	}
    /**
     * 根据id删除动作类型
     */
	@Override
	public void deleteActionMeta(Integer id) {
		actionMetaDao.deleteActionMeta(id);
	}
	/**
	 * 在条件部分添加动作时展示所有的动作类型
	 * 
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-16
	 */
	@SuppressWarnings("unchecked")
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	@Override
	public List<TActionMeta> getActionMetaList(){
		return actionMetaDao.findDataByHql();
	}
	/**
	 * 查看动作类型变量
	 * 
	 * @param id
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-23
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	@Override
	public List<TActionMetaVariable> getActionMetaVariableById(Integer id){
		return actionMetaDao.getActionMetaVariableById(id);
	}
}
