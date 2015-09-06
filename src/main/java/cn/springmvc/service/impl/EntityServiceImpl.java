package cn.springmvc.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.springmvc.dao.EntityDao;
import cn.springmvc.model.TEntity;
import cn.springmvc.service.EntityService;
import cn.springmvc.util.BasePage;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Service("entityService")
@Transactional
public class EntityServiceImpl implements EntityService {

	@Resource
	private EntityDao entityDao;

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	@Override
	public BasePage getPageEntity(BasePage basePage, String entityName) {
		Map map =basePage.getPaging(); 
		map.put("name", entityName);
		basePage.setList(entityDao.findPageDataByHql(map));
		basePage.setRecordNum(entityDao.findTotalCount(map));
		return basePage;
	}

	/**
	 * 保存实体
	 * 
	 * @param entity
	 * @return
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	@Override
	public void saveEntity(TEntity entity) {
		entityDao.saveEntity(entity);
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
	public TEntity getEntityById(Integer id) {
		return entityDao.getEntityById(id);
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
	public boolean getEntityByIdentify(String identify) {
		List<TEntity> list = entityDao.getEntityByIdentify(identify);
		if (list == null || list.size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * 更新实体
	 * 
	 * @param entity
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	public void updateEntity(TEntity entity) {
		entityDao.updateEntity(entity);
	}

	/**
	 * 删除实体
	 * 
	 * @param id
	 * @author guolei
	 * @version 1.0
	 * @created 2013-4-9
	 */
	@Override
	public void deleteEntity(Integer id) {
		entityDao.deleteEntity(id);
	}
}
