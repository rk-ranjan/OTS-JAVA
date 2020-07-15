package com.rk.mit.OTS.model;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Orders {
  @Id
  public ObjectId _id;
  
  public Integer OrderID;
  
  public String CustomerID;
  
  public Integer EmployeeId;
  
  public String OrderDate;
  
  public String RequiredDate;
  
  public String ShippedDate;
  
  public Integer ShipVia;
  
  public Double Freight;
  
  public String ShipName;
  
  public Object ShipCity;
  
  public String ShipRegion;
  
  public String field14;
  
  public Object ShipCountry;
  
  public Object ShipPostalCode;
  
  public Object ShipAddress;

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

public String getCustomerID() {
	return CustomerID;
}

public void setCustomerID(String customerID) {
	CustomerID = customerID;
}

public Integer getEmployeeId() {
	return EmployeeId;
}

public void setEmployeeId(Integer employeeId) {
	EmployeeId = employeeId;
}

public String getOrderDate() {
	return OrderDate;
}

public void setOrderDate(String orderDate) {
	OrderDate = orderDate;
}

public String getRequiredDate() {
	return RequiredDate;
}

public void setRequiredDate(String requiredDate) {
	RequiredDate = requiredDate;
}

public String getShippedDate() {
	return ShippedDate;
}

public void setShippedDate(String shippedDate) {
	ShippedDate = shippedDate;
}

public Integer getShipVia() {
	return ShipVia;
}

public void setShipVia(Integer shipVia) {
	ShipVia = shipVia;
}

public Double getFreight() {
	return Freight;
}

public void setFreight(Double freight) {
	Freight = freight;
}

public String getShipName() {
	return ShipName;
}

public void setShipName(String shipName) {
	ShipName = shipName;
}

public Object getShipCity() {
	return ShipCity;
}

public void setShipCity(Object shipCity) {
	ShipCity = shipCity;
}

public String getShipRegion() {
	return ShipRegion;
}

public void setShipRegion(String shipRegion) {
	ShipRegion = shipRegion;
}

public String getField14() {
	return field14;
}

public void setField14(String field14) {
	this.field14 = field14;
}

public Object getShipCountry() {
	return ShipCountry;
}

public void setShipCountry(Object shipCountry) {
	ShipCountry = shipCountry;
}

public Object getShipPostalCode() {
	return ShipPostalCode;
}

public void setShipPostalCode(Object shipPostalCode) {
	ShipPostalCode = shipPostalCode;
}

public Object getShipAddress() {
	return ShipAddress;
}

public void setShipAddress(Object shipAddress) {
	ShipAddress = shipAddress;
}
  
 
  
}