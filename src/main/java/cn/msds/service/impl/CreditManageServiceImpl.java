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

	@Override
	public int addCreditManage(CreditManage creditManage) {
		return creditManageDao.addCreditManage(creditManage);
	}

	@Override
	public List<CreditManage> getCreditManageByOrderId(CreditManage creditManage) {
		return creditManageDao.getCreditManageByOrderId(creditManage);
	}


}
