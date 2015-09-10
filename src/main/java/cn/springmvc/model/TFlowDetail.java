package cn.springmvc.model;

import java.io.Serializable;

/**
 * 规则条件实体类
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public class TFlowDetail implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id; //主键
	private Integer flowId;//规则流id
	private Integer sceneId;//规则组id
	private String sceneName;//规则组id
	private Integer num;//顺序号
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getFlowId() {
		return flowId;
	}
	public void setFlowId(Integer flowId) {
		this.flowId = flowId;
	}
	public Integer getSceneId() {
		return sceneId;
	}
	public void setSceneId(Integer sceneId) {
		this.sceneId = sceneId;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getSceneName() {
		return sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}
}