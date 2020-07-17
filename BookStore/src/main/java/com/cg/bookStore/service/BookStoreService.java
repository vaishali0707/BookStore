package com.cg.bookStore.service;

import com.cg.bookStore.exception.UserException;

public interface BookStoreService {

	boolean deleteUser(int adminId) throws UserException;
	
	public void deleteCustomer(String email) throws UserException;
	
	
}
