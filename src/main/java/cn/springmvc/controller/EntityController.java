package cn.springmvc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.model.TEntity;
import cn.springmvc.service.EntityItemService;
import cn.springmvc.service.EntityService;
import cn.springmvc.util.BasePage;
import cn.springmvc.util.JsonUtil;
import cn.springmvc.util.Result;

@Controller
@RequestMapping("/entity")
public class EntityController  extends BaseController{
	
	private static final long serialVersionUID = 1L;

	@Resource
	private EntityService entityService;
	@Resource
	private EntityItemService entityItemService;
	private String entityName;//实体名称
	private TEntity entity;//实体对象
	
	public EntityItemService getEntityItemService() {
		return entityItemService;
	}

	public void setEntityItemService(EntityItemService entityItemService) {
		this.entityItemService = entityItemService;
	}

	/**
	 * 
	 * 展示实体
	 * @return
	 * @throws Exception
	 * @author JZR
	 * @version 1.0
	 * @created 2015-08-13
	 */
	@RequestMapping("listEntity.do")
	public String listEntity(HttpServletRequest request,Model model)  throws Exception{
		basePage.installPageConfig(request);
		basePage = entityService.getPageEntity(basePage,request.getParameter("entityName"));
		model.addAttribute(basePage);
		return "entity/entityList";
	}

	/**
	 * 
	 * 添加实体
	 * @return
	 * @throws Exception
	 * @author JZR
	 * @version 1.0
	 * @created 2015-08-13
	 */
	@RequestMapping("addEntity.do")
	public String addEntity(Model model,TEntity entity,HttpServletResponse response)  throws Exception{
		if(entityService.getEntityByIdentify(entity.getIdentify())){
			Result result = new Result();
			result.setStatusCode("300");
			result.setMessage("标识名已存在");
			result.setCallbackType("");
			JsonUtil.toJson(result, response);
			return null;
		}
		
		entityService.saveEntity(entity);
		Result result = new Result();
		result.setMessage("添加成功");
		result.setStatusCode("200");
		result.setNavTabId(rel);
		JsonUtil.toJson(result, response);
		return null;
	}
	/**
	 * 展示实体
	 * 
	 * @return
	 * @throws Exception
	 * @author JZR
	 * @version 1.0
	 * @created 2015-08-13
	 */
	@RequestMapping("showEntity.do")
	public String showEntity(Model model,TEntity entity) throws Exception{
		entity = entityService.getEntityById(entity.getId());
		model.addAttribute("entity",entity);
		return "/entity/updateEntity";
	}

	/**
	 * 
	 * 更新实体
	 * @return
	 * @throws Exception
	 * @author JZR
	 * @version 1.0
	 * @created 2015-08-13
	 */
	@RequestMapping("updateEntity.do")
	public String updateEntity(Model model,TEntity entity,HttpServletResponse response)  throws Exception{
		entityService.updateEntity(entity);
		Result result = new Result();
		result.setMessage("更新成功");
		result.setNavTabId(rel);
		JsonUtil.toJson(result, response);
		return null;
	}
	
	/**
	 * 
	 * 删除实体
	 * @return
	 * @throws Exception
	 * @author JZR
	 * @version 1.0
	 * @created 2015-08-13
	 */
	@RequestMapping("deleteEntity.do")
	public String deleteEntity(Model model,TEntity entity,HttpServletResponse response)  throws Exception{
		int count=entityItemService.getEntityItemCount(entity.getId());
		Result result = new Result();
		if(count>0){
			result.setCallbackType("");
			result.setStatusCode("300");
			result.setMessage("请先删除相关属性！");
			result.setNavTabId(rel);
			JsonUtil.toJson(result, response);
			return null;
		}
		entityService.deleteEntity(entity.getId());
		result.setCallbackType("");
		result.setMessage("删除成功");
		result.setNavTabId(rel);
		JsonUtil.toJson(result, response);
		return null;
	}
	
	public BasePage getBasePage() {
		return basePage;
	}

	public void setBasePage(BasePage basePage) {
		this.basePage = basePage;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public TEntity getEntity() {
		return entity;
	}

	public void setEntity(TEntity entity) {
		this.entity = entity;
	}
	
}
