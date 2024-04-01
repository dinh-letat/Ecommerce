package com.dinhle.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinhle.ecommerce.model.Product;
import com.dinhle.ecommerce.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product findById(int product_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Integer product_id, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product deleteProduct(Integer product_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
