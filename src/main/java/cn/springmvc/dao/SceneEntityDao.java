package cn.springmvc.dao;

import java.util.List;
import java.util.Map;

public interface SceneEntityDao {

	List<Map<String,Object>> findEntityList(int sid);
	
	void deleteEntityList(int id);
	
	int saveSceneEntity(Map map);
}
