package com.cg.bookStore.dao;

public interface BookStoreDao {
	
	public boolean checkCustomerExists(int customerId);
	
	public boolean deleteCustomer(int customerId);
	
	public boolean deleteUser(int adminId);

}
