package cn.springmvc.service;

import java.util.List;
import java.util.Map;

import cn.springmvc.util.RuleEngineException;

/**
 * 规则引擎核心
 *
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface IRuleEngine {

	
	public List<Map<String,Object>> executeRuleEngine(Map<String,Object> factMap,String scene) throws RuleEngineException;	
}
