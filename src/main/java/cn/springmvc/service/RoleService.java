package cn.springmvc.service;

import java.util.List;

import cn.springmvc.model.Role;

/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface RoleService {
	List<Role> findList();

	List<Role> findList(String name);

	boolean roleNameExist(String name);

	int saveRole(final Role o);

	Role getRoleById(int id);

	boolean delete(int id);

	boolean deleteRoleMenu(int roleId);

	int saveRoleMenu(String[] menuIds, int roleId);

}
