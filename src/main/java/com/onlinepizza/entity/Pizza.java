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
	private Integer pizzaId;
	@Transient
	private PizzaType pizzaType;
	private String pizzaName;
	private String pizzaDescription;
	// Base Price
	private Double pizzaCost;
	@Transient
	private PizzaSize pizzaSize;
	
	public Pizza() {}

	public Pizza(Integer pizzaId, PizzaType pizzaType, String pizzaName, String pizzaDescription, Double pizzaCost,
			PizzaSize pizzaSize) {
		super();
		this.pizzaId = pizzaId;
		this.pizzaType = pizzaType;
		this.pizzaName = pizzaName;
		this.pizzaDescription = pizzaDescription;
		this.pizzaCost = pizzaCost;
		this.pizzaSize = pizzaSize;
	}

	public Integer getPizzaId() {
		return pizzaId;
	}

	public void setPizzaId(Integer pizzaId) {
		this.pizzaId = pizzaId;
	}

	public PizzaType getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(PizzaType pizzaType) {
		this.pizzaType = pizzaType;
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

	public Double getPizzaCost() {
		return pizzaCost;
	}

	public void setPizzaCost(Double pizzaCost) {
		this.pizzaCost = pizzaCost;
	}

	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}

	public void setPizzaSize(PizzaSize pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	@Override
	public String toString() {
		return "Pizza [pizzaId=" + pizzaId + ", pizzaType=" + pizzaType + ", pizzaName=" + pizzaName
				+ ", pizzaDescription=" + pizzaDescription + ", pizzaCost=" + pizzaCost + ", pizzaSize=" + pizzaSize
				+ "]";
	}
	
	

	

	
	
	
	
	

}
