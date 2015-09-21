package com.hxrainbow.rule.operating.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import cn.springmvc.dao.RuleDao;
import cn.springmvc.model.TActionMeta;
import cn.springmvc.model.TActionMetaVariable;
import cn.springmvc.util.StringKit;

public class RuleEngineUtil {
	public static String getLastString(String classC){
		String[] s = classC.split("\\.");
		return s[s.length-1];
	}
	@Test
	public void test(){
		System.out.println(getLastString("cn.msds.model.Apply"));
	}
	public static String changeString(String rule,RuleDao ruleDao){
		List<String> tempList = StringKit.getParamId(rule);
		for (int i = 0; i < tempList.size(); i++) {
			String action = changeAction(tempList.get(i),ruleDao);
			rule.replaceAll("$"+tempList.get(i)+"$",action);
		}
		return rule;
	}
	public static String changeAction(String action,RuleDao ruleDao){
		TActionMeta actionMeta = ruleDao.getActionMetaByActionId(Integer.parseInt(action));
		StringBuffer rule = new StringBuffer();
		rule.append("$").append(getLastString(actionMeta.getClassC())).append(".").append(actionMeta.getMethodC()).append("(");
		Map map = new HashMap();
		map.put("metaId", actionMeta.getId());
		map.put("actionId", action);
		List<TActionMetaVariable> variableList = ruleDao.getActionVariableList(map);
		if (variableList!=null && variableList.size()>0) {
			for (int i = 0; i < variableList.size(); i++) {
				String variableValue = variableList.get(i).gettActionVariable().getVariableValue();
				if (!variableValue.isEmpty()) {
					changeString(variableValue,ruleDao);
				}
			}
		}
		rule.append(");");
		return rule.toString();
	}
}
