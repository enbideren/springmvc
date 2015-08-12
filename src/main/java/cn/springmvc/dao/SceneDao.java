package cn.springmvc.dao;

import java.util.List;
import java.util.Map;

import cn.springmvc.model.TEntity;
import cn.springmvc.model.TRule;
import cn.springmvc.model.TScene;
import cn.springmvc.model.TSceneEntity;

/**
 * 实体dao接口层
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface SceneDao {
	/**
	 * 根据指定的hql语句去查询对应的营销活动，并返回list
	 *
	 * @param hql
	 * @return
	 *
	 */
	@SuppressWarnings("rawtypes")
	public List findDataByHql(String hql);
	/**
	 * 根据给定的条件去查询对应的页数上的数据
	 *
	 * @param page
	 * @param pageSize
	 * @param hql
	 * @return
	 *
	 */
	@SuppressWarnings("rawtypes")
	public List findPageDataByHql(final int page,final int pageSize, final String hql) ;
	/**
	 * 保存场景
	 * 
	 * @param scene 场景类
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public void saveScene(TScene scene);
	/**
	 * 保存场景实体
	 * 
	 * @param sceneId
	 * @param entityId
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-16
	 */
	public void saveSceneEntity(Map map);
	
	/**
	 * 根据实体id查询实体
	 * 
	 * @param id
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public TScene getSceneById(Integer id);
	/**
	 * 根据标识查询场景
	 * 
	 * @param identify
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public List<TEntity> getSceneByIdentify(String identify);
	
	/**
	 * 更新实体
	 * 
	 * @param entity
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public void updateScene(TScene scene);
	/**
	 * 删除实体
	 * 
	 * @param id
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public void deleteScene(Integer id);
	
	/**
	 * 删除实体场景
	 * @param sceneId
	 */
	public void deleteSceneEntity(Map map);
	/**
	 * 得到场景对应的实体
	 * 
	 * @param sceneId
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-15
	 */
	public List<TEntity> getEntityOfScene(Integer sceneId);
	/**
	 * 查询实体
	 * 
	 * @return
	 * @author liuyaxin
	 * @version 1.0
	 * @created 2013-4-17
	 */
	public List<TEntity> getEntity();
	/**
	 * 根据hql查询记录数，用于分页
	 * 
	 * @param hql
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-17
	 */
	public Long findTotalCount(final String hql);
	/**
	 * 根据场景标识查询实体信息
	 * 
	 * @param scene
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-18
	 */
	public List<TEntity> getEntityOfSceneByIdentity(String sceneIdentity);
	/**
	 * 根据场景标识获取可用的规则信息
	 * 
	 * @param scene
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-18
	 */
	public List<TRule> getEnabledRuleBySceneIdentity(String scene);
	/**
	 * 根据场景id删除场景的中间表信息
	 * 
	 * @param sceneId
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-19
	 */
	public void deleteSceneEntityByEntityId(final Integer sceneId);
	/**
	 * 
	 * 查询场景实体中间表中的 个数根据sceneId，entityId
	 * @param sceneId
	 * @param entityId
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-19
	 */
	public List<TSceneEntity> listEntityScene(Map map);
}
