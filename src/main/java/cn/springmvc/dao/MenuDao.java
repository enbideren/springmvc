package cn.springmvc.dao;

import java.util.List;

import cn.springmvc.model.Menu;
import cn.springmvc.model.MenuNode;

public interface MenuDao {
	List<Menu> getMenuList(String role);
	List<MenuNode> getRoleMenuList(int id);
	public List<Menu> getMenuChildren();	
    boolean save(final Menu m);
    public void saveMenuRole(String sceneName);       
    public void deleteMenu(String sceneName);
}
