package com.cg.bookStore.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.cg.bookStore.entities.Admin;

@Transactional
@Repository
public class DeleteUserDaoImplementation implements DeleteUserDao{
	

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
	public boolean deleteUser(int adminId){
		
		if(entityManager.contains(entityManager.find(Admin.class, adminId)))
		{
		Admin user = entityManager.find(Admin.class, adminId);
		entityManager.remove(user);
		return true;
		}
		else
		{
			return false;
		}
		
	}
	
	

}
