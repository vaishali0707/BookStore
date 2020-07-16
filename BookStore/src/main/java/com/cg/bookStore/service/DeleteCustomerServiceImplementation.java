package com.cg.bookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookStore.dao.DeleteCustomerDao;

/********************************************************************************
 * @author        Vaishali Tiwari 
 * Description    This is a service class performing services such as 
                  deleting customer account,calling other functions to perform
 *                services 
 * Created On     16-July-2020
 ********************************************************************************/
@Service
public class DeleteCustomerServiceImplementation implements DeleteCustomerService{
	
	@Autowired
	DeleteCustomerDao deleteCustomer;
	
	@Override
	public boolean checkCustomerExists(int customerId)
	{
		return deleteCustomer.checkCustomerExists(customerId);
	}
	
	@Override
	public boolean deleteCustomer(int customerId)
	{
		return deleteCustomer.deleteCustomer(customerId);
	}
		
}
