package com.onlinepizza.service;

import org.springframework.stereotype.Service;

import com.onlinepizza.entity.Toppings;

@Service
public interface IToppingsService {
	String addToppings(Toppings topping);
	String deleteToppingsById(Toppings toppingsId);

}
