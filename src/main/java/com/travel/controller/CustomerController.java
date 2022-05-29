package com.travel.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.entity.Customer;
import com.travel.exception.CustomerNotFoundException;
import com.travel.model.CustomerDTO;
import com.travel.service.CustomerService;

@RestController
@CrossOrigin(origins = "http://localhost", maxAge = 3600)
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value = "/addCustomer")
	public Customer addCustomer(@RequestBody @Valid CustomerDTO customerDto) {
		return customerService.addCustomer(customerDto);
	}
	@PutMapping(value = "/modifyCustomer")
	public Customer modifyCustomer(@RequestBody @Valid  CustomerDTO customerDto) throws CustomerNotFoundException{
		return customerService.modifyCustomer(customerDto);
	}
	@DeleteMapping(value = "/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable("id") int userId) throws CustomerNotFoundException {
		return customerService.deleteCustomer(userId);
	}
	@GetMapping(value = "/getCustomer/{id}")
	public CustomerDTO viewCustomer(@PathVariable("id") int userId) throws CustomerNotFoundException{
		return customerService.viewCustomer(userId);
	}
	
}
