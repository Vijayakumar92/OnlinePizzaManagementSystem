package com.onlinepizza.entity;

import java.util.Objects;

import com.onlinepizza.util.PizzaSize;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table
public class Pizza {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pizzaId;
	
	private String pizzaName;
	private String pizzaDescription;
	// Base Price
	private double pizzaCost;
	
	public Pizza() {}

	public Pizza(int pizzaId, String pizzaName, String pizzaDescription, double pizzaCost) {
		super();
		this.pizzaId = pizzaId;
		this.pizzaName = pizzaName;
		this.pizzaDescription = pizzaDescription;
		this.pizzaCost = pizzaCost;
	}

	public int getPizzaId() {
		return pizzaId;
	}

	public void setPizzaId(int pizzaId) {
		this.pizzaId = pizzaId;
	}

	public String getPizzaName() {
		return pizzaName;
	}

	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	public String getPizzaDescription() {
		return pizzaDescription;
	}

	public void setPizzaDescription(String pizzaDescription) {
		this.pizzaDescription = pizzaDescription;
	}

	public double getPizzaCost() {
		return pizzaCost;
	}

	public void setPizzaCost(double pizzaCost) {
		this.pizzaCost = pizzaCost;
	}

	@Override
	public String toString() {
		return "Pizza [pizzaId=" + pizzaId + ", pizzaName=" + pizzaName + ", pizzaDescription=" + pizzaDescription
				+ ", pizzaCost=" + pizzaCost + "]";
	}

	
	
	
	
	

}
