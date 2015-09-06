package cn.msds.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author JZR
 * @date 2015年9月1日
 * @Description 还款计划表
 * @version V1.0
 */
public class BackPlan implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	/**还款计划编号 */
	private Integer repayId;
	/**交易号 */
	private Integer dealId;
	/** 客户号 */
	private String uuid;
	/**还款日 */
	private Date time;
	/**还款金额 */
	private Integer backMoney;
	/**期数 	 	第几期*/
	private Integer RepayTime;
	/**还款状态 */
	private Integer backState;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRepayId() {
		return repayId;
	}
	public void setRepayId(Integer repayId) {
		this.repayId = repayId;
	}
	public Integer getDealId() {
		return dealId;
	}
	public void setDealId(Integer dealId) {
		this.dealId = dealId;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Integer getBackMoney() {
		return backMoney;
	}
	public void setBackMoney(Integer backMoney) {
		this.backMoney = backMoney;
	}
	public Integer getRepayTime() {
		return RepayTime;
	}
	public void setRepayTime(Integer repayTime) {
		RepayTime = repayTime;
	}
	public Integer getBackState() {
		return backState;
	}
	public void setBackState(Integer backState) {
		this.backState = backState;
	}
	
}
