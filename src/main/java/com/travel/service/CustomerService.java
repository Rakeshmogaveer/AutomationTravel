package com.travel.service;

import com.travel.entity.Customer;
import com.travel.exception.CustomerNotFoundException;
import com.travel.model.CustomerDTO;

public interface CustomerService {

	public Customer addCustomer(CustomerDTO routeDto);
	public Customer modifyCustomer(CustomerDTO routeDto) throws CustomerNotFoundException;
	public String deleteCustomer(int userId)throws CustomerNotFoundException;
	public CustomerDTO viewCustomer(int userId) throws CustomerNotFoundException;
}
	

