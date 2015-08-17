package cn.springmvc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.model.TCondition;
import cn.springmvc.model.TEntity;
import cn.springmvc.service.ConditionService;
import cn.springmvc.util.BasePage;
import cn.springmvc.util.JsonUtil;
import cn.springmvc.util.Result;

/**
 * 条件action
 * 
 * @author guolei
 * @version 1.0
 * @created 2013-4-11
 */
@Controller
@Scope("prototype")
public class ConditionController  extends BaseController{

	private static final long serialVersionUID = 1L;

	@Resource
	private ConditionService conditionService;
	private BasePage basePage = new BasePage();
	private String conditionName;//条件名称
	private TCondition condition;//条件对象
	private List<TEntity> entityList;//实体列表，用于条件条件部分展示
	private String item;//前端item的id信息
	private String staticC;//前端静态变量id信息
	private String dynamic;//前端动态变量id信息
	
	/**
	 * 
	 * 展示条件
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public String listCondition()  throws Exception{
		basePage = conditionService.getPageCondition(basePage,conditionName);
		return "list_condition";
	}

	/**
	 * 展示条件添加页面
	 * 
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-11
	 */
	@RequestMapping("showAddCondition.do")
	public String showAddCondition(HttpServletResponse response,Model model,String rel) throws Exception{
		entityList = conditionService.getEntityList();
		return "add_condition";
	}
	/**
	 * 
	 * 添加条件
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	@RequestMapping("addCondition.do")
	public String addCondition(HttpServletResponse response,Model model,String rel)  throws Exception{
		
		conditionService.saveCondition(condition,item,staticC,dynamic);
		Result result = new Result();
		result.setMessage("添加成功");
		result.setNavTabId("entityList");
		JsonUtil.toJson(result, response);
		return null;
	}
	/**
	 * 展示实体
	 * 
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	@RequestMapping("showEntity.do")
	public String showEntity(HttpServletResponse response,Model model,String rel) throws Exception{
		//entity = sceneService.getEntityById(entity.getId());
		return "show";
	}

	/**
	 * 
	 * 更新实体
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	@RequestMapping("updateEntity.do")
	public String updateEntity(HttpServletResponse response,Model model,String rel)  throws Exception{
		
		//sceneService.updateEntity(entity);
		Result result = new Result();
		result.setMessage("添加成功");
		result.setNavTabId("entityList");
		JsonUtil.toJson(result, response);
		return null;
	}
	
	/**
	 * 
	 * 删除场景
	 * @return
	 * @throws Exception
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	@RequestMapping("deleteScene2.do")
	public String deleteScene(HttpServletResponse response,Model model,String rel)  throws Exception{
		
		conditionService.deleteScene(condition.getId());
		Result result = new Result();
		result.setCallbackType("");
		result.setMessage("删除成功");
		result.setNavTabId("sceneList");
		JsonUtil.toJson(result, response);
		return null;
	}
	
	public BasePage getBasePage() {
		return basePage;
	}
	public void setBasePage(BasePage basePage) {
		this.basePage = basePage;
	}

	public String getConditionName() {
		return conditionName;
	}

	public void setConditionName(String conditionName) {
		this.conditionName = conditionName;
	}

	public TCondition getCondition() {
		return condition;
	}

	public void setCondition(TCondition condition) {
		this.condition = condition;
	}

	public List<TEntity> getEntityList() {
		return entityList;
	}

	public void setEntityList(List<TEntity> entityList) {
		this.entityList = entityList;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getStaticC() {
		return staticC;
	}

	public void setStaticC(String staticC) {
		this.staticC = staticC;
	}

	public String getDynamic() {
		return dynamic;
	}

	public void setDynamic(String dynamic) {
		this.dynamic = dynamic;
	}

}
