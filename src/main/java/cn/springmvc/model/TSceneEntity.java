package cn.springmvc.model;


/**
 * 
 * 场景实体中间表
 *
 * @author guolei
 * @version 1.0
 * @created 2013-4-9 上午10:24:16
 * @history 
 * @see
 */
public class TSceneEntity{
	private Integer id;                                     //主键
	private Integer entityId;                               //实体id
	private Integer sceneId;                              //场景id
	private String entityIdArr;
	private String entityName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEntityId() {
		return entityId;
	}
	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}
	public Integer getSceneId() {
		return sceneId;
	}
	public void setSceneId(Integer sceneId) {
		this.sceneId = sceneId;
	}
	public String getEntityIdArr() {
		return entityIdArr;
	}
	public void setEntityIdArr(String entityIdArr) {
		this.entityIdArr = entityIdArr;
	}
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	
}