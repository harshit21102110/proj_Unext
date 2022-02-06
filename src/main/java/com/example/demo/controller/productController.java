package com.example.demo.controller;

import java.util.List;

import javax.persistence.Id;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.bean.product;
import com.example.demo.service.productService;
import com.example.demo.service.sellerService;

@RestController
@SessionAttributes("name")
public class productController {

	@Autowired
	private productService pService;
	
	
	
	@GetMapping("/products")
	public List<product> getAll(HttpSession session){

		if(null == session.getAttribute("seller")) {
			return null;
		}

		return pService.gettAll((String)session.getAttribute("seller"));
	}
	
	@PostMapping("/products")
	public void addProducts(@RequestBody product pr,HttpSession session  )
	{
		if(null == session.getAttribute("seller")) {
			return ;
		}
		String name = (String)session.getAttribute("seller");
				
		
pService.addProducts(pr,name);
}
	
	@PutMapping("/products")
	public void updateProducts(@RequestParam String pIdString , @RequestParam int stock,HttpSession session ) {
		if(null == session.getAttribute("seller")) {
			return ;
		}
		
		pService.updateStock(stock, pIdString,(String)session.getAttribute("seller"));
	}

	@DeleteMapping("/products")
	public void deleteProduct(@RequestParam String pIdString ,HttpSession session  ) {
		
		if(null == session.getAttribute("seller")) {
			return ;
		}
		pService.deleteProduct( pIdString,(String)session.getAttribute("seller"));
	}
	

	
}
