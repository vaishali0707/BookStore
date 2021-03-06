 package com.cg.bookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bookStore.dao.BookStoreDao;
import com.cg.bookStore.entities.CustomerInformation;
import com.cg.bookStore.entities.OrderInformation;
import com.cg.bookStore.exception.UserException;

/********************************************************************************
 * @author        Vaishali Tiwari 
 * Description    This is a service class performing service deleting user
                  account,calling other functions to perform services 
 * Created On     16-July-2020
 ********************************************************************************/
@Transactional
@Service
public class BookStoreServiceImplementation implements BookStoreService{
	
	@Autowired
	BookStoreDao bookStoreDao;
	
	/********************************************************************************
	 * Method            deleteUser 
	 * Description       for deleting User account
	 * Created By        Vaishali Tiwari                   
	 * Created on        16-July-2020
	 
	 **********************************************************************************/
	
	@Override
	public boolean deleteUser(int adminId) throws UserException
	{
		return bookStoreDao.deleteUser(adminId);
	}
	
	/********************************************************************************
	 * Method            deleteCustomer 
	 * Description       for deleting Customer account
	 * Created By        Vaishali Tiwari                   
	 * Created on        16-July-2020
	 * @throws UserException 
	 
	 **********************************************************************************/
	
	@Override
	public void deleteCustomer(String email) throws UserException
	{
		CustomerInformation customer=bookStoreDao.getCustomerByEmail(email);
		boolean customerReviewStatus = bookStoreDao.getCustomerReviewStatus(customer.getCustomerId());
		
		if(customerReviewStatus==true)
		{   
			throw new UserException("cannot delete as review is found");
		}
		
		boolean orderInformationStatus = bookStoreDao.getOrderInformationStatus(customer.getCustomerId());
		
		if(orderInformationStatus==true)
		{
			throw new UserException("cannot delete as order is found Active");
		}
		OrderInformation orderToDelete=bookStoreDao.getOrderByCustomer(customer.getCustomerId());
		
		bookStoreDao.deleteCustomer(customer,orderToDelete);
	}

}
