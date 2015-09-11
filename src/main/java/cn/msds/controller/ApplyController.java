package cn.msds.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
import cn.msds.model.CreditCheck;
import cn.msds.model.CreditManage;
import cn.msds.model.Order;
import cn.msds.model.User;
import cn.msds.model.temp.TempCreditCheck;
import cn.msds.service.ApplyService;
import cn.msds.service.CheatService;
import cn.msds.service.CreditCheckService;
import cn.msds.service.CreditManageService;
import cn.msds.service.OrderService;
import cn.msds.util.CheatActionImpl;
import cn.msds.util.CreditCheckActionImpl;
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
@RequestMapping("/index")
public class ApplyController {
	@Resource
	private ApplyService applyService;
	@Resource
	private CheatService cheatService;
	@Resource
	private OrderService orderService;
	@Resource
	private CreditCheckService creditCheckService;
	@Resource
	private CreditManageService creditManageService;
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
		//判断初审是否通过
		if (apply.getPreResult() == 3) {
			apply = TempData.getApply(apply,user,business,name);
			apply = applyService.getApplyByCondition(apply).get(0);
			list.add("rules/CheatRule.drl");
//			apply = applyService.getApplyByCondition(apply).get(0);
			CheatActionImpl action = SpringContextHolder.getBean("CheatAction");
			objects = new Object[]{apply,action};
			session = RuleUtil.doRuleQuery(null,list, objects);
			queryResult = session.getQueryResults("end Cheat");
			//获取规则引擎执行结果
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
			//判断发欺诈模型结果
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
				//保存评分记录
				CreditCheck creditCheck = new CreditCheck();
				creditCheck.setApplyId(apply.getId());
				creditCheck.setBaseQuota(apply.getBaseQuota());
				creditCheck.setCreditCheckRate(apply.getCreditCheckRate());
				creditCheck.setCreditCheckRst(apply.getCreditCheckRst());
				creditCheck.setCreditCheckTime(new Date());
				creditCheck.setEnableQuota(apply.getEnableQuota());
				creditCheck.setUuid(apply.getUuid());
				creditCheck.setGrade(apply.getGrade());
				creditCheck.setScore(apply.getScore());
				creditCheckService.addCreditCheck(creditCheck);
				if (apply.getCreditCheckRst()!=null&&"1".equals(apply.getCreditCheckRst())) {
					//保存订单记录
					Order order = new Order();
					order.setOrderCreateTime(new Date());
					order.setOrderState(ConstantRuleResult.Check_state_1);
					order.setApplyId(apply.getId());
					order.setReplyMoney(apply.getEnableQuota());
					order.setReplyRate(apply.getCreditCheckRate());
					order.setReplyTimes(apply.getApplyRepayTime());
					order.setUuid(apply.getUuid());
					orderService.addOrder(order);
					model.addAttribute("order", orderService.getOrderByUuid(order).get(0));
				}
			}
		}
		//applyService.addApply(apply);
		model.addAttribute("apply", apply);
		return "index/report";
	}
	
	@RequestMapping("manage.do")
	public void manage(HttpServletResponse response,Model model,CreditManage creditManage){
		creditManage.setVerifyTime(new Date());
		creditManageService.addCreditManage(creditManage);
		//TODO 添加订单信息
	}
}
