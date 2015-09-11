package cn.msds.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.msds.dao.OrderDao;
import cn.msds.model.Order;
import cn.msds.service.OrderService;


/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService{

	@Resource
	private OrderDao orderDao;

	/**
	 * 添加反欺诈结果信息
	 * @see cn.msds.service.OrderService#addOrder(cn.msds.model.Order)
	 * @author JZR	
	 * @param 
	 * @return
	 */
	@Override
	public int addOrder(Order order) {
		return orderDao.addOrder(order);
	}

	/**
	 * 根据uuid查询反欺诈结果
	 * @see cn.msds.service.OrderService#getOrderByUuid(cn.msds.model.Order)
	 * @author JZR	
	 * @param 
	 * @return
	 */
	@Override
	public List<Order> getOrderByUuid(Order order) {
		return orderDao.getOrderByUuid(order);
	}


}
