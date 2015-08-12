package cn.springmvc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 实体
 *
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public class TEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;//主键
	private String name;//实体名称(显示名称)
	private String identify;//实体标识
	private String packageC;//包名
	private List<TEntityItem> prorperties=new ArrayList<TEntityItem>();
	private TEntityItem tEntityItem;
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
	public String getPackageC() {
		return packageC;
	}
	public void setPackageC(String packageC) {
		this.packageC = packageC;
	}
	public List<TEntityItem> getProrperties() {
		return prorperties;
	}
	public void setProrperties(List<TEntityItem> prorperties) {
		this.prorperties = prorperties;
	}
	public String getEntityClazz(){
		int index =  packageC.lastIndexOf(".");
		return packageC.substring(index+1);
	}
	public TEntityItem gettEntityItem() {
		return tEntityItem;
	}
	public void settEntityItem(TEntityItem tEntityItem) {
		this.tEntityItem = tEntityItem;
	}
	
}