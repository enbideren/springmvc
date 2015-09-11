package cn.msds.dao;

import java.util.List;

import cn.msds.model.Order;


/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public interface OrderDao {
    int addOrder(Order order);
    List<Order> getOrderByUuid(Order order);
}