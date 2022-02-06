package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.bean.product;

public interface productRepository extends CrudRepository<product, String> {
	 @Transactional
	  @Modifying
	@Query("update  product set stock = :n where product_id = :m and seller_id =:l")
	public void changeStock(@Param("n") int stock , @Param("m") String pId ,@Param("l")String seller );
	
	 @Transactional
	  @Modifying
	@Query("delete from product where product_id=:n and seller_id =:l")
	public void deletProduct(@Param("n")  String pId,@Param("l")String seller );
	 
	 @Query("select u from product u where seller_id=:m")
		List<product> getAll(@Param("m") String name);

}
