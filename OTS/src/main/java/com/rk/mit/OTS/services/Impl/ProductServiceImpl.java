package com.rk.mit.OTS.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.mit.OTS.model.Products;
import com.rk.mit.OTS.repository.ProductRepository;
import com.rk.mit.OTS.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired()
	ProductRepository productRepository;
	@Override
	public List<Products> listProducst() {
		
		return productRepository.findAll();
	}

}
