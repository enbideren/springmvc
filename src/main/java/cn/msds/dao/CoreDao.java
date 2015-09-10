package cn.msds.dao;

import java.util.List;

import cn.msds.model.Core;


/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface CoreDao {
    int addCore(Core core);
    List<Core> getCoreByUuid(Core core);
}