package cn.msds.service;

import java.util.List;

import cn.msds.model.Core;


/**
 * 变量操作接口类
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface CoreService {
	public int addCore(Core core);
    public List<Core> getCoreByUuid(Core core);
}
