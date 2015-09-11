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
	public int addApply(Apply apply);
	public List<Apply> getApplyByCondition(Apply apply);
	public int getIpCount(Map<String,Object> map);
}
