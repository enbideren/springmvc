package cn.springmvc.model;


/**
 * 
 * 规则引擎场景实体类
 * 
 * @author guolei
 * @version 1.0
 * @created 2013-4-9
 */
public class TScene {
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