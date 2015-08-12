package cn.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.UserMapper;
import cn.springmvc.model.User;
import cn.springmvc.service.UserService;

/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Service(value="userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userDAO;
	
	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.insert(user);
	}

}
