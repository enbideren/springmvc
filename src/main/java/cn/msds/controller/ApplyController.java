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
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.msds.constant.ConstantRuleResult;
import cn.msds.model.Apply;
import cn.msds.model.Business;
import cn.msds.model.Cheat;
import cn.msds.model.User;
import cn.msds.service.ApplyService;
import cn.msds.service.CheatService;
import cn.springmvc.util.SpringContextHolder;
import cn.springmvc.util.TempData;
import cn.springmvc.util.ruleUtil.RuleUtil;

import com.hxrainbow.rule.action.CheatActionImpl;
import com.hxrainbow.rule.action.CreditCheckActionImpl;
import com.hxrainbow.rule.model.TempCreditCheck;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Controller
@RequestMapping("/index")
public class ApplyController {
	@Resource
	private ApplyService applyService;
	@Resource
	private CheatService cheatService;
	@RequestMapping("register.do")
	public String register(HttpServletResponse response,Model model,User user){
		String name = user.getUserName();
		Apply apply = new Apply();
		//默认用户是通过初审的
		apply.setPreResult(ConstantRuleResult.Rule_apply_success);
		apply.setApplyTime(new Date());
		user = TempData.getUser(user.getUserName());
		Business business = TempData.getBusiness(name);
		Object [] objects = new Object[]{business,user,apply};
		List<String> list = new ArrayList<String>();
		list.add("rules/ApplyRule.drl");
		list.add("rules/ApplyAssortRule.drl");
		StatefulKnowledgeSession session = RuleUtil.doRuleQuery(null,list, objects);
		QueryResults queryResult = session.getQueryResults("end Apply");
		for (QueryResultsRow queryResultsRow : queryResult) {
			apply = (Apply)queryResultsRow.get("apply");
		}
		session.dispose();
		if (apply.getPreResult() == 3) {
			apply = getApply(apply,user,business,name);
			//TODO 保存apply
			//TODO 保存core
			list.add("rules/CheatRule.drl");
//			apply = applyService.getApplyByCondition(apply).get(0);
			CheatActionImpl action = SpringContextHolder.getBean("CheatAction");
			objects = new Object[]{apply,action};
			session = RuleUtil.doRuleQuery(null,list, objects);
			queryResult = session.getQueryResults("end Cheat");
			for (QueryResultsRow queryResultsRow : queryResult) {
				apply = (Apply)queryResultsRow.get("apply");
			}
			session.dispose();
			apply.setCheatTime(new Date());
			Cheat cheat = new Cheat();
			cheat.setApplyId(apply.getId());
			cheat.setCheatTime(new Date());
			cheat.setCheatType(apply.getCheatType());
			cheat.setUuid(apply.getUuid());
			cheatService.addCheat(cheat);
			if (StringUtils.isEmpty(apply.getCheatType())) {
				list.clear();
				list.add("rules/baseFlow.rf");
				list.add("rules/CreditMPostionRule.drl");
				list.add("rules/CreditMIndustryRule.drl");
				list.add("rules/CreditMIncomeGroRule.drl");
				list.add("rules/CreditMCusGroRule.drl");
				list.add("rules/CreditMApplyPointRule.drl");
				list.add("rules/CreditMBaseQuoRule.drl");
				list.add("rules/CreditMResultRule.drl");
				TempCreditCheck tempCreditCheck = new TempCreditCheck();
				CreditCheckActionImpl checkActionImpl = SpringContextHolder.getBean("CreditCheckAction");
				objects = new Object[]{apply,checkActionImpl,tempCreditCheck};
				session = RuleUtil.doRuleQuery("baseFlow",list, objects);
				queryResult = session.getQueryResults("end TempCreditCheck");
				for (QueryResultsRow queryResultsRow : queryResult) {
					apply = (Apply)queryResultsRow.get("apply");
				}
				apply.setCreditCheckTime(new Date());
				//TODO 保存评分记录
				if (apply.getCreditCheckRst()!=null&&"1".equals(apply.getCreditCheckRst())) {
					//TODO 保存订单记录
					
				}
			}
		}
		//applyService.addApply(apply);
		model.addAttribute("apply", apply);
		return "index/report";
	}
	@RequestMapping("check.do")
	public void check(HttpServletResponse response,Model model,User user){
		
	}
	@RequestMapping("testCheat.do")
	public void testCheat(HttpServletResponse response,Model model,User user){
		Apply apply = new Apply();
		apply.setId(user.getGender());
		apply = applyService.getApplyByCondition(apply).get(0);
		CheatActionImpl action = SpringContextHolder.getBean("CheatAction");
		Object [] objects = new Object[]{apply,action};
		StatefulKnowledgeSession session = RuleUtil.doRuleQuery(null,"rules/CheatRule.drl", objects);
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
		List<String> rules = new ArrayList<String>();
		rules.add("rules/CreditMIndustryRule.drl");
		rules.add("rules/CreditMPostionRule.drl");
		rules.add("rules/baseFlow.rf");
		StatefulKnowledgeSession session = RuleUtil.doRuleQuery("baseFlow",rules, objects);
//		session = RuleUtil.doRuleQuery("rules/CreditMIndustryRule.drl", objects);
//		session = RuleUtil.doRuleQuery("rules/CreditMIncomeGroRule.drl", objects);
//		session = RuleUtil.doRuleQuery("rules/CreditMCusGroRule.drl", objects);
//		session = RuleUtil.doRuleQuery("rules/CreditMApplyPointRule.drl", objects);
//		session = RuleUtil.doRuleQuery("rules/CreditMBaseQuoRule.drl", objects);
//		session = RuleUtil.doRuleQuery("rules/CreditMResultRule.drl", objects);
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
