package cn.springmvc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.springmvc.dao.MenuDao;
import cn.springmvc.dao.SceneDao;
import cn.springmvc.dao.SceneEntityDao;
import cn.springmvc.model.Menu;
import cn.springmvc.model.TEntity;
import cn.springmvc.model.TRule;
import cn.springmvc.model.TScene;
import cn.springmvc.model.TSceneEntity;
import cn.springmvc.service.SceneService;
import cn.springmvc.util.BasePage;
import cn.springmvc.util.StringKit;

@Service("sceneService")
@Transactional
public class SceneServiceImpl implements SceneService {

	@Resource
	private SceneDao sceneDao;
	@Resource
	private MenuDao menuDao;
	@Resource
	private SceneEntityDao sceneEntityDao;

	/**
	 * 实体查询以及列表
	 */
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public BasePage getPageScene(BasePage basePage, String sceneName) {

		StringBuffer hql = new StringBuffer("from TScene where 1=1");
		if (StringKit.isNotEmpty(sceneName)) {
			hql.append(" and name like '" + sceneName + "'");
		}
		basePage.setList(sceneDao.findPageDataByHql(basePage.getPage(),
				basePage.getPageSize(), hql.toString()));
		basePage.setRecordNum(sceneDao.findTotalCount(
				hql.insert(0, "select count(*) ").toString()).intValue());
		return basePage;
	}

	/**
	 * 保存场景
	 * 
	 * @param entity
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	@Override
	public void saveScene(TScene scene, List<Integer> idList, String sceneName,
			List<Menu> children) {
		sceneDao.saveScene(scene);
		Integer sceneId = sceneDao.getSceneByIdentify(scene.getIdentify()).get(0).getId();

		for (Menu i : children) {
			Integer squence = i.getSequence();
			Integer squenceMax = squence + 1;
			String url = "rule/listRule?sceneId=" + sceneId;
			String image = "images/icons/default.png";
			Menu menu = new Menu();
			menu.setName(sceneName);
			menu.setUrl(url);
			menu.setImage(image);
			menu.setParentId(2);
			menu.setSequence(squenceMax);
			menuDao.save(menu);
		}
		menuDao.saveMenuRole(sceneName);
		for (Integer entityId : idList) {
			Map map = new HashMap();
			map.put("sceneId", sceneId);
			map.put("entityId", entityId);
			sceneDao.saveSceneEntity(map);
		}
	}

	/**
	 * 根据实体id查询实体
	 * 
	 * @param id
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public TScene getSceneById(Integer id) {
		return sceneDao.getSceneById(id);
	}

	/**
	 * 根据标识名查询实体
	 * 
	 * @param identify
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	@Override
	public boolean getSceneByIdentify(String identify) {

		List<TEntity> list = sceneDao.getSceneByIdentify(identify);
		if (list == null || list.size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * 删除场景，1.删除场景 2.删除中间表数据
	 * 
	 * @param id
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	@Override
	public void deleteScene(Integer sceneId,String sceneName) {
		sceneDao.deleteScene(sceneId);
		sceneDao.deleteSceneEntityByEntityId(sceneId);
		menuDao.deleteMenu(sceneName);
				
				
	}

	/**
	 * 得到场景对应的实体
	 * 
	 * @param sceneId
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-15
	 */
	public List<TEntity> getEntityOfScene(Integer sceneId) {

		return sceneDao.getEntityOfScene(sceneId);
	}

	public List<Map<String, Object>> getSceneEntityList(int sid) {
		List<Map<String, Object>> list = sceneEntityDao.findEntityList(sid);
		return list;
	}

	@Override
	public void updateScene(TScene scene) {
		sceneDao.updateScene(scene);
	}

	/**
	 * 删除场景实体
	 */
	@Override
	public void deleteEntityScene(Integer sceneId, Integer entityId) {
		Map map = new HashMap();
		map.put("sceneId", sceneId);
		map.put("entityId", entityId);
		sceneDao.deleteSceneEntity(map);
	}

	/**
	 * 查询实体列表
	 */
	@Override
	public List<TEntity> getEntity() {
		return sceneDao.getEntity();
	}

	/**
	 * 对单个场景进行添加一个或多个实体
	 */
	@Override
	public void saveEntityScene(Integer sceneId, List<Integer> idList) {

		for (Integer entityId : idList) {
			Map map = new HashMap();
			map.put("sceneId", sceneId);
			map.put("entityId", entityId);
			List<TSceneEntity> listEntity = sceneDao.listEntityScene(map);
			if (listEntity.size() == 0) {
				sceneDao.saveSceneEntity(map);
			}
		}

	}

	/**
	 * 根据场景标识获取可用的规则信息
	 * 
	 * @param scene
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-18
	 */
	public List<TRule> getEnabledRuleBySceneIdentity(String scene) {
		return sceneDao.getEnabledRuleBySceneIdentity(scene);
	}

	/**
	 * 根据场景标识查询实体信息
	 * 
	 * @param scene
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-18
	 */
	@Override
	public List<TEntity> getEntityOfSceneByIdentity(String sceneIdentity) {
		return sceneDao.getEntityOfSceneByIdentity(sceneIdentity);
	}

	/**
	 * 场景中间表的重复的关系根据sceneId，entityID查找
	 * 
	 */
	@Override
	public List<TSceneEntity> listEntityScene(Integer sceneId, Integer entityId) {
		Map map = new HashMap();
		map.put("sceneId", sceneId);
		map.put("entityId", entityId);
		return sceneDao.listEntityScene(map);
	}

	public void setSceneEntityDao(SceneEntityDao sceneEntityDao) {
		this.sceneEntityDao = sceneEntityDao;
	}

	@Override
	public void deleteEntityScene(Integer sceneId) {
		sceneEntityDao.deleteEntityList(sceneId);
	}

	@Override
	public int saveSceneEntity(int[] entityIds, int sceneId) {
		int i = 0;
		//TODO
		System.out.println("执行了saveSceneEntity方法!");
//		if (sceneEntityDao.deleteEntityList(sceneId) >= 0) {
//			if (entityIds != null) {
//				for (int eid : entityIds) {
//					i += sceneEntityDao.saveSceneEntity(eid, sceneId);
//				}
//			}
//		}
		return i;
	}

}
