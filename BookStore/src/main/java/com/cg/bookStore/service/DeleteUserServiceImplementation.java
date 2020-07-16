package com.cg.bookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookStore.dao.DeleteUserDao;

/********************************************************************************
 * @author        Vaishali Tiwari 
 * Description    This is a service class performing service deleting user
                  account,calling other functions to perform services 
 * Created On     16-July-2020
 ********************************************************************************/

@Service
public class DeleteUserServiceImplementation implements DeleteUserService{
	
	@Autowired
	DeleteUserDao deleteUser;
	
	@Override
	public boolean deleteUser(int adminId)
	{
		return deleteUser.deleteUser(adminId);
	}
	

}
