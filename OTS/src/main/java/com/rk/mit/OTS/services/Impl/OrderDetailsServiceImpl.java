package com.rk.mit.OTS.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.mit.OTS.model.OrderDetails;
import com.rk.mit.OTS.repository.OrderDetailRepository;
import com.rk.mit.OTS.services.OrderDetailService;

@Service
public class OrderDetailsServiceImpl implements OrderDetailService {

	@Autowired()
	OrderDetailRepository odsr;
	@Override
	public OrderDetails saveOrderDetails(OrderDetails od) {
		// TODO Auto-generated method stub
		return odsr.save(od);
	}

}
