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
	private Double bnBackRate;
	/** 近1年月均交易金额 */
	private Integer bnMonthMoney;
	/** 近1年客单价 */
	private Double price;
	/** 近1年件单价 */
	private Double bnAvgPrice;
	/** 近1年最常用收货地址的城市等级 2-一线城市；1-二线城市；0-三线城市 */
	private Integer reciveAddr;
	
	public Business(Date bnRegisterTime, Integer bnAllTimes) {
		super();
		this.bnRegisterTime = bnRegisterTime;
		this.bnAllTimes = bnAllTimes;
	}
	public Business(String name, String idCard, String address,
			Date bnRegisterTime, Integer bnOrderNum, String bnRecivePhone,
			Integer bnAllTimes, Integer bnAllMoney, Double bnBackRate,
			Integer bnMonthMoney, Double price, Double bnAvgPrice,
			Integer reciveAddr) {
		this.name = name;
		this.idCard = idCard;
		this.address = address;
		this.bnRegisterTime = bnRegisterTime;
		this.bnOrderNum = bnOrderNum;
		this.bnRecivePhone = bnRecivePhone;
		this.bnAllTimes = bnAllTimes;
		this.bnAllMoney = bnAllMoney;
		this.bnBackRate = bnBackRate;
		this.bnMonthMoney = bnMonthMoney;
		this.price = price;
		this.bnAvgPrice = bnAvgPrice;
		this.reciveAddr = reciveAddr;
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
	public Double getBnBackRate() {
		return bnBackRate;
	}
	public void setBnBackRate(Double bnBackRate) {
		this.bnBackRate = bnBackRate;
	}
	public Integer getBnMonthMoney() {
		return bnMonthMoney;
	}
	public void setBnMonthMoney(Integer bnMonthMoney) {
		this.bnMonthMoney = bnMonthMoney;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getBnAvgPrice() {
		return bnAvgPrice;
	}
	public void setBnAvgPrice(Double bnAvgPrice) {
		this.bnAvgPrice = bnAvgPrice;
	}
	public Integer getReciveAddr() {
		return reciveAddr;
	}
	public void setReciveAddr(Integer reciveAddr) {
		this.reciveAddr = reciveAddr;
	}
	
}
