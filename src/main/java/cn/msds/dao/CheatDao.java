package cn.msds.dao;

import java.util.List;

import cn.msds.model.Cheat;


/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface CheatDao {
    int addCheat(Cheat cheat);
    List<Cheat> getCheatByUuid(Cheat cheat);
}