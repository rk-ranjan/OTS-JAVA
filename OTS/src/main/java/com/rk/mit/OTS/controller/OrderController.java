package com.rk.mit.OTS.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rk.mit.OTS.model.NewOrder;
import com.rk.mit.OTS.model.OrderDetails;
import com.rk.mit.OTS.model.Orders;
import com.rk.mit.OTS.services.OrderDetailService;
import com.rk.mit.OTS.services.OrderService;
import com.rk.mit.OTS.utils.Utils;

@RestController
@RequestMapping("/rest-api/orders")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@Autowired()
	OrderDetailService orderDetailService;
	
	@Autowired()
	Utils utils;
	
	@GetMapping()
	public List<Orders> getAllOrders() {
		return orderService.listOrders();
	}
	
	@DeleteMapping()
	public Orders cancelOrder(@RequestParam("id") ObjectId id) {
		System.out.println("Deleting Order..."+id);
		return orderService.cancelOrder(id);
	}
	
	@GetMapping("/{id}")
	public Orders getOrderById(@PathVariable("id") ObjectId id) {
		return orderService.getSingleOrder(id);
	}
	
	@PostMapping()
	public OrderDetails saveOrderAndDetails(@RequestBody NewOrder newOrder) {
		newOrder.order.setOrderID(utils.generateOrderId());
		newOrder.detail.setOrderID(utils.generateOrderId());
		Orders order = newOrder.order;
		OrderDetails od = newOrder.detail;
		orderService.saveNewOrder(order);
		orderDetailService.saveOrderDetails(od);
		return od;
	}
}
