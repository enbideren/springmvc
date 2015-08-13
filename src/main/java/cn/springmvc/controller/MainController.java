package cn.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.model.Menu;
import cn.springmvc.service.MenuService;
import cn.springmvc.service.UserService;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Controller
@RequestMapping("/")
public class MainController {
	@Resource(name = "userService")
	private UserService userService;
	@Resource
	private MenuService menuService;
	@RequestMapping("index")
	public String index(){
		System.out.println(111);
		return "index";
	}
	@RequestMapping("index.do")
	public String test(Model model){
		String role="sa";
		List<Menu> list=menuService.getMenuList(role);
		List<Menu> listNew=new ArrayList<Menu>();
		
		for (Menu menu : list) {
			if (menu.getParentId()==0) {
				for (Menu menu2 : list) {
					if (menu2.getParentId()==menu.getId()) {
						menu.getChildren().add(menu2);
					}
				}
				listNew.add(menu);
			}
		}
		model.addAttribute("menus", listNew);
		return "main/index";
	}
	
}
