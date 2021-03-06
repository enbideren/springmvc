package com.hxrainbow.rule.operating.service;

import java.util.HashMap;

import org.junit.Test;

import cn.springmvc.model.TRule;
import cn.springmvc.service.IRuleEngine;
import cn.springmvc.util.RuleEngineException;

import com.hxrainbow.rule.model.Member;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public class RuleEngineTest {

	private static IRuleEngine ruleEngine;
	
//	@Before
//	public  void setUpBeforeClass() throws Exception {
//		try {
//			ApplicationContext ctx = new ClassPathXmlApplicationContext(
//					"spring/applicationContext-common.xml");
//			ruleEngine = (IRuleEngine) ctx.getBean("ruleEngine");
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 
//	}

	public void insertRuleCondition(){
		TRule rule = new TRule();
		rule.setId(27);
		rule.setConditionC("33");
		//StringBuffer ss = ruleEngine.insertRuleCondition(new StringBuffer(),rule);
		//System.out.println(ss.toString());
	}
	
	public void executeRuleEngine() throws RuleEngineException{
		HashMap<String, Object> map = new HashMap<String, Object>();
		Member member = new Member();
		member.setQuestion(10);
		member.setAnswerRight(0);
		map.put("member", member);
		ruleEngine.executeRuleEngine(map, "question");
	}
}
