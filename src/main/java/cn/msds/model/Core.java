package cn.msds.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author JZR
 * @date 2015年9月1日
 * @Description 核心客户信息表
 * @version V1.0
 */
public class Core implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 客户号 */
	private String uuid;
	/** 姓名 */
	private String userName;
	/** 性别 	0-女；1-男；2-不详 */
	private Integer gender;
	/** 手机号 */
	private String phoneNum;
	/** 身份证号 */
	private String idCard;
	/** 邮箱 */
	private String email;
	/** 行业 	0-制造业；1-服务业；2-其他 */
	private Integer industry;
	/** 企业类型 	2-国企；0-私企；1-外资 */
	private Integer companyType;
	/** 职位	 	0-普通员工；1-经理及主管；2-企业法人、CEO */
	private Integer position;
	/** 学历 	0-高中、高职及以下；1-本科；2-研究生及以上 */
	private Integer education;
	/** 紧急联系人姓名 */
	private String contactName;
	/** 紧急联系人号码 */
	private String contactPhoneNum;
	/** 贷款余额 */
	private Integer loanBalance;
	/** 审批中贷款金额 */
	private Integer inCheckLoan;
	/** 客户分类 	A:企业高管，高级技术人员；B:高学历；C：其他客户 */
	private Integer userType;
	/** 工作年限	 	0.3年及以下；1.3到7年；2.7年及以上 */
	private Integer workTime;
	/** 年收入 */
	private Integer salary;
	/** 近1年最常用收货地址的城市等级 2-一线城市；1-二线城市；0-三线城市 */
	private Integer reciveAddr;
	/** 信用评分 */
	private Integer score;
	/** 评分等级 */
	private Integer grade;
	/** 消费类基本额度  */
	private Integer baseQuota;
	/** 消费类可用额度  */
	private Integer enableQuota;
	/** 授信日期 */
	private Date validTime;
	/** 授信有效期 */
	private Date validDays;
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
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public Integer getLoanBalance() {
		return loanBalance;
	}
	public void setLoanBalance(Integer loanBalance) {
		this.loanBalance = loanBalance;
	}
	public Integer getInCheckLoan() {
		return inCheckLoan;
	}
	public void setInCheckLoan(Integer inCheckLoan) {
		this.inCheckLoan = inCheckLoan;
	}
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
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
	public Integer getReciveAddr() {
		return reciveAddr;
	}
	public void setReciveAddr(Integer reciveAddr) {
		this.reciveAddr = reciveAddr;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
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
	public Date getValidTime() {
		return validTime;
	}
	public void setValidTime(Date validTime) {
		this.validTime = validTime;
	}
	public Date getValidDays() {
		return validDays;
	}
	public void setValidDays(Date validDays) {
		this.validDays = validDays;
	}
	
}
