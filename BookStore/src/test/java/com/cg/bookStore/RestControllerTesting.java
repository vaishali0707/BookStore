package com.cg.bookStore;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.cg.bookStore.controller.DeletionController;


public class RestControllerTesting extends BookStoreApplicationTests {

	@Autowired
	private WebApplicationContext webApplicationContext;

	
	@InjectMocks
	private DeletionController deletionController;
	
	private MockMvc mockMvc;
	
	
	@Before
	public void setup() throws Exception {
	//	mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		mockMvc = MockMvcBuilders.standaloneSetup(deletionController).build();
	}
	
	@Test
	public void demoTest() throws Exception
	{
		mockMvc.perform(get("/hello"))
		.andExpect(status().isOk())
		.andExpect(content().string("Hello"));
	
	
	}
}