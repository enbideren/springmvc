package cn.springmvc.controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.model.TActionMeta;
import cn.springmvc.model.TActionMetaVariable;
import cn.springmvc.model.TVariable;
import cn.springmvc.service.ActionMetaService;
import cn.springmvc.util.BasePage;
import cn.springmvc.util.DroolsUtil;
import cn.springmvc.util.JsonUtil;
import cn.springmvc.util.Result;

/**
 * @author JZR
 * @date 2015年8月14日
 * @Description xxx
 * @version V1.0
 */
@Controller
@RequestMapping("/action")
public class ActionMetaController extends BaseController{
	private static final long serialVersionUID = 1L;
	@Resource
	private ActionMetaService actionMetaService;
	private String actionMetaName;//实体名称	
	private TActionMeta actionMeta;//实体对象
	private List<TActionMeta> list;//用于添加规则部分的动作类型展示
	private Integer flag = 0;//标示条件添加部分是否有附加值，默认没有
	private String sceneId;
	private Integer is_update;
	private List<String> variable;
	private List<TActionMetaVariable> variableList;
	
	/**
	 * 获取动作类型列表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("listActionMeta.do")
	public String listActionMeta(HttpServletResponse response,Model model,String rel,BasePage basePage)  throws Exception{
		basePage = actionMetaService.getPageActionMeta(basePage,actionMetaName);
		model.addAttribute("rel", rel);
		model.addAttribute(basePage);
		return "action/actionMetaList";
	}
	/**
	 * 在条件部分添加动作时展示所有的动作类型
	 * 
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-16
	 */
	@RequestMapping("ruleActionMeta.do")
	public String ruleActionMeta(HttpServletResponse response,Model model,String rel) throws Exception{
		list = actionMetaService.getActionMetaList();
		return "rule_meta";
	}
	
	/**
	 * 展示添加动作页面
	 * 
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-16
	 */
	@RequestMapping("showAddAction.do")
	public String showAddAction(HttpServletResponse response,Model model,String rel) throws Exception{
		actionMeta = actionMetaService.getActionMetaById(actionMeta.getId());
		variableList = actionMetaService.getActionMetaVariableById(actionMeta.getId());
		return "add_action";
	}
	/**
	 * 添加动作类型
	 * 
	 * @return
	 * @throws Exception	
	 * @version 1.0
	 * @created 2013-4-16
	 */
	@RequestMapping("addActionMeta.do")
	public String addActionMeta(HttpServletResponse response,Model model,String rel,TActionMeta actionMeta,HttpServletRequest request)  throws Exception{
	    String [] variables = request.getParameterValues("variable");
	    List<String> variable = new ArrayList<String>();
	    for (int i = 0; i < variables.length; i++) {
	    	variable.add(variables[i]);
		}
		actionMetaService.saveActionMeta(actionMeta,variable);
		Result result = new Result();
		result.setMessage("添加成功");
		result.setNavTabId(rel);
		JsonUtil.toJson(result, response);
		return null;
	}
	/**
	 * 展示动作类型，用于修改
	 * @return
	 * @throws Exception	
	 * @version 1.0
	 * @created 2013-4-16
	 */
	@RequestMapping("showActionMeta.do")
	public String showActionMeta(HttpServletResponse response,Model model,String rel,TActionMeta actionMeta) throws Exception{
		actionMeta = actionMetaService.getActionMetaById(actionMeta.getId());
		variableList = actionMetaService.getActionMetaVariableById(actionMeta.getId());
		model.addAttribute("actionMeta",actionMeta);
		model.addAttribute("variableList",variableList);
		return "action/updateActionMeta";
	}	
	/**
	 * 展示动作类型
	 * @return
	 * @throws Exception	
	 * @version 1.0
	 * @created 2013-4-16
	 */
	@RequestMapping("viewActionMeta.do")
	public String viewActionMeta(HttpServletResponse response,Model model,String rel) throws Exception{
		actionMeta = actionMetaService.getActionMetaById(actionMeta.getId());
		variableList = actionMetaService.getActionMetaVariableById(actionMeta.getId());
		return "view";
	}	
	/**
	 * 修改动作类型
	 * @return
	 * @throws Exception	
	 * @version 1.0
	 * @created 2013-4-16
	 */
	@RequestMapping("updateActionMeta.do")
	public String updateActionMeta(HttpServletResponse response,Model model,String rel,TActionMeta actionMeta,HttpServletRequest request)  throws Exception{
		String [] variables = request.getParameterValues("variable");
	    List<String> variable = new ArrayList<String>();
	    for (int i = 0; i < variables.length; i++) {
	    	variable.add(variables[i]);
		}	
	    actionMetaService.updateActionMeta(actionMeta,variable);
	    DroolsUtil.removeRuleMap();
		Result result = new Result();
		result.setMessage("修改成功");
		result.setNavTabId(rel);
		JsonUtil.toJson(result, response);
		return null;
	}	
	/**
	 * 删除动作类型根据id
	 * 
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-16
	 */
	@RequestMapping("deleteActionMeta.do")
	public String deleteActionMeta(HttpServletResponse response,Model model,String rel,TActionMeta actionMeta)  throws Exception{
		actionMetaService.deleteActionMeta(actionMeta.getId());
		Result result = new Result();
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
	public String getActionMetaName() {
		return actionMetaName;
	}
	public void setActionMetaName(String actionMetaName) {
		this.actionMetaName = actionMetaName;
	}
	public TActionMeta getActionMeta() {
		return actionMeta;
	}
	public void setActionMeta(TActionMeta actionMeta) {
		this.actionMeta = actionMeta;
	}
	public List<TActionMeta> getList() {
		return list;
	}
	public void setList(List<TActionMeta> list) {
		this.list = list;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public String getSceneId() {
		return sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}
	public Integer getIs_update() {
		return is_update;
	}
	public void setIs_update(Integer is_update) {
		this.is_update = is_update;
	}
	public List<String> getVariable() {
		return variable;
	}
	public void setVariable(List<String> variable) {
		this.variable = variable;
	}
	public List<TActionMetaVariable> getVariableList() {
		return variableList;
	}
	public void setVariableList(List<TActionMetaVariable> variableList) {
		this.variableList = variableList;
	}
	
}
