package com.onlinepizza.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

import com.onlinepizza.util.PizzaStatus;



@Entity
@Table 
public class PizzaOrder {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer bookingOrderId;
	
//	@Temporal(TemporalType.DATE)
	
	@CreatedDate
	private LocalDateTime dateTimeOfOrder;
	private Integer quantity;
	private Double totalCost;
    @OneToMany
	private List<Pizza> pizzaList;
	@OneToOne
	private Customer customer;
	private PizzaStatus status;  //  
	
	public PizzaOrder() {}

	public PizzaOrder(Integer bookingOrderId, LocalDateTime dateTimeOfOrder, Integer quantity, Double totalCost,
			List<Pizza> pizzaList, Customer customer, PizzaStatus status) {
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

	public List<Pizza> getPizzaList() {
		return pizzaList;
	}

	public void setPizzaList(List<Pizza> pizzaList) {
		this.pizzaList = pizzaList;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
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
		return "PizzaOrder [bookingOrderId=" + bookingOrderId + ", dateTimeOfOrder=" + dateTimeOfOrder + ", quantity="
				+ quantity + ", totalCost=" + totalCost + ", pizzaList=" + pizzaList + ", customer=" + customer
				+ ", status=" + status + "]";
	}

	

	
	
	

}
