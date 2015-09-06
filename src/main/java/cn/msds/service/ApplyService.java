package cn.msds.service;

import java.util.List;
import java.util.Map;

import cn.msds.model.Apply;


/**
 * 变量操作接口类
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface ApplyService {
	/**
	 * 添加规则接口，包括初始化条件和动作
	 * @author JZR	
	 * @param 
	 * @return
	 */
	public int addApply(Apply apply);
	public List<Apply> getApplyByCondition(Apply apply);
	public int getIpCount(Map<String,Object> map);
}
