package cn.msds.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.msds.dao.CreditCheckDao;
import cn.msds.model.CreditCheck;
import cn.msds.service.CreditCheckService;


/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Service("creditCheckService")
public class CreditCheckServiceImpl implements CreditCheckService{

	@Resource
	private CreditCheckDao creditCheckDao;

	/**
	 * 添加反欺诈结果信息
	 * @see cn.msds.service.CreditCheckService#addCreditCheck(cn.msds.model.CreditCheck)
	 * @author JZR	
	 * @param 
	 * @return
	 */
	@Override
	public int addCreditCheck(CreditCheck creditCheck) {
		return creditCheckDao.addCreditCheck(creditCheck);
	}

	/**
	 * 根据uuid查询反欺诈结果
	 * @see cn.msds.service.CreditCheckService#getCreditCheckByUuid(cn.msds.model.CreditCheck)
	 * @author JZR	
	 * @param 
	 * @return
	 */
	@Override
	public List<CreditCheck> getCreditCheckByUuid(CreditCheck creditCheck) {
		return creditCheckDao.getCreditCheckByUuid(creditCheck);
	}


}
