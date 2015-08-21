package cn.springmvc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.model.MenuNode;
import cn.springmvc.model.Role;
import cn.springmvc.service.MenuService;
import cn.springmvc.service.RoleService;
import cn.springmvc.util.JsonUtil;
import cn.springmvc.util.Result;

@Repository("roleAction")
@RequestMapping("/role")
public class RoleController extends BaseController {

	private static final long serialVersionUID = 1L;
	
	private Role role=new Role();
	
	private String oldName;
	
	private String menuIds;
	private int roleId;
	
	private String node;
	
	public void setNode(String node) {
		this.node = node;
	}
	public String getOldName() {
		return oldName;
	}
	public void setOldName(String oldName) {
		this.oldName = oldName;
	}

	@Resource
	private RoleService roleService;
	@Resource
	private MenuService menuService;
	
	public MenuService getMenuService() {
		return menuService;
	}
	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}
	@RequestMapping("save.do")
	public String save(HttpServletResponse response,Model model,String rel,Role role,String oldName,String roleId) throws Exception{
		if (!StringUtils.isEmpty(roleId)) {
			role.setId(Integer.parseInt(roleId));
		}
		Result r=new Result();
		if(role==null){
			r.setStatusCode("300");
			r.setMessage("请输入数据！");
			JsonUtil.toJson(r, response);
			return null;
		}
		if(role.getId()==0){
			if(!roleService.roleNameExist(role.getName())){
				int success=roleService.saveRole(role);
				if(success>0){
					r.setStatusCode("200");
					r.setMessage("添加角色成功！");
					r.setCallbackType("closeCurrent");
					
				}else{
					r.setStatusCode("300");
					r.setMessage("添加角色失败！");
					r.setCallbackType("");
				}
				r.setNavTabId(rel);
				
			}else{
				r.setStatusCode("300");
				r.setMessage("角色名称已经存在，请重新填写！");
				r.setCallbackType("");
				r.setNavTabId(rel);
			}
		}else{
			if(oldName!=null){
				if(oldName.equals(role.getName())){
					roleService.saveRole(role);
				}else if(!roleService.roleNameExist(role.getName())){
					if(roleService.saveRole(role)>0){
						r.setStatusCode("200");
						r.setMessage("修改角色成功！");
						r.setCallbackType("closeCurrent");
					}else{
						r.setMessage("修改角色失败！");
						r.setStatusCode("300");
						r.setCallbackType("");
					}
				}else{
					r.setStatusCode("300");
					r.setMessage("角色名称已经存在，请重新填写！");
					r.setCallbackType("");
				}
			}
		}
		r.setNavTabId(rel);
		JsonUtil.toJson(r, response);
		return null;
	}
	@RequestMapping("add.do")
	public String add(HttpServletResponse response,Model model,String rel){
		model.addAttribute("rel", rel);
		return "role/info";
	}
	@RequestMapping("menu.do")
	public String menu(HttpServletResponse response,Model model,String rel){
		List<MenuNode> list=menuService.getRoleMenuList(role.getId());
		model.addAttribute("list", list);
		model.addAttribute("rel", rel);
		return "role/menu";
	}
	@RequestMapping("right.do")
	public String right(HttpServletResponse response,Model model,String rel,String roleId) throws Exception{
		Integer roleIds = null;
		if (!StringUtils.isEmpty(roleId)) {
			roleIds = Integer.parseInt(roleId);
		}
		Result r=new Result();
		if(menuIds!=null){
			String[] idsStr=menuIds.split(",");
			int num=roleService.saveRoleMenu(idsStr, roleIds);
			
			if(num>0){
				r.setMessage("角色权限设置成功！");
				r.setStatusCode("200");
				r.setCallbackType("");
			}else{
				r.setMessage("角色权限设置失败！");
				r.setStatusCode("300");
				r.setCallbackType("");
			}
		}
		JsonUtil.toJson(r, response);
		return null;
	}
	@RequestMapping("get.do")
	public String get(HttpServletResponse response,Model model,String rel,Role role){
		role=roleService.getRoleById(role.getId());
		model.addAttribute("rel", rel);
		model.addAttribute("role", role);
		return "role/info";
	}
	@RequestMapping("del.do")
	public String del(HttpServletResponse response,Model model,String rel,Role role) throws Exception{
		Result r=new Result();
		r.setNavTabId(rel);
		if(role==null){
			r.setStatusCode("300");
			r.setCallbackType("");
			
			r.setMessage("删除角色失败！");
		}else{
			if(role.getId()==0){
				r.setStatusCode("300");
				r.setCallbackType("");
				r.setMessage("删除角色失败！");
			}else{
				if(roleService.delete(role.getId())){
					r.setStatusCode("200");
					r.setCallbackType("");
					r.setMessage("删除角色成功！");
				}else{
					r.setStatusCode("300");
					r.setCallbackType("");
					r.setMessage("删除角色失败！角色可能不存在！");
				}
			}
		}
		JsonUtil.toJson(r, response);
		return null;
	}
	@RequestMapping("list.do")
	public String list(HttpServletResponse response,Model model,String rel,Role role){
		List<Role> roles=null;
		if(role!=null&&!StringUtils.isEmpty(role.getName())){
			roles=roleService.findList(role.getName());
		}else{
			roles=roleService.findList();
		}
		model.addAttribute("rel", rel);
		model.addAttribute("roles", roles);
		model.addAttribute("role", role);
		return "role/index";
	}

	public RoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	public void setMenuIds(String menuIds) {
		this.menuIds = menuIds;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	
	
}
