package cn.springmvc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.model.TEntityItem;
import cn.springmvc.service.EntityItemService;
import cn.springmvc.util.BasePage;
import cn.springmvc.util.DroolsUtil;
import cn.springmvc.util.Result;
@Controller
@RequestMapping("/entity")
public class EntityItemController extends BaseController{
	
	private static final long serialVersionUID = 1L;
 
	@Resource
	private EntityItemService entityItemService;
	private BasePage basePage = new BasePage();
	private String entityItemName;//实体属性名称
	private TEntityItem entityItem;//实体对象
	private Integer typeId;
	
	private List<HashMap<String, String>> itemList;
	
	/**
	 * 展示实体属性
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("listEntityItem.do")
	public String listEntityItem(HttpServletRequest request,Model model)  throws Exception{
		basePage.installPageConfig(request);
		String typeId = request.getParameter("typeId");
		//当未传入实体id时，不做查询
		if (!StringUtils.isEmpty(typeId)) {
			basePage = entityItemService.getPageEntityItem(basePage,request.getParameter("entityItemName"),Integer.parseInt(typeId));		
		}
		model.addAttribute(basePage);
		return "entity/entityItemList";
	}
	/**
	 * 添加实体属性
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("addEntityItem.do")
	public String addEntityItem(Model model)  throws Exception{			
		entityItemService.saveEntityItem(entityItem);
		DroolsUtil.removeRuleMap();
		Result result = new Result();
		result.setMessage("添加成功");
		result.setCallbackType("closeCurrent");
		result.setForwardUrl("entity/listEntityItem");
		result.setNavTabId(rel);
		model.addAttribute(result);
		return null;
	}	
	/**
	 * 展示实体属性界面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("showItem.do")
	public String showItem() throws Exception{		
		return "showAdd";
	}
	/**
	 * 修改实体属性界面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("showEntityItem.do")
	public String showEntityItem() throws Exception{
		entityItem = entityItemService.getEntityItemById(entityItem.getId());
		return "showEntityItem";
	}
	/**
	 * 修改实体属性
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("updateEntityItem.do")
    public String updateEntityItem(Model model)  throws Exception{
		
		entityItemService.updateEntityItem(entityItem);
		DroolsUtil.removeRuleMap();
		Result result = new Result();
		result.setMessage("更新成功");
		result.setForwardUrl("entity/listEntityItem");
		result.setNavTabId(rel);
		model.addAttribute(result);
		return null;
	}
    /**
     * 删除实体属性
     * @return
     * @throws Exception
     */
	@RequestMapping("deleteEntityItem.do")
	public String deleteEntityItem(Model model)  throws Exception{
		Integer id=entityItem.getId();	
		entityItemService.deleteEntityItem(id);
		DroolsUtil.removeRuleMap();
		Result result = new Result();
		result.setCallbackType("");
		result.setMessage("删除成功");
		result.setForwardUrl("entity/listEntityItem");
		result.setNavTabId(rel);
		Map<String, String> r=new HashMap<String, String>();
		r.put("message", "删除成功");
		r.put("statusCode", "200");
		//r.put("navTabId", rel);
		r.put("callbackType", "forward");
		r.put("forwardUrl", "entity/listEntityItem");
		model.addAttribute(result);
		return null;
	}

//	/**
//	 * 
//	 * 列出实体属性，用于条件添加部分，此部分不需要分页
//	 * @return
//	 * @throws Exception
//	 * @author guolei
//	 * @version 1.0
//	 * @created 2013-4-15
//	 */
//	public String listItem()  throws Exception{
//		itemList = entityItemService.listEntityItem(entityItemName,typeId);		
//		return "entity_item";
//	}
	
	
	public BasePage getBasePage() {
		return basePage;
	}
	public void setBasePage(BasePage basePage) {
		this.basePage = basePage;
	}
	public String getEntityItemName() {
		return entityItemName;
	}
	public void setEntityItemName(String entityItemName) {
		this.entityItemName = entityItemName;
	}
	public TEntityItem getEntityItem() {
		return entityItem;
	}
	public void setEntityItem(TEntityItem entityItem) {
		this.entityItem = entityItem;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public List<HashMap<String, String>> getItemList() {
		return itemList;
	}
	public void setItemList(List<HashMap<String, String>> itemList) {
		this.itemList = itemList;
	}
	
}
