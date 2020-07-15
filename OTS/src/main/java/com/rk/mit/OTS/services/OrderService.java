package com.rk.mit.OTS.services;
import org.bson.types.ObjectId;
import java.util.List;
import com.rk.mit.OTS.model.Orders;

public interface OrderService {
    public Orders getSingleOrder( ObjectId id);

	public List<Orders> listOrders();

	public Orders cancelOrder(ObjectId id);

	public Orders saveNewOrder(Orders order);
}
