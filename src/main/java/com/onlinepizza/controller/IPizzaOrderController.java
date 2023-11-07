package com.onlinepizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinepizza.service.IPizzaOrderService;

@RestController
@RequestMapping("/pizzaorder")
public class IPizzaOrderController {
	
	@Autowired
	IPizzaOrderService ipizzaorderservice;
	
	

}
