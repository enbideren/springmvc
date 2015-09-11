package cn.msds.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.msds.dao.CreditManageDao;
import cn.msds.model.CreditManage;
import cn.msds.service.CreditManageService;


/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Service("creditManageService")
public class CreditManageServiceImpl implements CreditManageService{

	@Resource
	private CreditManageDao creditManageDao;

	/**
	 * 添加信用管理结果
	 * @see cn.msds.service.CreditManageService#addCreditManage(cn.msds.model.CreditManage)
	 * @author JZR	
	 * @param 
	 * @return
	 */
	@Override
	public int addCreditManage(CreditManage creditManage) {
		return creditManageDao.addCreditManage(creditManage);
	}

	/**
	 * 根据订单号获取信用管理结果
	 * @see cn.msds.service.CreditManageService#getCreditManageByOrderId(cn.msds.model.CreditManage)
	 * @author JZR	
	 * @param 
	 * @return
	 */
	@Override
	public List<CreditManage> getCreditManageByOrderId(CreditManage creditManage) {
		return creditManageDao.getCreditManageByOrderId(creditManage);
	}


}
