package cn.springmvc.dao;

import java.util.List;
import java.util.Map;

import cn.springmvc.model.TEntity;

/**
 * 实体dao接口层
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface EntityDao {
	
	
	/**
	 * 根据hql查询记录数，用于分页
	 * 
	 * @param hql
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-17
	 */
	public int findTotalCount(Map map);
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
	public List findPageDataByHql(Map map) ;
	/**
	 * 保存实体
	 * 
	 * @param entity
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public void saveEntity(TEntity entity);
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
	 * 根据标识查询实体
	 * 
	 * @param identify
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public List<TEntity> getEntityByIdentify(String identify);
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
	public void deleteEntity(Integer id);
	
}
