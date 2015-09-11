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
	
	/**
	 * 添加进件
	 * @see cn.msds.service.ApplyService#addApply(cn.msds.model.Apply)
	 * @author JZR	
	 * @param 
	 * @return
	 */
	@Override
	public int addApply(Apply apply) {
		return applyDao.addApply(apply);
	}

	/**
	 * 根据条件查询进件信息
	 * @see cn.msds.service.ApplyService#getApplyByCondition(cn.msds.model.Apply)
	 * @author JZR	
	 * @param 
	 * @return
	 */
	@Override
	public List<Apply> getApplyByCondition(Apply apply) {
		return applyDao.getApplyByCondition(apply);
	}

	/**
	 * 获取一定时间段内，某个IP的申请次数
	 * @see cn.msds.service.ApplyService#getIpCount(java.util.Map)
	 * @author JZR	
	 * @param 
	 * @return
	 */
	@Override
	public int getIpCount(Map<String, Object> map) {
		return applyDao.getIpCount(map);
	}


	

}
