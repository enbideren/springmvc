package cn.springmvc.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.springmvc.dao.FlowDao;
import cn.springmvc.model.TFlow;
import cn.springmvc.service.FlowService;
import cn.springmvc.util.BasePage;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Service("flowService")
@Transactional
public class FlowServiceImpl implements FlowService {

	@Resource
	private FlowDao flowDao;

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public BasePage getPageFlow(BasePage basePage, String flowName) {
		Map map =basePage.getPaging(); 
		map.put("name", flowName);
		basePage.setList(flowDao.findPageDataByHql(map));
		basePage.setRecordNum(flowDao.findTotalCount(map));
		return basePage;
	}

	/**
	 * 保存实体
	 * 
	 * @param flow
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	@Override
	public void saveFlow(TFlow flow) {
		flowDao.saveFlow(flow);
	}

	/**
	 * 根据实体id查询实体
	 * 
	 * @param id
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public TFlow getFlowById(Integer id) {
		return flowDao.getFlowById(id);
	}


	/**					
	 * 更新实体
	 * 
	 * @param flow
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public void updateFlow(TFlow flow) {
		flowDao.updateFlow(flow);
	}

	/**
	 * 删除实体
	 * 
	 * @param id
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	@Override
	public void deleteFlow(Integer id) {
		flowDao.deleteFlow(id);
	}
}
