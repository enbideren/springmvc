package cn.msds.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author JZR
 * @date 2015年9月1日
 * @Description 评分记录表
 * @version V1.0
 */
public class CreditCheck implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	/** 进件号 */
	private Integer applyId;
	/** 客户号 */
	private String uuid;
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
	public Integer getApplyId() {
		return applyId;
	}
	public void setApplyId(Integer applyId) {
		this.applyId = applyId;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
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
	
}
