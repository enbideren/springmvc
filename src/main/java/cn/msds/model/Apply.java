package cn.msds.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author JZR
 * @date 2015年9月1日
 * @Description 进件表
 * @version V1.0
 */
public class Apply implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 进件编号 */
	private Integer id;
	/** 客户号 */
	private String uuid;
	/** 姓名 */
	private String userName;
	/** 性别 	0-女；1-男；2-不详 */
	private Integer gender;
	/** 申请人手机号 */
	private String phoneNum;
	/** 证件类型 */
	private Integer certificateType;
	/** 证件号 */
	private String idCard;
	/** 行业 	0-制造业；1-服务业；2-其他 */
	private Integer industry;
	/** 企业类型 	2-国企；0-私企；1-外资 */
	private Integer companyType;
	/** 职位	 	0-普通员工；1-经理及主管；2-企业法人、CEO */
	private Integer position;
	/** 学历 	0-高中、高职及以下；1-本科；2-研究生及以上 */
	private Integer education;
	/** 居住/收货地址 	客户最近一次使用收货地址 */
	private String address;
	/** 紧急联系人姓名 */
	private String contactName;
	/** 紧急联系人号码 */
	private String contactPhoneNum;
	/** 邮箱 */
	private String email;
	/** 提交申请时的IP地址 */
	private String IP;
	/** 提交申请时的地址 */
	private String LBS;
	/** 提交申请时的设备MACID */
	private String MACID;
	/** 工作年限	 	0.3年及以下；1.3到7年；2.7年及以上 */
	private Integer workTime;
	/** 年收入 */
	private Integer salary;
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
	/** 适用产品编号 */
	private String fitProduct;
	/** 申请金额 */
	private Integer applyMoney;
	/** 申请期数 */
	private Integer applyRepayTime;
	/** 申请利率  */
	private Integer applyRate;
	/** 申请期限  */
	private Integer applyDeadline;;
	/** 进件时间 */
	private Date applyTime;
	/** 进件预审结果 		0-通过；1-拒绝；2-转人工 */
	private Integer preResult;
	/** 进件预审时间 */
	private Date preDate;
	/** 客户预分类 	A:企业高管，高级技术人员；B:高学历；C：其他客户 */
	private String userType;
	/** 反欺诈结果标志  A01、A02、B01、F01*/
	private String cheatType;
	/** 欺诈备注*/
	private String cheatContent;
	/** 反欺诈时间*/
	private Date cheatTime;
	/** 信用评分 */
	private Integer score;
	/** 评分评审结果 		 0-拒绝，1-通过*/
	private String creditCheckRst;
	/** 评分等级 */
	private Integer grade;
	/** 消费类基本额度  */
	private Integer baseQuota;
	/** 消费类可用额度  */
	private Integer enableQuota;
	/** 评分时间*/
	private Date creditCheckTime;
	/** 评分理论利率 */
	private Integer creditCheckRate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Integer getCertificateType() {
		return certificateType;
	}
	public void setCertificateType(Integer certificateType) {
		this.certificateType = certificateType;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public Integer getIndustry() {
		return industry;
	}
	public void setIndustry(Integer industry) {
		this.industry = industry;
	}
	public Integer getCompanyType() {
		return companyType;
	}
	public void setCompanyType(Integer companyType) {
		this.companyType = companyType;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public Integer getEducation() {
		return education;
	}
	public void setEducation(Integer education) {
		this.education = education;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactPhoneNum() {
		return contactPhoneNum;
	}
	public void setContactPhoneNum(String contactPhoneNum) {
		this.contactPhoneNum = contactPhoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public String getLBS() {
		return LBS;
	}
	public void setLBS(String lBS) {
		LBS = lBS;
	}
	public String getMACID() {
		return MACID;
	}
	public void setMACID(String mACID) {
		MACID = mACID;
	}
	public Integer getWorkTime() {
		return workTime;
	}
	public void setWorkTime(Integer workTime) {
		this.workTime = workTime;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
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
	public String getFitProduct() {
		return fitProduct;
	}
	public void setFitProduct(String fitProduct) {
		this.fitProduct = fitProduct;
	}
	public Integer getAppleMoney() {
		return applyMoney;
	}
	public void setAppleMoney(Integer applyMoney) {
		this.applyMoney = applyMoney;
	}
	public Integer getAppleRepayTime() {
		return applyRepayTime;
	}
	public void setAppleRepayTime(Integer applyRepayTime) {
		this.applyRepayTime = applyRepayTime;
	}
	public Integer getAppleRate() {
		return applyRate;
	}
	public void setAppleRate(Integer applyRate) {
		this.applyRate = applyRate;
	}
	public Integer getAppleDeadline() {
		return applyDeadline;
	}
	public void setAppleDeadline(Integer applyDeadline) {
		this.applyDeadline = applyDeadline;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Integer getPreResult() {
		return preResult;
	}
	public void setPreResult(Integer preResult) {
		this.preResult = preResult;
	}
	public Date getPreDate() {
		return preDate;
	}
	public void setPreDate(Date preDate) {
		this.preDate = preDate;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getCheatType() {
		return cheatType;
	}
	public void setCheatType(String cheatType) {
		this.cheatType = cheatType;
	}
	public String getCheatContent() {
		return cheatContent;
	}
	public void setCheatContent(String cheatContent) {
		this.cheatContent = cheatContent;
	}
	public Date getCheatTime() {
		return cheatTime;
	}
	public void setCheatTime(Date cheatTime) {
		this.cheatTime = cheatTime;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getCreditCheckRst() {
		return creditCheckRst;
	}
	public void setCreditCheckRst(String creditCheckRst) {
		this.creditCheckRst = creditCheckRst;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Integer getBaseQuota() {
		return baseQuota;
	}
	public void setBaseQuota(Integer baseQuota) {
		this.baseQuota = baseQuota;
	}
	public Integer getEnableQuota() {
		return enableQuota;
	}
	public void setEnableQuota(Integer enableQuota) {
		this.enableQuota = enableQuota;
	}
	public Date getCreditCheckTime() {
		return creditCheckTime;
	}
	public void setCreditCheckTime(Date creditCheckTime) {
		this.creditCheckTime = creditCheckTime;
	}
	public Integer getCreditCheckRate() {
		return creditCheckRate;
	}
	public void setCreditCheckRate(Integer creditCheckRate) {
		this.creditCheckRate = creditCheckRate;
	}
	public Apply(String uuid, String userName, Integer gender,
			String phoneNum, Integer certificateType, String idCard,
			Integer industry, Integer companyType, Integer position,
			Integer education, String address, String contactName,
			String contactPhoneNum, String email, String iP, String lBS,
			String mACID, Integer workTime, Integer salary,
			Date bnRegisterTime, Integer bnOrderNum, String bnRecivePhone,
			Integer bnAllTimes, Integer bnAllMoney, Double bnBackRate,
			Integer bnMonthMoney, Double price, Double bnAvgPrice,
			Integer reciveAddr, String fitProduct, Integer applyMoney,
			Integer applyRepayTime, Integer applyRate, Integer applyDeadline,
			Date applyTime, Integer preResult, Date preDate, String userType,
			String cheatType, String cheatContent, Date cheatTime,
			Integer score, String creditCheckRst, Integer grade,
			Integer baseQuota, Integer enableQuota, Date creditCheckTime,
			Integer creditCheckRate) {
		this.uuid = uuid;
		this.userName = userName;
		this.gender = gender;
		this.phoneNum = phoneNum;
		this.certificateType = certificateType;
		this.idCard = idCard;
		this.industry = industry;
		this.companyType = companyType;
		this.position = position;
		this.education = education;
		this.address = address;
		this.contactName = contactName;
		this.contactPhoneNum = contactPhoneNum;
		this.email = email;
		this.IP = iP;
		this.LBS = lBS;
		this.MACID = mACID;
		this.workTime = workTime;
		this.salary = salary;
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
		this.fitProduct = fitProduct;
		this.applyMoney = applyMoney;
		this.applyRepayTime = applyRepayTime;
		this.applyRate = applyRate;
		this.applyDeadline = applyDeadline;
		this.applyTime = applyTime;
		this.preResult = preResult;
		this.preDate = preDate;
		this.userType = userType;
		this.cheatType = cheatType;
		this.cheatContent = cheatContent;
		this.cheatTime = cheatTime;
		this.score = score;
		this.creditCheckRst = creditCheckRst;
		this.grade = grade;
		this.baseQuota = baseQuota;
		this.enableQuota = enableQuota;
		this.creditCheckTime = creditCheckTime;
		this.creditCheckRate = creditCheckRate;
	}
	public Apply() {
	}
	
}
