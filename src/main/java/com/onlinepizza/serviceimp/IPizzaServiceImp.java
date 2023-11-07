package com.onlinepizza.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinepizza.dto.PizzaDTO;
import com.onlinepizza.dto.PizzaTypeDTO;
import com.onlinepizza.dto.ToppingsDTO;
import com.onlinepizza.entity.Pizza;
import com.onlinepizza.entity.PizzaType;
import com.onlinepizza.entity.Toppings;
import com.onlinepizza.repository.PizzaRepository;
import com.onlinepizza.repository.PizzaTypeRepository;
import com.onlinepizza.repository.ToppingsRepository;
import com.onlinepizza.service.IPizzaService;

@Service
public class IPizzaServiceImp implements IPizzaService {

//	public PizzaDTO addPizza(Pizza pizza) {
//	
//	PizzaDTO pizz;
//	pizz.setId(pizza.);
//	
//	return pizz;
//}
	@Autowired
	private PizzaRepository pizzaRepository;
	
	@Autowired
	private ToppingsRepository toppingsRepository;
	
	@Autowired
	private PizzaTypeRepository pizzaTypeRepository;
	
	
	
	@Override
	public Pizza addPizza(Pizza pizza) {
		pizzaRepository.save(pizza);
		return pizza;
	
	}

	@Override
	public Toppings addToppings(Toppings toppings) {
		        
			Toppings newToppings = new Toppings();  
			
			newToppings.setToppingsName(toppings.getToppingsName());        
			newToppings.setPrice(toppings.getPrice());       
			  toppingsRepository.save(newToppings); 
			 return newToppings;
		
	}

	@Override
	public PizzaType addPizzaType(PizzaType pizzaType) {
		
			   PizzaType newPizzaType = new PizzaType(); 
			   
			   newPizzaType.setPizzaType(pizzaType.getPizzaType());      
			   newPizzaType.setToppings(pizzaType.getToppings());
			   
			   pizzaTypeRepository.save(newPizzaType);
			   
			 return newPizzaType;    
			
	}

	@Override
	public Pizza updatePizza(Pizza pizza) {
	
		return null;
	}

	@Override
	public Pizza viewPizzaById(Integer pizzaId) {
		
		
		return pizzaRepository.getById(pizzaId);
	}

	@Override
	public List<Pizza> viewPizzaByPizzaType(String pizzaType) {
		
		return null;
	}

	@Override
	public List<Pizza> viewPizzaByPizzaSize(String pizzaSize) {
		
		return null;
	}

	@Override
	public List<Pizza> viewPizzaByPrice(Double minPrice, Double maxPrice) {
		
		return null;
	}

	@Override
	public List<Pizza> viewAllPizza() {
		
		return null;
	}

	@Override
	public List<Toppings> viewToppings() {
		
		return null;
	}

	@Override
	public Toppings viewToppingByID(Integer toppingsID) {
		
		return null;
	}

	@Override
	public PizzaType viewPizzaTypeById(Integer pizzaTypeId) {
		
		return null;
	}

	@Override
	public List<PizzaType> viewAllPizzaTypes() {
		
		return null;
	}
	
}
