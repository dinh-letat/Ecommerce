package com.dinhle.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dinhle.ecommerce.model.Product;
import com.dinhle.ecommerce.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("")
	public ResponseEntity<List<Product>> getAllProduct(){
		List<Product> product = productService.getAllProduct(); 
		return ResponseEntity.ok(product);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> findProductById(@PathVariable Integer product_id) {
		Product product = productService.findById(product_id);
		return ResponseEntity.ok(product);
	}
	
}
