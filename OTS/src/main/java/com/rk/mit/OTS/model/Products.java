package com.rk.mit.OTS.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="products")
public class Products {
	
	@Id
	public ObjectId _id;
	
	public String ProductId;
	
	public String ProductName;
	
	public String QuantityPerUnit;
	
	public Integer UnitPrice;
	
	public Integer SupplierID;
	
	public Integer CategoryID;
	
	public Integer UnitsOnOrder;
	
	public Integer UnitsInStock;
	
	public Integer ReorderLevel;
	
	public Integer Discontinued;
	
	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getProductId() {
		return ProductId;
	}

	public void setProductId(String productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getQuantityPerUnit() {
		return QuantityPerUnit;
	}

	public void setQuantityPerUnit(String quantityPerUnit) {
		QuantityPerUnit = quantityPerUnit;
	}

	public Integer getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		UnitPrice = unitPrice;
	}

	public Integer getUnitsOnOrder() {
		return UnitsOnOrder;
	}

	public void setUnitsOnOrder(Integer unitsOnOrder) {
		UnitsOnOrder = unitsOnOrder;
	}

	public Integer getUnitsInStock() {
		return UnitsInStock;
	}

	public void setUnitsInStock(Integer unitsInStock) {
		UnitsInStock = unitsInStock;
	}

	public Integer getReorderLevel() {
		return ReorderLevel;
	}

	public void setReorderLevel(Integer reorderLevel) {
		ReorderLevel = reorderLevel;
	}

	public Integer getDiscontinued() {
		return Discontinued;
	}

	public void setDiscontinued(Integer discontinued) {
		Discontinued = discontinued;
	}


}
