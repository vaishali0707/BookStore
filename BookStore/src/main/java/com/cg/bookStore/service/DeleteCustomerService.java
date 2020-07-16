package com.cg.bookStore.service;

public interface DeleteCustomerService {
	
	public boolean checkCustomerExists(int customerId);
	
	public boolean deleteCustomer(int customerId);

}
