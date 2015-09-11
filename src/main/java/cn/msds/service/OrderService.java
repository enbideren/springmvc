package cn.msds.service;

import java.util.List;

import cn.msds.model.Order;


/**
 * 变量操作接口类
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface OrderService {
	public int addOrder(Order order);
    public List<Order> getOrderByUuid(Order order);
}
