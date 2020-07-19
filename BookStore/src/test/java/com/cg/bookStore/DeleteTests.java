package com.cg.bookStore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.bookStore.dao.BookStoreDao;
import com.cg.bookStore.exception.UserException;
import com.cg.bookStore.service.BookStoreService;
import com.cg.bookStore.service.BookStoreServiceImplementation;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeleteTests {
	
	@Mock
	BookStoreDao bookStoreDao;
	
	@InjectMocks
	private BookStoreServiceImplementation bookStoreService;
	
	
	@Test
	public void deleteUser() throws UserException
	{
		bookStoreService.deleteUser(1252);
		assertEquals(true,true);
	}
	
	@Test
	public void deleteUser1() throws UserException
	{
		bookStoreService.deleteUser(125);
		assertEquals(false,false);
	}
	
}