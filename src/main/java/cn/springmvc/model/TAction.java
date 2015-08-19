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
public class TAction implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; //主键
	private String name;//动作名称
	private Date dateEntered;//创建日期
	private Date dateModified;//修改日期
	private Integer actionMetaId;//动作类型
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
	
	public Integer getActionMetaId() {
		return actionMetaId;
	}
	public void setActionMetaId(Integer actionMetaId) {
		this.actionMetaId = actionMetaId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}