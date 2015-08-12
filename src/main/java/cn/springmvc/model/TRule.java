package cn.springmvc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 规则表
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public class TRule implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;//主键
	private String name;//规则名称
	private Date dateEntered;//创建时间
	private Date dateModified;//修改时间
	private Integer sceneId; //场景
	private String conditionC;//规则条件
	private String action;//动作
	private Integer enabled;//是否启用 1表示启用 2表示不启动
	private Date begin;//规则开始时间
	private Date end;//规则结束时间
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateEntered() {
		return dateEntered;
	}
	public void setDateEntered(Date dateEntered) {
		this.dateEntered = dateEntered;
	}
	public Date getDateModified() {
		return dateModified;
	}
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	public Integer getSceneId() {
		return sceneId;
	}
	public void setSceneId(Integer sceneId) {
		this.sceneId = sceneId;
	}
	public String getAction() {
		return action;
	}
	public String getConditionC() {
		return conditionC;
	}
	public void setConditionC(String conditionC) {
		this.conditionC = conditionC;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Integer getEnabled() {
		return enabled;
	}
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}
	public Date getBegin() {
		return begin;
	}
	public void setBegin(Date begin) {
		this.begin = begin;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
}