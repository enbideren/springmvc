package com.hxrainbow.rule.operating.service;

import java.util.List;

import com.hxrainbow.rule.model.TestLog;
import com.hxrainbow.rule.model.TestUser;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface TestUserService {
	public List<TestUser> User();
	public void saveUser(TestUser user);
	public boolean getUserByUsername(String username);
	public TestUser getPointByUser(String userName);
	public void logRulePoint(TestLog log);
	public List<TestLog> getLogList(Integer userId);
}
