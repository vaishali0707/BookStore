package com.cg.bookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookStore.dao.BookStoreDao;

/********************************************************************************
 * @author        Vaishali Tiwari 
 * Description    This is a service class performing service deleting user
                  account,calling other functions to perform services 
 * Created On     16-July-2020
 ********************************************************************************/

@Service
public class BookStoreServiceImplementation implements BookStoreService{
	
	@Autowired
	BookStoreDao bookStoreDao;
	
	@Override
	public boolean deleteUser(int adminId)
	{
		return bookStoreDao.deleteUser(adminId);
	}
	
	@Override
	public boolean checkCustomerExists(int customerId)
	{
		return bookStoreDao.checkCustomerExists(customerId);
	}
	
	@Override
	public boolean deleteCustomer(int customerId)
	{
		return bookStoreDao.deleteCustomer(customerId);
	}
	

}
