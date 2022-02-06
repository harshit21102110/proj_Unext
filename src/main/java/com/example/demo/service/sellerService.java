package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.seller;
import com.example.demo.repository.sellerRepository;

@Service
public class sellerService {
	@Autowired
	public sellerRepository uRepository;
	
	public seller login(String id,String password) {
		
		seller u = uRepository.login(id, password);
		return u ;
	}
	public void addUser(seller u) {
		uRepository.save(u);
	}
	
}
