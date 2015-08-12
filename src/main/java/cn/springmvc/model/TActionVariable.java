package cn.springmvc.model;

import java.io.Serializable;


/**
 * 动作对应的变量的值中间表
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public class TActionVariable implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; //主键
	private Integer actionId;//动作id
	private Integer variableId;//变量id
	private String variableValue;//动作值
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getActionId() {
		return actionId;
	}
	public void setActionId(Integer actionId) {
		this.actionId = actionId;
	}
	public Integer getVariableId() {
		return variableId;
	}
	public void setVariableId(Integer variableId) {
		this.variableId = variableId;
	}
	public String getVariableValue() {
		return variableValue;
	}
	public void setVariableValue(String variableValue) {
		this.variableValue = variableValue;
	}
	
}