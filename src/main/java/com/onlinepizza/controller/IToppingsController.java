package com.onlinepizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinepizza.entity.Toppings;
import com.onlinepizza.serviceimp.IToppingsServiceImp;

@RestController
@RequestMapping("/toppings")
public class IToppingsController {
	
	@Autowired
	IToppingsServiceImp iToppingsServiceImp;
	
	@PostMapping("/add")
	public String addToppings(Toppings topping) {
		return iToppingsServiceImp.addToppings(topping);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteToppingsById(@PathVariable Integer toppingsId) {
		return iToppingsServiceImp.deleteToppingsById(toppingsId);
 
	}

}
