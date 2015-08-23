package com.hxrainbow.rule.model;

import java.io.Serializable;
import java.util.Date;

public class Business implements Serializable {

	private static final long serialVersionUID = 1L;
	/** 姓名 姓名和身份证需实名认证 */
	private String name;
	/** 身份证号 姓名和身份证需实名认证 */
	private String idCard;
	/** 居住/收货地址 客户最近一次使用收货地址 */
	private String address;
	/** 电商开户日期 */
	private Date bnRegisterTime;
	/** 电商订单号 */
	private Integer bnOrderNum;
	/** 电商收货手机号 */
	private String bnRecivePhone;
	/** 近1年成功交易订单数 */
	private Integer bnAllTimes;
	/** 近1年成功交易订总金额 */
	private Integer bnAllMoney;
	/** 近1年客户金额退拒收率 */
	private Integer bnBackRate;
	/** 近1年月均交易金额 */
	private Integer bnMonthMoney;
	/** 近1年客单价 */
	private Integer price;
	/** 近1年件单价 */
	private Integer bnAvgPrice;
	/** 近1年最常用收货地址的城市等级 2-一线城市；1-二线城市；0-三线城市 */
	private Integer reciveAddr;

	public Business(Integer bnAllTimes) {
		super();
		this.bnAllTimes = bnAllTimes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBnRegisterTime() {
		return bnRegisterTime;
	}

	public void setBnRegisterTime(Date bnRegisterTime) {
		this.bnRegisterTime = bnRegisterTime;
	}

	public Integer getBnOrderNum() {
		return bnOrderNum;
	}

	public void setBnOrderNum(Integer bnOrderNum) {
		this.bnOrderNum = bnOrderNum;
	}

	public String getBnRecivePhone() {
		return bnRecivePhone;
	}

	public void setBnRecivePhone(String bnRecivePhone) {
		this.bnRecivePhone = bnRecivePhone;
	}

	public Integer getBnAllTimes() {
		return bnAllTimes;
	}

	public void setBnAllTimes(Integer bnAllTimes) {
		this.bnAllTimes = bnAllTimes;
	}

	public Integer getBnAllMoney() {
		return bnAllMoney;
	}

	public void setBnAllMoney(Integer bnAllMoney) {
		this.bnAllMoney = bnAllMoney;
	}

	public Integer getBnBackRate() {
		return bnBackRate;
	}

	public void setBnBackRate(Integer bnBackRate) {
		this.bnBackRate = bnBackRate;
	}

	public Integer getBnMonthMoney() {
		return bnMonthMoney;
	}

	public void setBnMonthMoney(Integer bnMonthMoney) {
		this.bnMonthMoney = bnMonthMoney;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getBnAvgPrice() {
		return bnAvgPrice;
	}

	public void setBnAvgPrice(Integer bnAvgPrice) {
		this.bnAvgPrice = bnAvgPrice;
	}

	public Integer getReciveAddr() {
		return reciveAddr;
	}

	public void setReciveAddr(Integer reciveAddr) {
		this.reciveAddr = reciveAddr;
	}


}
