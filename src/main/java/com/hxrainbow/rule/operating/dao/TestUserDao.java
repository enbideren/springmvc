package com.hxrainbow.rule.operating.dao;

import java.util.List;

import com.hxrainbow.rule.model.TestLog;
import com.hxrainbow.rule.model.TestUser;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface TestUserDao {
	public List<TestUser> User();
	public void saveUser(TestUser user);
	public List getUserByUsername(String username); 
	public List<TestUser> getPointByUser(String userName);
	public void update(Integer point,Integer userName);
	public void savePointLog(TestLog log);
	public List<TestLog> getLogList(Integer userId);
}
