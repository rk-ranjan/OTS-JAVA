package com.rk.mit.OTS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk.mit.OTS.model.Products;
import com.rk.mit.OTS.services.ProductService;

@RestController
@RequestMapping("/rest-api/product")
public class ProductController {
 
	@Autowired()
	 ProductService productService;
	
	@GetMapping()
	public List<Products> getAllProducts() {	
		return productService.listProducst();
	}
	 
}
