package cn.msds.service;

import java.util.List;

import cn.msds.model.Cheat;


/**
 * 变量操作接口类
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface CheatService {
	public int addCheat(Cheat cheat);
    public List<Cheat> getCheatByUuid(Cheat cheat);
}
