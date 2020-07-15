package com.rk.mit.OTS.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order-details ")
public class OrderDetails {

	@Id
	public ObjectId _id;

	public Integer OrderID;

	public String ProductID;

	public Integer UnitPrice;

	public Integer Quantity;

	public Integer Discount;

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public Integer getOrderID() {
		return OrderID;
	}

	public void setOrderID(Integer orderID) {
		OrderID = orderID;
	}

	public String getProductID() {
		return ProductID;
	}

	public void setProductID(String productID) {
		ProductID = productID;
	}

	public Integer getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		UnitPrice = unitPrice;
	}

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}

	public Integer getDiscount() {
		return Discount;
	}

	public void setDiscount(Integer discount) {
		Discount = discount;
	}

}
