package cn.springmvc.service;

import cn.springmvc.model.TFlow;
import cn.springmvc.util.BasePage;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface FlowService {

	/**
	 * 
	 * 根据页数列出系统中的实体
	 * @param basePage
	 * @param flowName 实体显示名称
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public BasePage getPageFlow(BasePage basePage,String flowName);

	/**
	 * 保存实体
	 * 
	 * @param flow
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public void saveFlow(TFlow flow);

	/**
	 * 根据实体id查询实体
	 * 
	 * @param id
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public TFlow getFlowById(Integer id);

	/**
	 * 更新实体
	 * 
	 * @param flow
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public void updateFlow(TFlow flow);

	/**
	 * 删除实体
	 * 
	 * @param id
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public void deleteFlow(Integer id);
}