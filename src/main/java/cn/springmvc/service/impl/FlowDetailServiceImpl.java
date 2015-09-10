package cn.springmvc.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.springmvc.dao.FlowDetailDao;
import cn.springmvc.model.TFlowDetail;
import cn.springmvc.service.FlowDetailService;
import cn.springmvc.util.BasePage;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Service("flowDetailService")
@Transactional
public class FlowDetailServiceImpl implements FlowDetailService {

	@Resource
	private FlowDetailDao flowDetailDao;

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public BasePage getPageFlowDetail(BasePage basePage, TFlowDetail flowDetail) {
		Map map =basePage.getPaging(); 
		map.put("flowId", flowDetail.getFlowId());
		map.put("sceneName", flowDetail.getSceneName());
		basePage.setList(flowDetailDao.findPageDataByHql(map));
		basePage.setRecordNum(flowDetailDao.findTotalCount(map));
		return basePage;
	}
	/**
	 * 保存实体
	 * 
	 * @param flowDetail
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	@Override
	public void saveFlowDetail(TFlowDetail flowDetail) {
		flowDetailDao.saveFlowDetail(flowDetail);
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
	public TFlowDetail getFlowDetailById(Integer id) {
		return flowDetailDao.getFlowDetailById(id);
	}


	/**					
	 * 更新实体
	 * 
	 * @param flowDetail
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public void updateFlowDetail(TFlowDetail flowDetail) {
		flowDetailDao.updateFlowDetail(flowDetail);
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
	public void deleteFlowDetail(Integer id) {
		flowDetailDao.deleteFlowDetail(id);
	}
}
