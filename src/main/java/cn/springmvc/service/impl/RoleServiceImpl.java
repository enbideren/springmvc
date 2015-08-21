package cn.springmvc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import cn.springmvc.dao.RoleDao;
import cn.springmvc.model.Role;
import cn.springmvc.model.RoleMenu;
import cn.springmvc.service.RoleService;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Repository("roleService")
public class RoleServiceImpl implements RoleService {

	@Resource
	private RoleDao roleDao;
	@Override
	public List<Role> findList() {
		return roleDao.findList();
	}
	public RoleDao getRoleDao() {
		return roleDao;
	}
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}
	@Override
	public List<Role> findList(String name) {
		return roleDao.findList(name);
	}
	@Override
	public boolean roleNameExist(String name) {
		if(name==null){
			return false;
		}
		return (roleDao.roleNameExist(name))>0?true:false;
	}
	@Override
	public int saveRole(Role o) {
		return roleDao.saveRole(o);
		/*if(o.getId()>0){
			if(o.getName().equals(oldName)){
				roleDao.save(o);
			}else{
				
			}
		}*/
	}
	
	public Role getRoleById(int id){
		return roleDao.getRoleById(id);
	}
	@Override
	public boolean delete(int id) {
		if(id<=0){
			return false;
		}else if(roleDao.roleExist(id)>0){
			deleteRoleMenu(id);
			int result = roleDao.delete(id);
			return result>0?true:false;
		}else{
			return false;
		}
	}
	@Override
	public boolean deleteRoleMenu(int roleId) {
		int result = roleDao.deleteRoleMenu(roleId);
		return result>0?true:false;
	}
	@Override
	public int saveRoleMenu(String[] menuIds, int roleId) {
		int i=0;
		if(deleteRoleMenu(roleId)){
			for(String menuIdStr:menuIds){
				if(menuIdStr.length()>0){
					int menuId=Integer.parseInt(menuIdStr);
					RoleMenu roleMenu = new RoleMenu();
					roleMenu.setMenuId(menuId);
					roleMenu.setRoleId(roleId);
					i+=roleDao.saveRoleMenu(roleMenu);
				}
			}
		}
		return i;
	}
	
}
