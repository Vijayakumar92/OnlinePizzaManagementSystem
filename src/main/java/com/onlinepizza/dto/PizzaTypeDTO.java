package com.onlinepizza.dto;

import java.util.List;
import java.util.Objects;

public class PizzaTypeDTO {
	private Integer pizzaTypeId;
	// Veg or Non-Veg
	private String pizzaType;
	private List<ToppingsDTO> toppings;
	
	public PizzaTypeDTO() {}

	public PizzaTypeDTO(Integer pizzaTypeId, String pizzaType, List<ToppingsDTO> toppings) {
		super();
		this.pizzaTypeId = pizzaTypeId;
		this.pizzaType = pizzaType;
		this.toppings = toppings;
	}

	public Integer getPizzaTypeId() {
		return pizzaTypeId;
	}

	public void setPizzaTypeId(Integer pizzaTypeId) {
		this.pizzaTypeId = pizzaTypeId;
	}

	public String getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}

	public List<ToppingsDTO> getToppings() {
		return toppings;
	}

	public void setToppings(List<ToppingsDTO> toppings) {
		this.toppings = toppings;
	}

	@Override
	public String toString() {
		return "PizzaTypeDTO [pizzaTypeId=" + pizzaTypeId + ", pizzaType=" + pizzaType + ", toppings=" + toppings + "]";
	}

	
	
}
