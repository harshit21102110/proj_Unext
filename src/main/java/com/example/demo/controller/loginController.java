package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.bean.product;
import com.example.demo.bean.seller;
 import com.example.demo.service.sellerService;
 
 @SessionAttributes("name")

@RestController
public class loginController {

	@Autowired
	private sellerService uService;
	
	@PostMapping("/seller/signup")
	public void addProducts(@RequestBody seller u)
	{
uService.addUser(u);
}
	
	@GetMapping("/seller/login")
	public String login(@RequestParam String sellerId , @RequestParam String password ,HttpSession session, @ModelAttribute("seller") String 
			seller, Model m) {
		
		seller u =uService.login(sellerId, password);
	
		
		if(u==null)
			return "Not Signed In check userId or Sign up";
		
		seller=sellerId;
		session.setAttribute("seller", seller);
		return "User Logged in";
		
	}
	
	@GetMapping("/seller/logout")
	public String logout(HttpSession session) {
		if(null == session.getAttribute("seller")) {
			return "You Are Not Loged In";
		}
		session.invalidate();
		
		return "logged Out";
		
	}

}
