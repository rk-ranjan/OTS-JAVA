package com.rk.mit.OTS.services.Impl;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.mit.OTS.model.Orders;
import com.rk.mit.OTS.repository.OrderRepository;
import com.rk.mit.OTS.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepository orderRepository;

	@Override
	public List<Orders> listOrders() {
		// TODO Auto-generated method stub
		System.out.println("Service Excuted" + orderRepository.findAll());
		return orderRepository.findAll();
	}

	@Override
	public Orders getSingleOrder( ObjectId _id) {
		// TODO Auto-generated method stub
		return orderRepository.findBy_id(_id);
	}

	@Override
	public Orders cancelOrder(ObjectId id) {
		// TODO Auto-generated method stub
		Orders order =  orderRepository.findBy_id(id);
		orderRepository.delete(order);	
		return order;
	}

	@Override
	public Orders saveNewOrder(Orders order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
		
	}

}
