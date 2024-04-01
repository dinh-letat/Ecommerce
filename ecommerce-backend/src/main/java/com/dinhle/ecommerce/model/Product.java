package com.dinhle.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int product_id;
	
	@Column(name = "product_name")
	private String product_name;
	
	@Column(name = "product_type")
	private String product_type;
	
	@Column(name = "product_quantity")
	private String product_quantity;
	
	@Column(name = "product_price")
	private double product_price;
	
	@Column(name = "product_image")
	private String product_image;

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public String getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(String product_quantity) {
		this.product_quantity = product_quantity;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public String getProduct_image() {
		return product_image;
	}

	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int product_id, String product_name, String product_type, String product_quantity,
			double product_price, String product_image) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_type = product_type;
		this.product_quantity = product_quantity;
		this.product_price = product_price;
		this.product_image = product_image;
	}
	
	
}
