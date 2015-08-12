package cn.springmvc.model;

import java.io.Serializable;
/**
 * 角色实体类
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */

public class Role implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id=0;
	private String name;
	private String description;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
