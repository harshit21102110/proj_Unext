package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="seller")
public class seller {
	
	@Id 
	private String sellerId;
	private String name;
	private String phoneNumber;
	private String password;
	private String address;
	public String getSellerId() {
		return sellerId;
	}
	public void setsellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public seller(String sellerId, String name, String phoneNumber, String password, String address) {
		super();
		this.sellerId = sellerId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.address = address;
	}
	public seller() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
