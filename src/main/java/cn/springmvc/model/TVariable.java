package cn.springmvc.model;

import java.io.Serializable;

/**
 * 变量实体类
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public class TVariable implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;//主键
	private String name;//变量名称
	private String defaultValue;//默认值
	private Integer type;//类型  1字符型 2数字型 3 日期型 4 动态
	private Integer dynamicId;//动态变量id
	
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
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getDynamicId() {
		return dynamicId;
	}
	public void setDynamicId(Integer dynamicId) {
		this.dynamicId = dynamicId;
	}
}