package com.cg.bookStore;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import com.cg.bookStore.controller.BookStoreController;
import com.cg.bookStore.service.BookStoreService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = BookStoreController.class)
public class RestControllerTesting extends BookStoreApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private BookStoreService service;
	
	@Test
	public void testDeleteUser() throws Exception {
	}
}