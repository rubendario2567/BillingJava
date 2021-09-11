package com.billing.billing.service;

import java.util.List;

import com.billing.billing.model.Product;
import com.billing.billing.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	//@Autowired
	//ErrorManagerService errorManagerService;

	/**
	 * Metod by list product
	 * @return product list
	 */
	public List<Product> getAll() {
		List<Product> data = productRepository.findAll();
		return data;
	}

	/**
	 * Metod by add product
	 * @param item new product
	 * @return new product
	 */
	public Product setProduct(Product item) {
		item = productRepository.save(item);
		return item;
	}

	/**
	 * metod by update one product
	 * @param item product
	 * @return modify product
	 */
	public Product updateProduct(Product item) {
		item = productRepository.save(item);
		return item;
	}

}