package cn.springmvc.dao;

import java.util.List;
import java.util.Map;

import cn.springmvc.model.TCondition;
import cn.springmvc.model.TEntity;
import cn.springmvc.model.TEntityItem;

/**
 * 实体dao接口层
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface ConditionDao {
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
	 * 保存实体
	 * 
	 * @param scene 场景类
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public void saveCondition(TCondition condition);
	/**
	 * 根据实体id查询实体
	 * 
	 * @param id
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public TEntity getEntityById(Integer id);
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
	public void updateEntity(TEntity entity);
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
	public void deleteSceneEntity(Integer sceneId);
	/**
	 * 得到实体列表
	 * 
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-11
	 */
	public List<TEntity> getEntityList();
	
	/**
	 * 根据itemName和typeId得到属性id
	 * 
	 * @param typeId
	 * @param itemName
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-15
	 */
	public Integer getCondition(Map map);
	/**
	 * 根据实体名称和实体属性
	 * 
	 * @param entityName
	 * @param itmeName
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-16
	 */
	public TEntityItem getItemByEntityAndItem(Map map);
	/**
	 * 根据条件id查询条件
	 * 
	 * @param conditionId
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-16
	 */
	public TCondition getConditionById(Integer conditionId);
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
	 * 根据实体条目id得到实体以及实体属性
	 * 
	 * @param entityItemId
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-18
	 */
	public TEntity getItemAndEntityByItemId(Integer entityItemId);
	/**
	 * 根据条件id删除条件
	 * 
	 * @param parseInt
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-19
	 */
	public void deleteCondition(int conditionId);
}
