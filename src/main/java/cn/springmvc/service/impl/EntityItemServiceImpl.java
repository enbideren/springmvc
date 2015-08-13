package cn.springmvc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.springmvc.dao.EntityItemDao;
import cn.springmvc.model.TEntityItem;
import cn.springmvc.service.EntityItemService;
import cn.springmvc.util.BasePage;
import cn.springmvc.util.StringKit;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Service("entityItemService")
@Transactional
public class EntityItemServiceImpl implements EntityItemService{
	@Resource
	private EntityItemDao entityItemDao;
	
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public BasePage getPageEntityItem(BasePage basePage, String entityItemName,Integer typeId) {
		Map map =basePage.getPaging(); 
		map.put("name", entityItemName);
		map.put("typeId", typeId);
		basePage.setList(entityItemDao.findPageDataByHql(map));
		basePage.setRecordNum(entityItemDao.findTotalCount(map));	
		
		return basePage;
	}
    /**
     * 保存实体
     */
	@Override
	public void saveEntityItem(TEntityItem entityItem) {
		entityItemDao.saveEntityItem(entityItem);
	}
    /**
     * 根据id查询实体属性
     */
	@Override
	public TEntityItem getEntityItemById(Integer id) {
		return entityItemDao.getEntityItemById(id);
	}
	/**
	 * 根据实体id查询实体属性
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public List getEntityByTypeId(Integer typeId) {
		List<TEntityItem> list = entityItemDao.getEntityItemByTypeId(typeId);
		return list;
		
	}
    /**
     * 更新实体属性
     */
	@Override
	public void updateEntityItem(TEntityItem entityItem) {
		entityItemDao.updateEntityItem(entityItem);
		
	}
    /**
     * 删除实体属性
     */
	@Override
	public void deleteEntityItem(Integer id) {
		entityItemDao.deleteEntityItem(id);
	}
	/**
	 * 
	 * 根据实体类型查找实体属性或者根据实体类型和实体名称查找实体
	 * @param entityItemName
	 * @param typeId
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-15
	 */
	@SuppressWarnings("unchecked")
	public List<HashMap<String,String>> listEntityItem(String entityItemName, Integer typeId,Integer sceneId){
		StringBuffer hql=new StringBuffer("select new map(entity.name as entityName,item.name as itemName,item.description as description,item.id as itemId) from TEntityItem item,TEntity entity,TSceneEntity middle where middle.entityId = entity.id and entity.id = item.typeId");
		if(StringKit.isNotEmpty(entityItemName)){
			  hql.append(" and item.name like '" + entityItemName + "'");
		}
		if(typeId != null && typeId != 0){
			hql.append(" and item.typeId = " + typeId);
		}
		if(sceneId != null && sceneId != 0){
			hql.append(" and middle.sceneId = " + sceneId);
		}
		List<HashMap<String,String>> list = entityItemDao.findDataByHql(hql.toString());
		return list;
	}
	@Override
	public int getEntityItemCount(Integer typeId) {
		
		return entityItemDao.getEntityItemCount(typeId);
	}

}
