package com.onlinepizza.dto;

import java.util.Objects;

public class ToppingsDTO {
	private Integer toppingsId;
	private String toppingsName;
	private Double price;
	
	public ToppingsDTO() {}

	public ToppingsDTO(Integer toppingsId, String toppingsName, Double price) {
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

	@Override
	public String toString() {
		return "ToppingsDTO [toppingsId=" + toppingsId + ", toppingsName=" + toppingsName + ", price=" + price + "]";
	}

	
	
}
