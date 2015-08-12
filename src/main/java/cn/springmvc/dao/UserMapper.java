package cn.springmvc.dao;

import cn.springmvc.model.User;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface UserMapper {
    int deleteByPrimaryKey(String employeeid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String employeeid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}