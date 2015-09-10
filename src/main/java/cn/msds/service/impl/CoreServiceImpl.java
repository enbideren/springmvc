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

	@Override
	public int addCore(Core core) {
		return coreDao.addCore(core);
	}

	@Override
	public List<Core> getCoreByUuid(Core core) {
		return coreDao.getCoreByUuid(core);
	}


}
