package cn.msds.service;

import java.util.List;

import cn.msds.model.Deal;


/**
 * 变量操作接口类
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface DealService {
	public int addDeal(Deal deal);
    public List<Deal> getDealByUuid(Deal deal);
}
