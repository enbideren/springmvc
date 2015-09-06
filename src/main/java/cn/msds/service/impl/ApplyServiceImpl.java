package cn.msds.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.msds.dao.ApplyDao;
import cn.msds.model.Apply;
import cn.msds.service.ApplyService;


/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Service("applyService")
public class ApplyServiceImpl implements ApplyService{

	@Resource
	private ApplyDao applyDao;

	@Override
	public int addApply(Apply apply) {
		return applyDao.addApply(apply);
	}

	@Override
	public List<Apply> getApplyByCondition(Apply apply) {
		return applyDao.getApplyByCondition(apply);
	}

	@Override
	public int getIpCount(Map<String, Object> map) {
		return applyDao.getIpCount(map);
	}


	

}
