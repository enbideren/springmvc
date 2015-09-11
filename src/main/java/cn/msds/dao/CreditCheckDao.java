package cn.msds.dao;

import java.util.List;

import cn.msds.model.CreditCheck;


/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface CreditCheckDao {
    int addCreditCheck(CreditCheck creditCheck);
    List<CreditCheck> getCreditCheckByUuid(CreditCheck creditCheck);
}