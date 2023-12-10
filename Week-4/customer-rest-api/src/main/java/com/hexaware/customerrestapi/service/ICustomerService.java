package com.hexaware.customerrestapi.service;

import java.util.List;

import com.hexaware.customerrestapi.dto.CustomerDTO;
import com.hexaware.customerrestapi.dto.CustomerProductVO;
import com.hexaware.customerrestapi.entity.Customer;

public interface ICustomerService {
	
	
	public Customer	addCustomer(CustomerDTO customerDTO);
		
	public CustomerDTO	getCustomerById(int customerId);
		
	public List<Customer>	getAllCustomer();
	
	public   CustomerProductVO   getCustomerAndProductById(int customerId);
	
}

