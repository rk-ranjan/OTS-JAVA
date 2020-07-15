package com.rk.mit.OTS.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rk.mit.OTS.model.OrderDetails;

public interface OrderDetailRepository extends MongoRepository<OrderDetails, String> {

}
