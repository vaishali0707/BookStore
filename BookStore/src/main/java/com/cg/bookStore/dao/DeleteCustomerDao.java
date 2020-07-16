package com.cg.bookStore.dao;

public interface DeleteCustomerDao {
	
	public boolean checkCustomerExists(int customerId);
	
	public boolean deleteCustomer(int customerId);

}
