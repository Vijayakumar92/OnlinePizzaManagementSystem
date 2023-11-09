package com.onlinepizza.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import com.onlinepizza.util.PizzaStatus;

public class PizzaOrderDTO {
	private Integer bookingOrderId;
	private LocalDateTime dateTimeOfOrder;
	private Integer quantity;
	private Double totalCost;
	private List<PizzaDTO> pizzaList;
	private CustomerDTO customer;
	private PizzaStatus status;
	
	public PizzaOrderDTO() {}

	public PizzaOrderDTO(Integer bookingOrderId, LocalDateTime dateTimeOfOrder, Integer quantity, Double totalCost,
			List<PizzaDTO> pizzaList, CustomerDTO customer, PizzaStatus status) {
		super();
		this.bookingOrderId = bookingOrderId;
		this.dateTimeOfOrder = dateTimeOfOrder;
		this.quantity = quantity;
		this.totalCost = totalCost;
		this.pizzaList = pizzaList;
		this.customer = customer;
		this.status = status;
	}

	public Integer getBookingOrderId() {
		return bookingOrderId;
	}

	public void setBookingOrderId(Integer bookingOrderId) {
		this.bookingOrderId = bookingOrderId;
	}

	public LocalDateTime getDateTimeOfOrder() {
		return dateTimeOfOrder;
	}

	public void setDateTimeOfOrder(LocalDateTime dateTimeOfOrder) {
		this.dateTimeOfOrder = dateTimeOfOrder;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public List<PizzaDTO> getPizzaList() {
		return pizzaList;
	}

	public void setPizzaList(List<PizzaDTO> pizzaList) {
		this.pizzaList = pizzaList;
	}

	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

	public PizzaStatus getStatus() {
		return status;
	}

	public void setStatus(PizzaStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PizzaOrderDTO [bookingOrderId=" + bookingOrderId + ", dateTimeOfOrder=" + dateTimeOfOrder
				+ ", quantity=" + quantity + ", totalCost=" + totalCost + ", pizzaList=" + pizzaList + ", customer="
				+ customer + ", status=" + status + "]";
	}

	
	
	
}
