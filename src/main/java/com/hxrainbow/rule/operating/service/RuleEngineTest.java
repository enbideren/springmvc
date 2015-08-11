package com.hxrainbow.rule.operating.service;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.springmvc.model.TRule;
import cn.springmvc.service.IRuleEngine;
import cn.springmvc.util.RuleEngineException;

import com.hxrainbow.Member;

public class RuleEngineTest {

	private static IRuleEngine ruleEngine;
	
	@Before
	public  void setUpBeforeClass() throws Exception {
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext(
					"spring/applicationContext-common.xml");
			ruleEngine = (IRuleEngine) ctx.getBean("ruleEngine");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	@Test
	public void insertRuleCondition(){
		TRule rule = new TRule();
		rule.setId(27);
		rule.setCondition("33");
		//StringBuffer ss = ruleEngine.insertRuleCondition(new StringBuffer(),rule);
		//System.out.println(ss.toString());
	}
	
	@Test
	public void executeRuleEngine() throws RuleEngineException{
		HashMap<String, Object> map = new HashMap<String, Object>();
		Member member = new Member();
		member.setQuestion(10);
		member.setAnswerRight(0);
		map.put("member", member);
		ruleEngine.executeRuleEngine(map, "question");
	}
}
