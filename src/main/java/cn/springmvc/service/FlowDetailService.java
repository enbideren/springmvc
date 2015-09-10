package cn.springmvc.service;

import java.util.Map;

import cn.springmvc.model.TFlowDetail;
import cn.springmvc.util.BasePage;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface FlowDetailService {
	public BasePage getPageFlowDetail(BasePage basePage,TFlowDetail flowDetail);
	/**
	 * 保存实体
	 * 
	 * @param flowDetail
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public void saveFlowDetail(TFlowDetail flowDetail);

	/**
	 * 根据实体id查询实体
	 * 
	 * @param id
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public TFlowDetail getFlowDetailById(Integer id);

	/**
	 * 更新实体
	 * 
	 * @param flowDetail
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public void updateFlowDetail(TFlowDetail flowDetail);

	/**
	 * 删除实体
	 * 
	 * @param id
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public void deleteFlowDetail(Integer id);
}