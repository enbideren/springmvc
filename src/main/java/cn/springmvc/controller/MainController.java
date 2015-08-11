package cn.springmvc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.model.User;
import cn.springmvc.service.UserService;

@Controller
@RequestMapping("/")
public class MainController {
	@Resource(name = "userService")
	private UserService userService;
	@RequestMapping("index")
	public String index(){
		System.out.println(111);
		return "index";
	}
	@RequestMapping("index.do")
	public String test(){
		User user = new User();
		user.setEmployeeid("111");
		user.setIdcardnr("123");
		user.setName("º∆À„∑®");
		user.setGender("sd");
		user.setPhonenumber("17712855887");
		System.out.println(userService.insertUser(user));
		return "index";
	}
	
}
