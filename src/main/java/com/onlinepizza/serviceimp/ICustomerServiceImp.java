package com.onlinepizza.serviceimp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinepizza.entity.Customer;
import com.onlinepizza.repository.CustomerRepository;
import com.onlinepizza.service.ICustomerService;

@Service
public class ICustomerServiceImp implements ICustomerService {

	@Autowired
	 CustomerRepository customerRepository;

	
	@Override
	public Customer registerCustomer(Customer customer) {
	return customerRepository.save(customer);
	}

	
	@Override
	public Customer updateCustomer(Customer customer) {
	Customer object=new Customer();
		
		object.setCustomerName(customer.getCustomerName());
		object.setCustomerMobile(customer.getCustomerMobile());
		object.setCustomerEmail(customer.getCustomerEmail());
		object.setCustomerAddress(customer.getCustomerAddress());

		return customerRepository.save(customer);
	}

	
	@Override
	public Customer viewCustomerByPhone(Long phoneNo) {
	        return customerRepository.findByCustomerMobile(phoneNo);
	            
	}
	
	
	@Override     
	public List<Customer> viewAllCustomer() {

//	        List<Customer> customersList = customerRepository.findAll();
//			return customersList;
		return customerRepository.findAll();

	      
	}

	
	@Override
	public Customer viewCustomerById(Integer customerId) {
		return customerRepository.findById(customerId).get();
		
		
	} 
	        


}
