package cn.msds.dao;

import java.util.List;

import cn.msds.model.Deal;


/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface DealDao {
    int addDeal(Deal deal);
    List<Deal> getDealByUuid(Deal deal);
}