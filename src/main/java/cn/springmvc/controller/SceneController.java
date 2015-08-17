package cn.springmvc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.model.Menu;
import cn.springmvc.model.TEntity;
import cn.springmvc.model.TScene;
import cn.springmvc.model.TSceneEntity;
import cn.springmvc.service.MenuService;
import cn.springmvc.service.SceneService;
import cn.springmvc.util.BasePage;
import cn.springmvc.util.DroolsUtil;
import cn.springmvc.util.JsonUtil;
import cn.springmvc.util.Result;

/**
 * @author JZR
 * @date 2015年8月15日
 * @Description xxx
 * @version V1.0
 */
@Controller
@RequestMapping("/scene")
public class SceneController  extends BaseController{

	private static final long serialVersionUID = 1L;
	@Resource
	private SceneService sceneService;
	@Resource
	private MenuService menuService;
	private String sceneName;//场景名称
	private String entityName;	
	private TScene scene;//场景对象
	private TSceneEntity sceneEntity; 	
	private Integer sceneId;	
	private Integer entityId;
	private List<TEntity> listEntity;
	private List<TEntity> listEntityScene;		
	private List<Map<String,Object>> entityList;
	private int entityIds[];
	public int[] getEntityIds() {
		return entityIds;
	}
	public void setEntityIds(int[] entityIds) {
		this.entityIds = entityIds;
	}
	public List<Map<String, Object>> getEntityList() {
		return entityList;
	}
	/**
	 * 
	 * 展示场景
	 * @return
	 * @throws Exception
	 * @author liuyaxin
	 * @version 1.0
	 * @created 2013-4-9
	 */
	@RequestMapping("listScene.do")
	public String listScene(HttpServletResponse response,Model model,String rel,BasePage basePage,TScene scene)  throws Exception{
		basePage = sceneService.getPageScene(basePage,scene.getName());
		model.addAttribute("rel", rel);
		model.addAttribute(basePage);
		return "scene/sceneList";
	}		
    /**
     * 查看场景实体
     * 
     * @return
     * @throws Exception
     * @author liuyaxin
     * @version 1.0
     * @created 2013-4-16
     */
	@RequestMapping("listEntityOfScene.do")
	public String listEntityOfScene(HttpServletResponse response,Model model,String rel,TScene scene)  throws Exception{
		entityList=sceneService.getSceneEntityList(scene.getId());
		model.addAttribute("rel", rel); 
		model.addAttribute("entityList",entityList);
		model.addAttribute("sceneId", scene.getId());
		//listEntity=sceneService.getEntityOfScene(sceneId);			
		return "scene/entitySceneList";
	}
	/**
	 * 
	 * 添加场景
	 * @return
	 * @throws Exception
	 * @author liuyaxin
	 * @version 1.0
	 * @created 2013-4-9
	 */
	@RequestMapping("addScene.do")
	public String addScene(HttpServletResponse response,Model model,String rel,TScene scene,HttpServletRequest request)  throws Exception{
		 String ids=request.getParameter("sceneEntity.entityIdArr");
		 List<Integer> entityIdList = new ArrayList<Integer>();
		 String[] ss=ids.split(",");
		 for(String s:ss){     
			 entityIdList.add(Integer.parseInt(s));	
		 }		 		
		 if(sceneService.getSceneByIdentify(scene.getIdentify())){
			Result result = new Result();
			result.setStatusCode("300");
			result.setMessage("标识名已存在");
			result.setCallbackType("");
			JsonUtil.toJson(result, response);
			return null;
		}	
		int maxSequence=menuService.getMenuChildren();	
		String sceneName=scene.getName(); 
		sceneService.saveScene(scene,entityIdList,sceneName,maxSequence);				
		Result result = new Result();
		result.setMessage("添加成功");
		result.setStatusCode("200");
		result.setNavTabId(rel);
		JsonUtil.toJson(result, response);
		return null;
	}
	/**
	 * 
	 * 添加场景对应的实体
	 * @return
	 * @throws Exception
	 * @author liuyaxin
	 * @version 1.0
	 * @created 2013-4-18
	 */
	@RequestMapping("addEntityScene.do")
	public String addEntityScene(HttpServletResponse response,Model model,String rel)  throws Exception{
		 String ids=sceneEntity.getEntityIdArr();		 
		 List<Integer> entityIdList = new ArrayList<Integer>();
		 String[] ss=ids.split(",");
		 for(String s:ss){     
			 entityIdList.add(Integer.parseInt(s));	
		 }	
	    Integer sceneId=sceneEntity.getSceneId();			  
		sceneService.saveEntityScene(sceneId,entityIdList);	
		DroolsUtil.removeRuleMap();
		Result result = new Result();
		result.setMessage("添加成功");		
		JsonUtil.toJson(result, response);
		return null;
	}
	/**
	 * 根据场景id查询场景
	 * 
	 * @return
	 * @throws Exception
	 * @author liuyaxin
	 * @version 1.0
	 * @created 2013-4-9
	 */
	@RequestMapping("showScene.do")
	public String showScene(HttpServletResponse response,Model model,String rel,TScene scene) throws Exception{	
		scene = sceneService.getSceneById(scene.getId());
		model.addAttribute("rel", rel);
		model.addAttribute("scene",scene);
		return "scene/updateScene";
	}
	/**
	 * 展示对场景添加实体的页面
	 * 
	 * @return
	 * @throws Exception
	 * @author liuyaxin
	 * @version 1.0
	 * @created 2013-4-18
	 */
	@RequestMapping("showAddEntityScene.do")
    public String showAddEntityScene(HttpServletResponse response,Model model,String rel) throws Exception{
		model.addAttribute("rel", rel);
    	return "showAddEntityScene";
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
	@RequestMapping("updateScene.do")
	public String updateScene(HttpServletResponse response,Model model,String rel,TScene scene)  throws Exception{
		
		sceneService.updateScene(scene);
		DroolsUtil.removeRuleMap();
		Result result = new Result();
		result.setMessage("修改成功");
		result.setNavTabId(rel);
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
	@RequestMapping("deleteScene.do")
	public String deleteScene(HttpServletResponse response,Model model,String rel,TScene scene)  throws Exception{
		scene=sceneService.getSceneById(scene.getId());		
		sceneService.deleteScene(scene.getId(),scene.getName());	
		DroolsUtil.removeRuleMap(scene.getIdentify());
		Result result = new Result();
		result.setCallbackType("");
		result.setMessage("删除成功");
		result.setNavTabId(rel);
		JsonUtil.toJson(result, response);
		return null;
	}
	/**
	 * 
	 * 删除场景实体
	 * @return
	 * @throws Exception
	 * @author liuyaxin
	 * @version 1.0
	 * @created 2013-4-17
	 */
	@RequestMapping("deleteEntiyScene.do")
	public String deleteEntiyScene(HttpServletResponse response,Model model,String rel) throws Exception{
		sceneService.deleteEntityScene(sceneId,entityId);
		DroolsUtil.removeRuleMap();
		Result result = new Result();
		result.setCallbackType("");
		result.setMessage("删除成功");
		JsonUtil.toJson(result, response);
		return null;
	}
	
	/**
	 * 
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @throws Exception 
	 * @created 2013-4-19
	 */
	@RequestMapping("saveEntityList.do")
	public String saveEntityList(HttpServletResponse response,Model model,String rel,HttpServletRequest request) throws Exception{
		String[] entityId = request.getParameterValues("entityIds");
		int [] entityIds = new int[entityId.length];
		for (int i = 0; i < entityId.length; i++) {
			entityIds[i] = Integer.parseInt(entityId[i]);
		}
		String sceneId = request.getParameter("sceneId");
		Result r=new Result();
		//TODO 校验是否保存成功
		sceneService.saveSceneEntity(entityIds, Integer.parseInt(sceneId));
		DroolsUtil.removeRuleMap();
		r.setMessage("关联实体成功！");
		r.setNavTabId(rel);
		JsonUtil.toJson(r, response);
		return null;
	}
	
	/**
	 * 
	 * 在场景中查询实体列表
	 * @return
	 * @author liuyaxin
	 * @version 1.0
	 * @created 2013-4-17
	 */
	@RequestMapping("listEntityScene.do")
	public String listEntityScene(HttpServletResponse response,Model model,String rel){
		List<TEntity> listEntityScene = sceneService.getEntity();
		model.addAttribute("listEntityScene",listEntityScene);
		return "scene/entityList";
	}
	
	public BasePage getBasePage() {
		return basePage;
	}

	public void setBasePage(BasePage basePage) {
		this.basePage = basePage;
	}

	public String getSceneName() {
		return sceneName;
	}

	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

	public TScene getScene() {
		return scene;
	}

	public void setScene(TScene scene) {
		this.scene = scene;
	}

	public Integer getSceneId() {
		return sceneId;
	}

	public void setSceneId(Integer sceneId) {
		this.sceneId = sceneId;
	}
	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public List<TEntity> getListEntity() {
		return listEntity;
	}

	public void setListEntity(List<TEntity> listEntity) {
		this.listEntity = listEntity;
	}

	public TSceneEntity getSceneEntity() {
		return sceneEntity;
	}
	public void setSceneEntity(TSceneEntity sceneEntity) {
		this.sceneEntity = sceneEntity;
	}
	public List<TEntity> getListEntityScene() {
		return listEntityScene;
	}
	public void setListEntityScene(List<TEntity> listEntityScene) {
		this.listEntityScene = listEntityScene;
	}
	public Integer getEntityId() {
		return entityId;
	}
	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}
	
}
