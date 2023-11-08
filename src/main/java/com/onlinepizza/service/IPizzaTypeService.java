package com.onlinepizza.service;

import java.util.List;

import com.onlinepizza.entity.PizzaType;

public interface IPizzaTypeService {
	
	String addPizzaType(PizzaType pizzaType);
	String deleteById(PizzaType pizzaTypeId);
	List<PizzaType> viewPizzaType();

}
