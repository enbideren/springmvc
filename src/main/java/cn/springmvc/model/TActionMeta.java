package cn.springmvc.model;


/**
 * 规则条件实体类
 * 
 * @author guolei
 * @version 1.0
 * @created 2013-4-9
 */
public class TActionMeta{
	private Integer id; //主键
	private String name;//动作类型名称
	private String methodC;//动作类型对应的方法
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
	
}