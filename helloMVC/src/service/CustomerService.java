package service; 

import java.util.HashMap; 
import java.util.Map; 


import model.Customer; 

public class CustomerService { 

	private Map<String, Customer> customers; 
	private static final CustomerService instance = new CustomerService(); 
	private CustomerService() { 
		customers = new HashMap<String, Customer>(); 
	} 

	public static CustomerService getInstance() { 
		return instance; 
	} 

	public void addCustomer(Customer customer)
	{ 
		customers.put(customer.getId(), customer);  
	} 

	public Customer login(String id, String password) { 
		
		Customer customer = customers.get(id.toLowerCase()); 

		if (customer != null) { 
	
			if (password.equals(customer.getPassword()))
			{ 
	
				return customer; 
			} 
	
			else 
				return null; 
		} 
		else 
			return null; 
	} 


} 
