package cn.msds.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.rule.QueryResults;
import org.drools.runtime.rule.QueryResultsRow;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hxrainbow.rule.action.CheatActionImpl;
import com.hxrainbow.rule.action.CreditCheckActionImpl;
import com.hxrainbow.rule.model.TempCreditCheck;

import cn.msds.model.Apply;
import cn.msds.model.Business;
import cn.msds.model.Cheat;
import cn.msds.model.User;
import cn.msds.service.ApplyService;
import cn.springmvc.service.IAction;
import cn.springmvc.service.impl.RuleEngine;
import cn.springmvc.util.SpringContextHolder;
import cn.springmvc.util.TempData;
import cn.springmvc.util.ruleUtil.RuleUtil;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Controller
@RequestMapping("/apply")
public class ApplyController {
	@Resource
	private ApplyService applyService;
	@RequestMapping("register.do")
	public String register(HttpServletResponse response,Model model,User user){
		String name = user.getUserName();
		Apply apply = new Apply();
		apply.setPreResult(3);
		apply.setApplyTime(new Date());
		Cheat cheat = new Cheat();
		user = TempData.getUser(user.getUserName());
		Business business = TempData.getBusiness(name);
		Object [] objects = new Object[]{business,user,apply,cheat};
		List<String> list = new ArrayList<String>();
		list.add("rules/ApplyAssortRule.drl");
		list.add("rules/ApplyRule.drl");
		StatefulKnowledgeSession session = RuleUtil.doRuleQuery(list, objects);
		QueryResults queryResult = session.getQueryResults("end Apply");
		for (QueryResultsRow queryResultsRow : queryResult) {
			apply = (Apply)queryResultsRow.get("apply");
			System.out.println(apply.getPreResult());
			System.out.println(apply.getUserType());
		}
		session.dispose();
		apply = getApply(apply,user,business,name);
//	
		applyService.addApply(apply);
		return "main/index";
	}
	@RequestMapping("testCheat.do")
	public void testCheat(HttpServletResponse response,Model model,User user){
		Apply apply = new Apply();
		apply.setId(user.getGender());
		apply = applyService.getApplyByCondition(apply).get(0);
		CheatActionImpl action = SpringContextHolder.getBean("CheatAction");
		Object [] objects = new Object[]{apply,action};
		StatefulKnowledgeSession session = RuleUtil.doRuleQuery("rules/CheatRule.drl", objects);
//		QueryResults queryResult = session.getQueryResults("end Cheat");
//		for (QueryResultsRow queryResultsRow : queryResult) {
//			Apply loanMoney = (Apply)queryResultsRow.get("cheat");
//			System.out.println(loanMoney.getPreResult());
//			System.out.println(loanMoney.getUserType());
//		}
	}
	@RequestMapping("testCredit.do")
	public void testCredit(HttpServletResponse response,Model model,User user){
		TempCreditCheck tempCreditCheck = new TempCreditCheck();
		Apply apply = new Apply();
		apply.setId(user.getGender());
		apply = applyService.getApplyByCondition(apply).get(0);
		CreditCheckActionImpl action = SpringContextHolder.getBean("CreditCheckAction");
		Object [] objects = new Object[]{apply,action,tempCreditCheck};
		StatefulKnowledgeSession session = RuleUtil.doRuleQuery("rules/CreditMPostionRule.drl", objects);
		session = RuleUtil.doRuleQuery("rules/CreditMIndustryRule.drl", objects);
		session = RuleUtil.doRuleQuery("rules/CreditMIncomeGroRule.drl", objects);
		session = RuleUtil.doRuleQuery("rules/CreditMCusGroRule.drl", objects);
		session = RuleUtil.doRuleQuery("rules/CreditMApplyPointRule.drl", objects);
//		QueryResults queryResult = session.getQueryResults("end Cheat");
//		for (QueryResultsRow queryResultsRow : queryResult) {
//			Apply loanMoney = (Apply)queryResultsRow.get("cheat");
//			System.out.println(loanMoney.getPreResult());
//			System.out.println(loanMoney.getUserType());
//		}
	}
	private Apply getApply(Apply apply,User user,Business business,String name){
		String[] ips = TempData.getIps(name);
		Apply applys = new Apply(
				getUuid(user.getIdCard()), user.getUserName(), user.getGender(),
				user.getPhoneNum(), new Integer(0), user.getIdCard(),
				user.getIndustry(), user.getCompanyType(), user.getPosition(),
				user.getEducation(), business.getAddress(), user.getContactName(),
				user.getContactPhoneNum(), user.getEmail(), ips[1], ips[2],
				ips[3], user.getWorkTime(), user.getSalary(),
				business.getBnRegisterTime(), business.getBnOrderNum(), business.getBnRecivePhone(),
				business.getBnAllTimes(), business.getBnAllMoney(), business.getBnBackRate(),
				business.getBnMonthMoney(), business.getPrice(), business.getBnAvgPrice(),
				business.getReciveAddr(), null, user.getApplyMoney(),
				user.getApplyRepayTime(), null, null,
				apply.getApplyTime(), apply.getPreResult(), new Date(), apply.getUserType(),
				null, null, null,
				null, null, null,
				null, null, null,
				null
				);
		return applys;
	}
	/**
	 * uuid 生成规则
	 * @author JZR	
	 * @param 
	 * @return
	 */
	private String getUuid(String idCard){
		 return UUID.randomUUID().toString();
	}
}
