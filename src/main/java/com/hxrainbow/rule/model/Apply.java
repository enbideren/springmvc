package com.hxrainbow.rule.model;

import java.io.Serializable;
import java.util.Date;

public class Apply implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 客户号 */
	private Integer uuid;
	/** 系统审核结果 		0-通过；1-拒绝；2-转人工 */
	private Integer result;
	/** 进件编号 */
	private Integer billNum;
	/** 进件时间 */
	private Date billTime;
	/** 系统审核时间 */
	private Date checkTime;
	/** 客户预分类 	A:企业高管，高级技术人员；B:高学历；C：其他客户 */
	private String userType;

	public Integer getUuid() {
		return uuid;
	}

	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

	public Integer getBillNum() {
		return billNum;
	}

	public void setBillNum(Integer billNum) {
		this.billNum = billNum;
	}

	public Date getBillTime() {
		return billTime;
	}

	public void setBillTime(Date billTime) {
		this.billTime = billTime;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}
