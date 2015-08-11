package 
cn.springmvc.service;

import java.util.List;

import cn.springmvc.model.Menu;
import cn.springmvc.model.MenuNode;

public interface MenuService {
	List<Menu> getMenuList(String role);
	List<MenuNode> getRoleMenuList(int id);
	List<Menu> getMenuChildren();	
	boolean save(final Menu o);
}
