package cn.springmvc.model;


/**
 * 
 * 实体属性
 *
 * @author guolei
 * @version 1.0
 * @created 2013-4-9 上午10:46:46
 * @history 
 * @see
 */
public class TEntityItem{
	private Integer id;//主键
	private String name;//字段显示名称
	private String field;//字段
	private Integer typeId;//实体类型id
	private String description;
	private TEntity entity;
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
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public TEntity getEntity() {
		return entity;
	}
	public void setEntity(TEntity entity) {
		this.entity = entity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}