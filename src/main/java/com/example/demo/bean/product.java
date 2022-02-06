package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class product {
	@Id
	private String productId;  
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public product(String productId, String pName, int price, int stock, String pType, String sellerId) {
		super();
		this.productId = productId;
		this.pName = pName;
		this.price = price;
		this.stock = stock;
		this.pType = pType;
		this.sellerId = sellerId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getpType() {
		return pType;
	}
	public void setpType(String pType) {
		this.pType = pType;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	private String  pName     ; 
	private int price      ;
	private int  stock    ;  
	private String  pType      ;
	private String sellerId   ;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	
}
