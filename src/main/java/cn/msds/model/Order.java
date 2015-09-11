package cn.msds.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author JZR
 * @date 2015年9月1日
 * @Description 订单表
 * @version V1.0
 */
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	/** 进件号*/
	private Integer applyId;
	/** 客户号 */
	private String uuid;
	/** 订单状态  1-待初审、2-初审通过、3-初审不通过、4-不需复审、5-待复审、6-待抽审、7-通过可放款、8-拒绝*/
	private Integer orderState;
	/** 订单创建时间 */
	private Date orderCreateTime;
	/** 申请金额 */
	private Double replyMoney;
	/** 申请期数 */
	private Integer replyTimes;
	/** 定价利率 */
	private Double replyRate;
	/** 批复期限 */
	private Integer replyDeadline;
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
	public Integer getOrderState() {
		return orderState;
	}
	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}
	public Date getOrderCreateTime() {
		return orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}
	public Double getReplyMoney() {
		return replyMoney;
	}
	public void setReplyMoney(Double replyMoney) {
		this.replyMoney = replyMoney;
	}
	public Integer getReplyTimes() {
		return replyTimes;
	}
	public void setReplyTimes(Integer replyTimes) {
		this.replyTimes = replyTimes;
	}
	public Double getReplyRate() {
		return replyRate;
	}
	public void setReplyRate(Double replyRate) {
		this.replyRate = replyRate;
	}
	public Integer getReplyDeadline() {
		return replyDeadline;
	}
	public void setReplyDeadline(Integer replyDeadline) {
		this.replyDeadline = replyDeadline;
	}
	
}
