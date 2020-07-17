package com.cg.bookStore.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.cg.bookStore.entities.Admin;
import com.cg.bookStore.entities.CustomerInformation;
import com.cg.bookStore.entities.CustomerReview;
import com.cg.bookStore.entities.OrderInformation;
import com.cg.bookStore.exception.UserException;

@Transactional
@Repository
public class BookStoreDaoImplementation implements BookStoreDao{
	

	@PersistenceContext
	EntityManager entityManager;
	

	/********************************************************************************
	 * Method            deleteUser 
	 * Description       for checking whether the account exists or not and then
	 *                   deleting it
	 * returns boolean   returns true if account exists and gets deleted
	 *                   otherwise returns false if account does not exists 
	 * Created By        Vaishali Tiwari                   
	 * Created on        16-July-2020
	 
	 **********************************************************************************/
	@Override
	public boolean deleteUser(int adminId) throws UserException{
		
		if(entityManager.contains(entityManager.find(Admin.class, adminId)))
		{
		Admin user = entityManager.find(Admin.class, adminId);
		entityManager.remove(user);
		return true;
		}
		else
		{
			throw new UserException("User Not found");
		}
		
	}
	
	@Override
	public CustomerInformation getCustomerByEmail(String email) throws UserException{
		
		CustomerInformation customer=null;
		try {
			
			String Qstr="Select customer From CustomerInformation customer Where customer.emailAddress=:email";
			TypedQuery<CustomerInformation> query=entityManager.createQuery(Qstr, CustomerInformation.class).setParameter("email", email);
			customer=query.getSingleResult();
		}
		catch(Exception e){
			
			throw new UserException("Customer not found.");
		}
		return customer;
	}
	
	@Override
	public boolean getCustomerReviewStatus(int customerId) throws UserException{
		
		try {
			String Qstr="Select review From CustomerReview review Join review.customerDetails customer Where customer.customerId=:customerId";
			TypedQuery query = entityManager.createQuery(Qstr, CustomerReview.class);
			query.getSingleResult();
		}
		catch(Exception e){
			
			throw new UserException("Cannot delete as customer has given a review");
		}
		return false;
	}
	
	@Override
	public boolean getOrderInformationStatus(int customerId) throws UserException{ 
		
		//returns false if no order is found
		
		try {
			String Qstr="Select order From OrderInformation order Join order.customerDetails customer Where customer.customerId=:customerId";
			TypedQuery query = entityManager.createQuery(Qstr, OrderInformation.class);
			query.getSingleResult();
		}
		catch(Exception e){
			
			throw new UserException("Cannot delete as Customer has an active order");
		}
		return false;
	}
	
	@Override
	public boolean deleteCustomer(CustomerInformation customer){
		
		entityManager.remove(customer);
		return true;
	}
		
}
