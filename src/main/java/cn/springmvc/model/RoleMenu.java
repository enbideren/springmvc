package cn.springmvc.model;

import java.io.Serializable;

/**
 * 角色实体类
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */

public class RoleMenu implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id = 0;
	private Integer roleId;
	private Integer menuId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

}
