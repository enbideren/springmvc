package cn.msds.model.temp;

import java.io.Serializable;

/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public class TempCreditCheck implements Serializable{
	//serialVersionUID 
	private static final long serialVersionUID = 1L;
	/**年收入中变量*/
	private  double income;
	/**预估年收入*/
	private  double preIncome;
	/**预估年收入分组*/
	private  int incomeGroup;
	/**年龄中间变量*/
	private int preAge;
	/**年龄*/
	private int age;
	/**电商最终成交率*/
	private double dealRate;
	/**电商月均成功交易金额*/
	private int monthDealRate;
	/**GB客户标志*/
	private String GBLable;
	/**评分概率*/
	private double pointRate;
	/**评分中间变量*/
	private double prePoint;
	/**申请评分*/
	private double applyPoint; 
	/**申请评分等级*/
	private int applyPointType;
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getPreIncome() {
		return preIncome;
	}
	public void setPreIncome(double preIncome) {
		this.preIncome = preIncome;
	}
	public int getIncomeGroup() {
		return incomeGroup;
	}
	public void setIncomeGroup(int incomeGroup) {
		this.incomeGroup = incomeGroup;
	}
	public int getPreAge() {
		return preAge;
	}
	public void setPreAge(int preAge) {
		this.preAge = preAge;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getDealRate() {
		return dealRate;
	}
	public void setDealRate(double dealRate) {
		this.dealRate = dealRate;
	}
	public int getMonthDealRate() {
		return monthDealRate;
	}
	public void setMonthDealRate(int monthDealRate) {
		this.monthDealRate = monthDealRate;
	}
	public String getGBLable() {
		return GBLable;
	}
	public void setGBLable(String gBLable) {
		GBLable = gBLable;
	}
	public double getPointRate() {
		return pointRate;
	}
	public void setPointRate(double pointRate) {
		this.pointRate = pointRate;
	}
	public double getPrePoint() {
		return prePoint;
	}
	public void setPrePoint(double prePoint) {
		this.prePoint = prePoint;
	}
	public double getApplyPoint() {
		return applyPoint;
	}
	public void setApplyPoint(double applyPoint) {
		this.applyPoint = applyPoint;
	}
	public int getApplyPointType() {
		return applyPointType;
	}
	public void setApplyPointType(int applyPointType) {
		this.applyPointType = applyPointType;
	}
	
}