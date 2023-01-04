package com.Arunima.exceldump.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private int productId;
	private String productname;
	private String productDesc;
	private  Double productPrice;
	
	public Product(int productId, String productname, String productDesc, Double productPrice) {
		super();
		this.productId = productId;
		this.productname = productname;
		this.productDesc = productDesc;
		this.productPrice = productPrice;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
	

}
