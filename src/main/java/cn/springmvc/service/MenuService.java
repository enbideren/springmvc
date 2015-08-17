package 
cn.springmvc.service;

import java.util.List;

import cn.springmvc.model.Menu;
import cn.springmvc.model.MenuNode;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface MenuService {
	List<Menu> getMenuList(String role);
	List<MenuNode> getRoleMenuList(int id);
	int getMenuChildren();	
	boolean save(final Menu o);
}
