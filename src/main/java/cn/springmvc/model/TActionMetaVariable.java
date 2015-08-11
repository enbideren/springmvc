package cn.springmvc.model;


/**
 * 规则条件实体类
 * 
 * @author guolei
 * @version 1.0
 * @created 2013-4-9
 */
public class TActionMetaVariable{
	private Integer id; //主键
	private String name;//动作类型变量名称
	private String identify;//动作类型变量标识
	private Integer actionMetaId;//动作类型id
	private TActionVariable tActionVariable;
	
	public TActionVariable gettActionVariable() {
		return tActionVariable;
	}
	public void settActionVariable(TActionVariable tActionVariable) {
		this.tActionVariable = tActionVariable;
	}
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
		this.identify = identify.trim();
	}
	public Integer getActionMetaId() {
		return actionMetaId;
	}
	public void setActionMetaId(Integer actionMetaId) {
		this.actionMetaId = actionMetaId;
	}
}