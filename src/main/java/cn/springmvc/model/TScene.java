package cn.springmvc.model;

import java.io.Serializable;


/**
 * 
 * 规则引擎场景实体类
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public class TScene implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;                                     //主键
	private String name;                                  //场景名称
	private String identify;                              //场景标识
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
	public String getIdentify() {
		return identify;
	}
	public void setIdentify(String identify) {
		this.identify = identify;
	}
	
}