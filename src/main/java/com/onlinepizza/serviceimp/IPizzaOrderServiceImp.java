package com.onlinepizza.serviceimp;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinepizza.entity.Customer;
import com.onlinepizza.entity.PizzaOrder;
import com.onlinepizza.repository.PizzaOrderRepository;
import com.onlinepizza.service.IPizzaOrderService;

@Service
public class IPizzaOrderServiceImp implements IPizzaOrderService{
	
	@Autowired
	private PizzaOrderRepository PizzaOrderRepository;

	@Override
	public PizzaOrder bookPizzaOrder(PizzaOrder order) {
		
		
		return PizzaOrderRepository.save(order);
	}

	@Override
	public PizzaOrder updatepizzaOrder(PizzaOrder pizzaOrder) {
		
		return PizzaOrderRepository.save(pizzaOrder);
	}

	@Override
	public PizzaOrder cancelPizzaOrder(Integer pizzaId) {
		
		
		return null;
	}

	@Override
	public PizzaOrder viewPizzaOrderById(Integer pizzaOrderId) {
		
		
		return PizzaOrderRepository.viewCustomerByPhone(pizzaOrderId);
	}

	@Override
	public List<PizzaOrder> viewAllPizzaOrders() {
		
		 List<PizzaOrder> pizzaOrderList = PizzaOrderRepository.findAll();
			return pizzaOrderList;
	}

	@Override
	public List<PizzaOrder> viewPizzaOrderByStartAndEndDate(LocalDate startDate, LocalDate endDate) {
		
		System.out.println(startDate);
		System.out.println(endDate);
		return null;
	}

	@Override
	public List<PizzaOrder> viewPizzaOrderByDate(LocalDate date) {
		
		return null;
	}

	@Override
	public List<PizzaOrder> viewPizzaOrderByCustomerId(Integer customerId) {
	
		return null;
	}

	@Override
	public List<PizzaOrder> viewPizzaOrderByStatus(String status) {
		
		return null;
	}

	@Override
	public List<PizzaOrder> viewPizzaOrderByCustomerIdAndStatus(Integer customerId, String status) {
	
		return null;
	}

	

}
