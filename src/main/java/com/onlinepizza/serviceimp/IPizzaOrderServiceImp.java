package com.onlinepizza.serviceimp;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinepizza.entity.Customer;
import com.onlinepizza.entity.PizzaOrder;
import com.onlinepizza.repository.PizzaOrderRepository;
import com.onlinepizza.service.IPizzaOrderService;

@Service
public class IPizzaOrderServiceImp implements IPizzaOrderService {

	@Autowired
	PizzaOrderRepository pizzaOrderRepository;

	@Override
	public PizzaOrder bookPizzaOrder(PizzaOrder order) {

		return pizzaOrderRepository.save(order);
	}

	@Override
	public PizzaOrder updatepizzaOrder(PizzaOrder pizzaOrder) {
		PizzaOrder object = new PizzaOrder();

		object.setBookingOrderId(pizzaOrder.getBookingOrderId());
		object.setCustomer(pizzaOrder.getCustomer());
		object.setDateTimeOfOrder(pizzaOrder.getDateTimeOfOrder());
		object.setPizzaList(pizzaOrder.getPizzaList());
		object.setQuantity(pizzaOrder.getQuantity());
		object.setStatus(pizzaOrder.getStatus());
		object.setTotalCost(pizzaOrder.getTotalCost());

		return object;
	}

	@Override
	public String cancelPizzaOrder(Integer pizzaId) {

		pizzaOrderRepository.deleteById(pizzaId);
		return "Order Cancelled";
	}

	@Override
	public PizzaOrder viewPizzaOrderById(Integer pizzaOrderId) {

//		return PizzaOrderRepository.findBybookingOrderId(pizzaOrderId);

		return pizzaOrderRepository.findById(pizzaOrderId).get();
	}

	@Override
	public List<PizzaOrder> viewAllPizzaOrders() {

		List<PizzaOrder> pizzaOrderList = pizzaOrderRepository.findAll();
		return pizzaOrderList;
	}

	@Override
	public List<PizzaOrder> viewPizzaOrderByStartAndEndDate(LocalDate startDate, LocalDate endDate) {

//		System.out.println(startDate);
//		System.out.println(endDate);
		return pizzaOrderRepository.findAll().stream()
				.filter(e -> e.getDateTimeOfOrder().toLocalDate().isAfter(startDate)
						&& e.getDateTimeOfOrder().toLocalDate().isBefore(endDate))
				.collect(Collectors.toList());
	}

	@Override
	public List<PizzaOrder> viewPizzaOrderByDate(LocalDate date) {

		return pizzaOrderRepository.findAll().stream().filter(e -> e.getDateTimeOfOrder().toLocalDate().isEqual(date))
				.collect(Collectors.toList());
	}

	@Override
	public List<PizzaOrder> viewPizzaOrderByCustomerId(Integer customerId) {

		return pizzaOrderRepository.findAll().stream().filter(e -> e.getCustomer().getUserId() == customerId)
				.collect(Collectors.toList());
	}

	@Override
	public List<PizzaOrder> viewPizzaOrderByStatus(String status) {

		return pizzaOrderRepository.findAll().stream().filter(e -> e.getStatus().toString().equals(status))
				.collect(Collectors.toList());
	}

	@Override
	public List<PizzaOrder> viewPizzaOrderByCustomerIdAndStatus(Integer customerId, String status) {

		return pizzaOrderRepository.findAll().stream()
				.filter(e -> e.getCustomer().getUserId() == customerId && e.getStatus().toString().equals(status))
				.collect(Collectors.toList());
	}

}
