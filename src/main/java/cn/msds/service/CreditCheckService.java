package cn.msds.service;

import java.util.List;

import cn.msds.model.CreditCheck;


/**
 * 变量操作接口类
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface CreditCheckService {
	public int addCreditCheck(CreditCheck creditCheck);
    public List<CreditCheck> getCreditCheckByUuid(CreditCheck creditCheck);
}
