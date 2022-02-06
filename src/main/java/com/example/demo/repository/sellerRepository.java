package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.bean.seller;

public interface sellerRepository extends CrudRepository<seller, String> {
	
@Query("select u from seller u where seller_Id=:n and password=:m")
public seller login(@Param("n") String sellerId, @Param("m") String password);


}