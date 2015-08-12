package cn.springmvc.service;

import java.util.List;
import java.util.Map;

/**
 * Drools动作接口
 *
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface IAction {

	public void execute(Map<String,Object> map,List<Map<String,Object>> result);
}
