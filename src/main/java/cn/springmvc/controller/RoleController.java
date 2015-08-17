package cn.springmvc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.model.MenuNode;
import cn.springmvc.model.Role;
import cn.springmvc.service.MenuService;
import cn.springmvc.service.RoleService;
import cn.springmvc.util.JsonUtil;
import cn.springmvc.util.Result;

@Repository("roleAction")
@Scope("prototype")
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
	public String save(HttpServletResponse response,Model model,String rel) throws Exception{
		Result r=new Result();
		if(role==null){
			r.setStatusCode("300");
			r.setMessage("请输入数据！");
			JsonUtil.toJson(r, response);
			return null;
		}
		if(role.getId()==0){
			if(!roleService.roleNameExist(role.getName())){
				boolean success=roleService.save(role,oldName);
				if(success){
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
					roleService.save(role);
				}else if(!roleService.roleNameExist(role.getName())){
					if(roleService.save(role)){
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
//		return SUCCESS;
		return null;
	}
	@RequestMapping("menu.do")
	public String menu(HttpServletResponse response,Model model,String rel){
		List<MenuNode> list=menuService.getRoleMenuList(role.getId());
//		ActionContext.getContext().put("nodes", list);
//		return SUCCESS;
		return null;
	}
	@RequestMapping("right.do")
	public String right(HttpServletResponse response,Model model,String rel) throws Exception{
		Result r=new Result();
		if(menuIds!=null){
			String[] idsStr=menuIds.split(",");
			int num=roleService.saveRoleMenu(idsStr, roleId);
			
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
	public String get(HttpServletResponse response,Model model,String rel){
		role=roleService.getRoleById(role.getId());
//		return SUCCESS;
		return null;
	}
	@RequestMapping("del.do")
	public String del(HttpServletResponse response,Model model,String rel) throws Exception{
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
	@RequestMapping("execute.do")
	public String execute(HttpServletResponse response,Model model,String rel){
		List<Role> roles=null;
		if(role!=null&&role.getName()!=null){
			roles=roleService.findList(role.getName());
		}else{
			roles=roleService.findList();
		}
//		ActionContext ctx=ActionContext.getContext();
//		ctx.put("roles", roles);
		return null;
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
