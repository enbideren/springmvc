package cn.springmvc.dao;

import cn.springmvc.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(String employeeid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String employeeid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}