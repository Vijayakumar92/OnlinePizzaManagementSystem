package com.onlinepizza.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlinepizza.entity.Toppings;
import com.onlinepizza.repository.ToppingsRepository;
import com.onlinepizza.service.IToppingsService;

public class IToppingsServiceImp implements IToppingsService{

	@Autowired
	ToppingsRepository toppingsRepository;
	@Override
	public String addToppings(Toppings topping) {
		
		toppingsRepository.save(topping);
		return "Toppings added";
	}
	@Override
	public String deleteToppingsById(Toppings toppingsId) {
		toppingsRepository.deleteById(toppingsId);
		return "Toppings Removed Successfully";
	}

	

	

}
