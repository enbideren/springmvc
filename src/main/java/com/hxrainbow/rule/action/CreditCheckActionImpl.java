package com.hxrainbow.rule.action;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.msds.model.Apply;
import cn.msds.model.Core;
import cn.msds.service.ApplyService;
import cn.msds.service.CoreService;
import cn.springmvc.util.DateUtils;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Service("CreditCheckAction")
public class CreditCheckActionImpl {
	@Resource
	private ApplyService applyService;
	@Resource
	private CoreService coreService;
	public int getPhones(String uuid) {
		Apply apply = new Apply();
		apply.setUuid(uuid);
		List<Apply> list = applyService.getApplyByCondition(apply);
//		System.out.println(list.size());
		return list.size();
	}
	public int getCusts(String phoneNum){
		Apply apply = new Apply();
		apply.setPhoneNum(phoneNum);
		List<Apply> list = applyService.getApplyByCondition(apply);
//		System.out.println(list.size());
		return list.size();
	}
	public int getIps(String uuid){
		Date start = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(start);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		start = calendar.getTime();
		Date end = new Date();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("uuid", uuid);
		map.put("start", start);
		map.put("end", end);
		int result = applyService.getIpCount(map);
//		System.out.println(result);
		return result;
	}
	public int MIN(int arg1,int arg2){
		return arg1<arg2?arg1:arg2;
	}
	public int getDays(){
		int days = 0 ;
		try {
			days= DateUtils.dayDist("yyyy-MM-dd");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return days;
	}
	public static int getPreAge(String idCard) throws Exception {
		Date date = DateUtils.StringToDate(idCard.substring(6, 14), "yyyyMMdd");
		int a = DateUtils.dayDist(date)/365;
//		System.out.println("年龄中间变量"+a );
		return a;
	}
	public static double getAge(int preAge){
		double a = 1-(new Double((60-preAge)/42.0));
//		System.out.println("年龄"+a);
		return a;
	}
	public static double dealRate(double bnBackRate){
		double a = Math.pow(5, (1-bnBackRate))-1;
//		System.out.println("电商最终成交率："+a);
		return a;
	}
	public static double getMonthDealRate(double bnMonthMoney){
		double a = Math.log10(bnMonthMoney+1);
//		System.out.println("电商月均成功交易金额："+a );
		return a;
	}
	public static double getPrePoint(Apply apply) throws Exception{
		double prePoint = apply.getIndustry()*0.05+apply.getCompanyType()*0.05+
						apply.getPosition()*0.05+apply.getEducation()*0.05+apply.getWorkTime()*0.05+getAge(getPreAge(apply.getIdCard()))*0.15+
						dealRate(apply.getBnBackRate())*0.2+getMonthDealRate(apply.getBnMonthMoney())*0.3+apply.getReciveAddr()*0.1;
//		System.out.println("评分中间变量："+prePoint);
		return prePoint;
	}
	public double getPointRate(Apply apply){
		double pointRate = 0;
		try {
			pointRate = (2.85-getPrePoint(apply))/ 2.85;
		} catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println("评分概率："+pointRate);
		return pointRate;
	}
	public double getApplyPoint(Apply apply){
		double pointRate = getPointRate(apply);
		double applyPoint = 540-199*(Math.log10(pointRate/(1-pointRate)) / 1.352595093);
//		System.out.println("申请评分："+applyPoint);
		return applyPoint;
	}
	public double getEnableQuota(Apply apply){
		Core core = new Core();
		core.setUuid(apply.getUuid());
		List<Core> cores = coreService.getCoreByUuid(core);
		if (cores!=null&&cores.size()>0) {
			core = cores.get(0);
		}
		double a = apply.getBaseQuota()==null?0:(apply.getBaseQuota() - (core.getLoanBalance()==null?0:core.getLoanBalance()) - (core.getInCheckLoan()==null?0:core.getInCheckLoan()));
//		System.out.println("消费类可用额度："+a);
		return a;
	}
	public static void main(String[] args) {
		System.out.println();
	}
}
