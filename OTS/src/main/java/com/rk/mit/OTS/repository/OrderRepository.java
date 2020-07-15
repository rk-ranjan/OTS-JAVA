package com.rk.mit.OTS.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.rk.mit.OTS.model.Orders;

public interface OrderRepository extends MongoRepository<Orders, String> {
  Orders findBy_id(ObjectId _id);

  Orders deleteBy_id(ObjectId id);
}