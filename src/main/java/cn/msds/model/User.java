package cn.msds.model;

import java.io.Serializable;

/**
 * @author JZR
 * @date 2015年9月1日
 * @Description 用户表单
 * @version V1.0
 */
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 姓名*/
	private String userName;
	/** 身份证号 */
	private String idCard;
	/** 性别 	0-女；1-男；2-不详 */
	private Integer gender;
	/** 申请人手机号 */
	private String phoneNum;
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
	/** 邮箱 */
	private String email;
	/** 工作年限	 	0.3年及以下；1.3到7年；2.7年及以上 */
	private Integer workTime;
	/** 年收入 */
	private Integer salary;
	/** 申请金额 */
	private Integer applyMoney;
	/** 申请期数 */
	private Integer applyRepayTime;
	private String ip; 
	private String lBS;
	private String mACID;
	public User() {
	}

	public User(String userName, String idCard, Integer gender,
			String phoneNum, Integer industry, Integer companyType,
			Integer position, Integer education, String contactName,
			String contactPhoneNum, String email, Integer workTime,
			Integer salary, Integer applyMoney, Integer applyRepayTime) {
		this.userName = userName;
		this.idCard = idCard;
		this.gender = gender;
		this.phoneNum = phoneNum;
		this.industry = industry;
		this.companyType = companyType;
		this.position = position;
		this.education = education;
		this.contactName = contactName;
		this.contactPhoneNum = contactPhoneNum;
		this.email = email;
		this.workTime = workTime;
		this.salary = salary;
		this.applyMoney = applyMoney;
		this.applyRepayTime = applyRepayTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Integer getApplyMoney() {
		return applyMoney;
	}

	public void setApplyMoney(Integer applyMoney) {
		this.applyMoney = applyMoney;
	}

	public Integer getApplyRepayTime() {
		return applyRepayTime;
	}

	public void setApplyRepayTime(Integer applyRepayTime) {
		this.applyRepayTime = applyRepayTime;
	}

	public User( Integer salary) {
		this.salary = salary;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getlBS() {
		return lBS;
	}

	public void setlBS(String lBS) {
		this.lBS = lBS;
	}

	public String getmACID() {
		return mACID;
	}

	public void setmACID(String mACID) {
		this.mACID = mACID;
	}

}