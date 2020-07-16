package com.cg.bookStore.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cg.bookStore.entities.CustomerInformation;

@Transactional
@Repository
public class DeleteCustomerDaoImplementation implements DeleteCustomerDao {
	
	@Autowired
	EntityManager entityManager;
	

	/********************************************************************************
	 * Method            checkCustomerExist 
	 * Description       for checking whether the customer account exists or not
	 * returns boolean   returns true if account exists otherwise returns false if 
	 *                   account does not exists 
	 * Created By        Vaishali Tiwari                   
	 * Created on        16-July-2020
	 **********************************************************************************/
	
	@Override
	public boolean checkCustomerExists(int customerId) {
		return entityManager.contains(entityManager.find(CustomerInformation.class, customerId));
	}
	

	/********************************************************************************
	 * Method            deleteCustomer
	 * Description       for deleting customer's account if he doesn't have any active
	 *                   order and he has not given any review.
	 * returns boolean   returns true if account gets deleted otherwise returns false if 
	 *                   account does not gets deleted
	 * Created By        Vaishali Tiwari                   
	 * Created on        16-July-2020
	 **********************************************************************************/
	
	@Override
	public boolean deleteCustomer(int customerId)
	{
		return false;
		
	}
	


}
