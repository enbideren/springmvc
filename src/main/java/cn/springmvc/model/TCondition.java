package cn.springmvc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 规则条件实体类
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public class TCondition implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; //主键
	private String name;//条件名称
	private Date dateEntered;//创建日期
	private Date dateModified;//修改日期
	private Integer typeId;//条件类型
	private String conditionC;//条件
	private String description;//条件描述
	
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

	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getConditionC() {
		return conditionC;
	}
	public void setConditionC(String conditionC) {
		this.conditionC = conditionC;
	}

}