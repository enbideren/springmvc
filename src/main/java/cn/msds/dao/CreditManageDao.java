package cn.msds.dao;

import java.util.List;

import cn.msds.model.CreditManage;


/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface CreditManageDao {
    int addCreditManage(CreditManage creditManage);
    List<CreditManage> getCreditManageByOrderId(CreditManage creditManage);
}