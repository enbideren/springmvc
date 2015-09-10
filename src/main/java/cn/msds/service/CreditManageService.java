package cn.msds.service;

import java.util.List;

import cn.msds.model.CreditManage;


/**
 * 变量操作接口类
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface CreditManageService {
	public int addCreditManage(CreditManage creditManage);
    public List<CreditManage> getCreditManageByOrderId(CreditManage creditManage);
}
