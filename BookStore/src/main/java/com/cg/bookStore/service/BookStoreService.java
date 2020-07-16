package com.cg.bookStore.service;

public interface BookStoreService {
	
	public boolean checkCustomerExists(int customerId);
	
	public boolean deleteCustomer(int customerId);
	
	public boolean deleteUser(int adminId);

}
