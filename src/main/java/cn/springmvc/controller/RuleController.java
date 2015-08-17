package cn.springmvc.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.model.TEntity;
import cn.springmvc.model.TRule;
import cn.springmvc.service.EntityItemService;
import cn.springmvc.service.RuleService;
import cn.springmvc.service.SceneService;
import cn.springmvc.util.BasePage;
import cn.springmvc.util.JsonUtil;
import cn.springmvc.util.Result;

/**
 * 变量类action
 * 
 * @author guolei
 * @version 1.0
 * @created 2013-4-15
 */
@Controller
@RequestMapping("/rule")
public class RuleController extends BaseController {

	private static final long serialVersionUID = 1L;
	
	@Resource
	private RuleService ruleService;
	@Resource
	private SceneService sceneService;
	@Resource
	private EntityItemService  entityItemService;
	
	private Integer sceneId;//场景id
	
	private List<TEntity> entityList;
	
	private Integer entityId;//实体id
	private String itemName;//搜索时的item名字
	
	private List<HashMap<String, String>> itemList;
	
	private List<String> actionList;
	
	private TRule rule;
	
	private HashMap<String, String> actionMap;
	
	private int flag;
	
	private String itemInput;//应该往哪个input填入值
	
	private Integer variableId;
	
	/**
	 * 
	 * 跳转到规则添加页面
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-15
	 */
	@RequestMapping("showAddRule.do")
	public String showAddRule(HttpServletResponse response,Model model,String rel,TRule rule)  throws Exception{
		model.addAttribute("rel", rel);
		model.addAttribute("sceneId", rule.getSceneId());
		return "rule/addRule";
	}
	
	/**
	 * 跳转到实体属性列表页面
	 * 
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-16
	 */
	@RequestMapping("showItemRule.do")
	public String showItemRule(HttpServletResponse response,Model model,String rel,String itemName, Integer entityId,Integer sceneId) throws Exception{
		entityList = sceneService.getEntityOfScene(sceneId);
		itemList = entityItemService.listEntityItem(itemName,entityId,sceneId);	
		model.addAttribute("rel",rel);
		model.addAttribute("entityList",entityList);
		model.addAttribute("itemList",itemList);
		return "rule/itemList";
	}

	/**
	 * 添加规则
	 * 
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-16
	 */
	@RequestMapping("addRule.do")
	public String addRule(HttpServletResponse response,Model model,String rel) throws Exception{
		
		
		if(rule.getBegin() != null && rule.getEnd() != null && rule.getBegin().getTime() > rule.getEnd().getTime()){
			Result result = new Result();
			result.setStatusCode("300");
			result.setMessage("开始日期应该小于结束日期");
			JsonUtil.toJson(result, response);
			return null;	
		}
		try{
			ruleService.addRule(rule,actionList);
		}catch(Exception e){
			Result result = new Result();
			result.setStatusCode("300");
			result.setMessage("添加失败，请检查规则条件");
			result.setNavTabId(rel);
			JsonUtil.toJson(result, response);
			return null;
		}
		Result result = new Result();
		result.setMessage("添加成功");
		result.setNavTabId(rel);
		JsonUtil.toJson(result, response);
		return null;
	}
	/**
	 * 查看规则详情
	 * 
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-17
	 */
	@RequestMapping("showRule.do")
	public String showRule(HttpServletResponse response,Model model,String rel) throws Exception{
		rule = ruleService.getRuleById(rule.getId());//得到规则的信息，包括条件信息，用于修改页面展示
		actionMap = ruleService.getActionInfo(rule.getAction());
		return "show_rule";
	}
	/**
	 * 查看规则
	 * 
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-16
	 */
	@RequestMapping("listRule.do")
	public String listRule(HttpServletResponse response,Model model,String rel,TRule rule,BasePage basePage) throws Exception{
		if(rule == null ){
			rule = new TRule();
		}
		basePage = ruleService.listPageRule(basePage,rule.getSceneId(),rule.getName(),rule.getEnabled());
		model.addAttribute("rel", rel);
		model.addAttribute("basePage",basePage);
		model.addAttribute("rule",rule);
		return "rule/ruleList";
	}
	
	/**
	 * 查看规则更新
	 * 
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-16
	 */
	@RequestMapping("showUpdateRule.do")
	public String showUpdateRule(HttpServletResponse response,Model model,String rel) throws Exception{
		rule = ruleService.getRuleById(rule.getId());//得到规则的信息，包括条件信息，用于修改页面展示
		actionMap = ruleService.getActionInfo(rule.getAction());
		return "show_update";
	}
	
	/**
	 * 规则更新
	 * 
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-16
	 */
	@RequestMapping("updateRule.do")
	public String updateRule(HttpServletResponse response,Model model,String rel) throws Exception{
		ruleService.updateRule(rule,actionList);
		Result result = new Result();
		result.setNavTabId(rel);
		result.setMessage("修改成功");
		JsonUtil.toJson(result, response);
		return null;
	}
	
	/**
	 * 删除规则
	 * 
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-16
	 */
	@RequestMapping("deleteRule.do")
	public String deleteRule(HttpServletResponse response,Model model,String rel) throws Exception{
		ruleService.deleteRule(rule.getId());
		Result result = new Result();
		result.setCallbackType("");
		result.setReload("1");
		result.setMessage("删除成功");
		//result.setForwardUrl("rule/listRule");
		//result.setNavTabId(rel);
		JsonUtil.toJson(result, response);
		return null;
	}
	
	/**
	 * 修改规则的启用状态
	 * 
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-5-8
	 */
	@RequestMapping("updateEnabledRule.do")
	public String updateEnabledRule(HttpServletResponse response,Model model,String rel) throws Exception{
		ruleService.updateEnabledRule(rule);
		Result result = new Result();
		result.setCallbackType("");
		result.setReload("1");
		result.setMessage("修改成功");
		JsonUtil.toJson(result, response);
		return null;
	}
	
	public Integer getSceneId() {
		return sceneId;
	}

	public void setSceneId(Integer sceneId) {
		this.sceneId = sceneId;
	}

	public List<TEntity> getEntityList() {
		return entityList;
	}

	public void setEntityList(List<TEntity> entityList) {
		this.entityList = entityList;
	}

	public Integer getEntityId() {
		return entityId;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public List<HashMap<String, String>> getItemList() {
		return itemList;
	}

	public void setItemList(List<HashMap<String, String>> itemList) {
		this.itemList = itemList;
	}

	public TRule getRule() {
		return rule;
	}

	public void setRule(TRule rule) {
		this.rule = rule;
	}

	public List<String> getActionList() {
		return actionList;
	}

	public void setActionList(List<String> actionList) {
		this.actionList = actionList;
	}

	public BasePage getBasePage() {
		return basePage;
	}

	public void setBasePage(BasePage basePage) {
		this.basePage = basePage;
	}

	public HashMap<String, String> getActionMap() {
		return actionMap;
	}

	public void setActionMap(HashMap<String, String> actionMap) {
		this.actionMap = actionMap;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getItemInput() {
		return itemInput;
	}

	public void setItemInput(String itemInput) {
		this.itemInput = itemInput;
	}

	public Integer getVariableId() {
		return variableId;
	}

	public void setVariableId(Integer variableId) {
		this.variableId = variableId;
	}
	
}
