package cn.msds.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author JZR
 * @date 2015年9月1日
 * @Description 交易表
 * @version V1.0
 */
public class Deal implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	/** 订单号*/
	private Integer orderId;
	/** 客户号 */
	private String uuid;
	/**会员服务协议编号 */
	private String serviceId;
	/**贷后管理服务协议编号 */
	private String handleId;
	/**委托授权协议编号 */
	private String grantId;
	/**还款计划编号 */
	private String repayId;
	/** 起息日 */
	private Date startTime; 
	/** 到期日 */
	private Date endTime; 
	/**金额 */
	private Integer loanMoney;
	/**期限 */
	private Integer deadline;
	/**期数 */
	private Integer loanRepayTimes;
	/**利率 */
	private Integer loanRate;
	/**交易生成时间 */
	private Date dealTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getHandleId() {
		return handleId;
	}
	public void setHandleId(String handleId) {
		this.handleId = handleId;
	}
	public String getGrantId() {
		return grantId;
	}
	public void setGrantId(String grantId) {
		this.grantId = grantId;
	}
	public String getRepayId() {
		return repayId;
	}
	public void setRepayId(String repayId) {
		this.repayId = repayId;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Integer getLoanMoney() {
		return loanMoney;
	}
	public void setLoanMoney(Integer loanMoney) {
		this.loanMoney = loanMoney;
	}
	public Integer getDeadline() {
		return deadline;
	}
	public void setDeadline(Integer deadline) {
		this.deadline = deadline;
	}
	public Integer getLoanRepayTimes() {
		return loanRepayTimes;
	}
	public void setLoanRepayTimes(Integer loanRepayTimes) {
		this.loanRepayTimes = loanRepayTimes;
	}
	public Integer getLoanRate() {
		return loanRate;
	}
	public void setLoanRate(Integer loanRate) {
		this.loanRate = loanRate;
	}
	public Date getDealTime() {
		return dealTime;
	}
	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}
	
}
