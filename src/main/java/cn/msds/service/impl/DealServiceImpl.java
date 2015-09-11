package cn.msds.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.msds.dao.DealDao;
import cn.msds.model.Deal;
import cn.msds.service.DealService;


/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Service("dealService")
public class DealServiceImpl implements DealService{

	@Resource
	private DealDao dealDao;

	/**
	 * 添加反欺诈结果信息
	 * @see cn.msds.service.DealService#addDeal(cn.msds.model.Deal)
	 * @author JZR	
	 * @param 
	 * @return
	 */
	@Override
	public int addDeal(Deal deal) {
		return dealDao.addDeal(deal);
	}

	/**
	 * 根据uuid查询反欺诈结果
	 * @see cn.msds.service.DealService#getDealByUuid(cn.msds.model.Deal)
	 * @author JZR	
	 * @param 
	 * @return
	 */
	@Override
	public List<Deal> getDealByUuid(Deal deal) {
		return dealDao.getDealByUuid(deal);
	}


}
