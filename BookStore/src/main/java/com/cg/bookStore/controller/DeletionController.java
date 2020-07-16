package com.cg.bookStore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeletionController {
	
@RequestMapping("/hello")
public String helloWorld()
	{
		return "Hello";
	}

}

