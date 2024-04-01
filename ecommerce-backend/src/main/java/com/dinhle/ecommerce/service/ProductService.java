package com.dinhle.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dinhle.ecommerce.model.Product;

@Service
public interface ProductService {
	List<Product> getAllProduct();
	
	Product findById(int product_id);
	
	Product createProduct(Product product);
	
	Product updateProduct(Integer product_id, Product product);
	
	Product deleteProduct(Integer product_id);
}
