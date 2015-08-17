package cn.springmvc.dao;

import java.util.List;
import java.util.Map;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface SceneEntityDao {

	List<Map<String,Object>> findEntityList(int sid);
	
	void deleteEntityList(int id);
	
	void saveSceneEntity(Map map);
}
