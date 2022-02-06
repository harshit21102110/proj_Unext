package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.bean.product;
import com.example.demo.repository.productRepository;

@Service
public class productService {
	@Autowired
	public productRepository productRepo;
	public List<product> gettAll(String name){
		
		List<product> products= new ArrayList<>();
		productRepo.getAll(name).forEach(products::add);
		return products;
		
	}
	
	public void addProducts( product pr,String name)
	{		
		
		pr.setSellerId(name);

		productRepo.save(pr);
	}
	public void updateStock(int stock ,String id,String seller) {
		productRepo.changeStock(stock, id,seller);
	}
	public void deleteProduct( String id,String seller) {
		productRepo.deletProduct(id,seller);
	}

}
