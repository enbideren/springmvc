package cn.springmvc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.springmvc.dao.VariableDao;
import cn.springmvc.model.TVariable;
import cn.springmvc.service.VariableService;
import cn.springmvc.util.StringKit;

/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Service("variableService")
@Transactional
public class VariableServiceImpl implements VariableService {

	@Resource
	private VariableDao variableDao;
	
	/**
	 * 根据变量类型和变量名称查询变量列表
	 * 
	 * @param variableName
	 * @param type
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-15
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TVariable> listVariable(String variableName, Integer type) {
		
		StringBuffer hql=new StringBuffer("from TVariable where 1 = 1");
		if(StringKit.isNotEmpty(variableName)){
			  hql.append(" and name like '" + variableName + "'");
		}
		if(type != null && type != 0){
			  hql.append(" and type = " + type );
		}
		List<TVariable> list = variableDao.findDataByHql(hql.toString());
		
		return list;
	}
}
