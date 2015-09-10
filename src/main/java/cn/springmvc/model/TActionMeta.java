package cn.springmvc.model;

import java.io.Serializable;


/**
 * 规则条件实体类
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public class TActionMeta implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; //主键
	private String name;//动作类型名称
	private String methodC;//动作类型对应的方法
	private String classC;//动作类型对应的类
	private String description;
	
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
	public String getMethodC() {
		return methodC;
	}
	public void setMethodC(String methodC) {
		this.methodC = methodC;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getClassC() {
		return classC;
	}
	public void setClassC(String classC) {
		this.classC = classC;
	}
	
}