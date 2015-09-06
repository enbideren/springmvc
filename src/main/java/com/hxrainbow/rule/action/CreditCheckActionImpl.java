package com.hxrainbow.rule.action;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.msds.model.Apply;
import cn.msds.service.ApplyService;
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
	public int getPhones(String uuid) {
		Apply apply = new Apply();
		apply.setUuid(uuid);
		List<Apply> list = applyService.getApplyByCondition(apply);
		System.out.println(list.size());
		return list.size();
	}
	public int getCusts(String phoneNum){
		Apply apply = new Apply();
		apply.setPhoneNum(phoneNum);
		List<Apply> list = applyService.getApplyByCondition(apply);
		System.out.println(list.size());
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
		System.out.println(result);
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
		return DateUtils.dayDist(date)/365;
	}
	public static double getAge(int preAge){
		return 1-(new Double((60-preAge)/42.0));
	}
	public static double dealRate(double bnBackRate){
		return Math.pow(5, (1-bnBackRate))-1;
	}
	public static double getMonthDealRate(double bnMonthMoney){
		return Math.log10(bnMonthMoney+1);
	}
	public static double getPrePoint(Apply apply) throws Exception{
		double prePoint = apply.getIndustry()*0.05+apply.getCompanyType()*0.05+
						apply.getPosition()*0.05+apply.getEducation()*0.05+apply.getWorkTime()*0.05+getAge(getPreAge(apply.getIdCard()))*0.15+
						dealRate(apply.getBnBackRate())*0.2+getMonthDealRate(apply.getBnMonthMoney())*0.3+apply.getReciveAddr()*0.1;
		return prePoint;
	}
	public double getPointRate(Apply apply){
		double pointRate = 0;
		try {
			pointRate = (2.85-getPrePoint(apply))/ 2.85;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pointRate;
	}
	public double getApplyPoint(Apply apply){
		double pointRate = getPointRate(apply);
		double applyPoint = 540-199*(Math.log10((1-pointRate) /pointRate) / 1.352595093);
		return applyPoint;
	}
	public static void main(String[] args) {
		System.out.println(new Double(12/42.0));
	}
}
