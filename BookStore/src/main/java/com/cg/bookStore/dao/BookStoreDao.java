package com.cg.bookStore.dao;

import com.cg.bookStore.entities.CustomerInformation;
import com.cg.bookStore.entities.OrderInformation;
import com.cg.bookStore.exception.UserException;

public interface BookStoreDao {
	
	public boolean deleteUser(int adminId) throws UserException;

	CustomerInformation getCustomerByEmail(String email) throws UserException;

	boolean getCustomerReviewStatus(int customerId);

	boolean getOrderInformationStatus(int customerId);

	CustomerInformation getCustomer(Integer customer_id);

	void deleteCustomer(CustomerInformation customer, OrderInformation order);

	OrderInformation getOrderByCustomer(int customerId);

}
