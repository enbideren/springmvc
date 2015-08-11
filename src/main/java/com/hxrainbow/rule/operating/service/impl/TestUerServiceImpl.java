package com.hxrainbow.rule.operating.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxrainbow.rule.model.TestLog;
import com.hxrainbow.rule.model.TestUser;
import com.hxrainbow.rule.operating.dao.TestUserDao;
import com.hxrainbow.rule.operating.service.TestUserService;


@Service("testUserService")
public class TestUerServiceImpl implements TestUserService{
	@Autowired
	private TestUserDao testUserDao;
	@Override
	public List<TestUser> User() {
		return testUserDao.User();
	}
	@Override
	public void saveUser(TestUser user) {
		testUserDao.saveUser(user);
	}
	@Override
	public boolean getUserByUsername(String username){
		
		List list = testUserDao.getUserByUsername(username);
		if(list == null || list.size() == 0){
			return true;
		}
		return false;
	}
	@Override
	public TestUser getPointByUser(String userName) {
		
		return testUserDao.getPointByUser(userName).get(0);
	}
	
	@Override
	public void logRulePoint(TestLog log){
		log.setCreateDate(new Date());
		testUserDao.savePointLog(log);
	}
	
	@Override
	public List<TestLog> getLogList(Integer userId){
		return testUserDao.getLogList(userId);
	}
}
