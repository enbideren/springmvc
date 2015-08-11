package com.hxrainbow.rule.model;

public class TestUser {
	private Integer id;//主键
	private String name;//字段显示名称
	private Integer point;//字段
		
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name.trim();
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	
	
	
}
