package cn.springmvc.model;

import java.io.Serializable;

/**
 * 规则条件实体类
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public class TFlow implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; //主键
	private String name;//规则流名称
	private String url;//规则流入口
	
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}