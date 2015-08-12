package cn.springmvc.service;

import java.util.List;

import cn.springmvc.model.TVariable;

/**
 * 变量操作接口类
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface VariableService {

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
	List<TVariable> listVariable(String variableName, Integer type);

}
