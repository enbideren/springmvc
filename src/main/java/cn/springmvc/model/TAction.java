package cn.springmvc.model;

import java.util.Date;

/**
 * 规则条件实体类
 * 
 * @author guolei
 * @version 1.0
 * @created 2013-4-9
 */
public class TAction{
	private Integer id; //主键
	private String name;//动作名称
	private Date dateEntered;//创建日期
	private Date dateModified;//修改日期
	private Integer typeId;//动作类型
	private String description;//值描述
	
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
	
}