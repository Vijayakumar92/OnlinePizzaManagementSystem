package com.onlinepizza.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


public class Toppings {
	
	private Integer toppingsId;
	private String toppingsName;
	private Double price;
	
	
	public Toppings() {}

	public Toppings(Integer toppingsId, String toppingsName, Double price) {
		super();
		this.toppingsId = toppingsId;
		this.toppingsName = toppingsName;
		this.price = price;
	}

	public Integer getToppingsId() {
		return toppingsId;
	}

	public void setToppingsId(Integer toppingsId) {
		this.toppingsId = toppingsId;
	}

	public String getToppingsName() {
		return toppingsName;
	}

	public void setToppingsName(String toppingsName) {
		this.toppingsName = toppingsName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
