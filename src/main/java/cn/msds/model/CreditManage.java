package cn.msds.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author JZR
 * @date 2015年9月1日
 * @Description 信审记录表
 * @version V1.0
 */
public class CreditManage implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 订单号*/
	private Integer orderId;
	/** 审批阶段  	1-初审；2-抽审；3-复审*/
	private Integer verifyStep;
	/** 审批结果 	 -1-未抽审，0-不通过,1-通过*/
	private Integer verifyResult;
	/** 审批时间 */
	private Date verifyTime;
	/** 操作号 */
	private Integer operateNum;
	/** 审批标志  	A-信用风险,Q-欺诈风险,T-主动取消,C-无法联系*/
	private String verifyMark;
	/** 审批备注 */
	private String verifyContent;
	
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getVerifyStep() {
		return verifyStep;
	}
	public void setVerifyStep(Integer verifyStep) {
		this.verifyStep = verifyStep;
	}
	public Integer getVerifyResult() {
		return verifyResult;
	}
	public void setVerifyResult(Integer verifyResult) {
		this.verifyResult = verifyResult;
	}
	public Date getVerifyTime() {
		return verifyTime;
	}
	public void setVerifyTime(Date verifyTime) {
		this.verifyTime = verifyTime;
	}
	public Integer getOperateNum() {
		return operateNum;
	}
	public void setOperateNum(Integer operateNum) {
		this.operateNum = operateNum;
	}
	public String getVerifyMark() {
		return verifyMark;
	}
	public void setVerifyMark(String verifyMark) {
		this.verifyMark = verifyMark;
	}
	public String getVerifyContent() {
		return verifyContent;
	}
	public void setVerifyContent(String verifyContent) {
		this.verifyContent = verifyContent;
	}
}
