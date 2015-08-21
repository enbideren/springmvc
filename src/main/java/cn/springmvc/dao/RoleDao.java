package cn.springmvc.dao;

import java.util.List;
import java.util.Map;

import cn.springmvc.model.Role;
import cn.springmvc.model.RoleMenu;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface RoleDao {
	List<Role> findList();

	List<Role> findList(String name);
	
	int roleNameExist(String name);
	
	int saveRole(Role o);

	Role getRoleById(int id);

	int delete(int id);
	
	int roleExist(int id);
	
	int deleteRoleMenu(int roleId);
	/**
	 * xxx
	 * @author JZR	
	 * @param int menuId,int roleId
	 * @return
	 */
	int saveRoleMenu(RoleMenu roleMenu); 
}
