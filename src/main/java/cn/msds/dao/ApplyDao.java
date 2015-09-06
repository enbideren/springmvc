package cn.msds.dao;

import java.util.List;
import java.util.Map;

import cn.msds.model.Apply;


/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface ApplyDao {
    int addApply(Apply apply);
    List<Apply> getApplyByCondition(Apply apply);
    int getIpCount(Map<String,Object> map);
}