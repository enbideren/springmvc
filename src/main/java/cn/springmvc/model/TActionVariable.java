package cn.springmvc.model;


/**
 * 动作对应的变量的值中间表
 * 
 * @author guolei
 * @version 1.0
 * @created 2013-4-9
 */
public class TActionVariable{
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