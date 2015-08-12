package cn.springmvc.util;

/**
 * 
 * 规则引擎异常类
 *
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public class RuleEngineException extends Exception {
	
	private static final long serialVersionUID = 1037494946679958128L;
	private int errorCode;
	private String errorMsg;
	
	public RuleEngineException() {
		super();
	}
	
	public RuleEngineException(String messgae) {
		this.errorMsg = messgae;
	}
	
	public RuleEngineException(int errorCode,String messgae) {
		this.errorCode = errorCode;
		this.errorMsg = messgae;
	}
	/**
	 * @return the errorCode
	 */
	public int getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}
	/**
	 * @param errorMsg the errorMsg to set
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}
