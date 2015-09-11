package cn.msds.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.msds.dao.CoreDao;
import cn.msds.model.Core;
import cn.msds.service.CoreService;


/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Service("coreService")
public class CoreServiceImpl implements CoreService{

	@Resource
	private CoreDao coreDao;

	/**
	 * 添加核心信息
	 * @see cn.msds.service.CoreService#addCore(cn.msds.model.Core)
	 * @author JZR	
	 * @param 
	 * @return
	 */
	@Override
	public int addCore(Core core) {
		return coreDao.addCore(core);
	}

	/**
	 * 根据uuid获取核心信息
	 * @see cn.msds.service.CoreService#getCoreByUuid(cn.msds.model.Core)
	 * @author JZR	
	 * @param 
	 * @return
	 */
	@Override
	public List<Core> getCoreByUuid(Core core) {
		return coreDao.getCoreByUuid(core);
	}


}
