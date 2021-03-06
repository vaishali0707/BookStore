package com.cg.bookStore;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.boot.CommandLineRunner;

import com.cg.bookStore.dao.BookStoreDao;
import com.cg.bookStore.entities.Admin;
import com.cg.bookStore.entities.CustomerInformation;
import com.cg.bookStore.entities.CustomerReview;
import com.cg.bookStore.entities.OrderInformation;

@SpringBootApplication
@Transactional
public class BookStoreApplication implements CommandLineRunner{
	
	@Autowired
	EntityManager entityManager;
	
	@Autowired
	BookStoreDao dao;

	public static void main(String[] args) {
		
		SpringApplication.run(BookStoreApplication.class, args);	
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		
//		Admin admin1= new Admin("Admin1@capgemini.com"," Admin12345","Admin@123");
//		Admin admin2=new Admin("Admin2@capgemini.com","Admin24567","Admin@123");
//		Admin admin3=new Admin("Admin3@capgemini.com","Admin34567","Admin@123");
//		entityManager.persist(admin1);
//		entityManager.persist(admin2);
//		entityManager.persist(admin3);
		
//	    LocalDate localDate= LocalDate.now();
//		CustomerInformation customer1 = new CustomerInformation("customer1@capgemini.com","customer1","custom@123","1234567890","city1",123456,"country1",localDate);
//		CustomerInformation customer2 = new CustomerInformation("customer2@capgemini.com","customer2","custom@123","1234567890","city2",123456,"country2",localDate);
//		CustomerInformation customer4 = new CustomerInformation("customer4@capgemini.com","customer4","custom@123","1234567890","city4",123456,"country4",localDate);
//		entityManager.persist(customer1);
//		entityManager.persist(customer2);
//		entityManager.persist(customer4);
		
//		CustomerReview review1=new CustomerReview(1,"A very Nice book","Awesome book,one should must read",84);
//		entityManager.persist(review1);
//		CustomerReview review2=new CustomerReview(1,"NOT A GOOD book","WASTE OF MONEY",103);
//		entityManager.persist(review2);
//		
//		CustomerInformation customer5=dao.getCustomer(121);
//		OrderInformation order=new OrderInformation(customer5,"mera ghar",5,new Float(500.55),new Float(500.55),"delivered","cash");
//  	entityManager.persist(order);
//		CustomerInformation customer=dao.getCustomer(102);
//		OrderInformation order2=new OrderInformation(customer,"Kanpur",3,new Float(300.55),new Float(1501.55),"processing","cash");
//		entityManager.persist(order2);

	}
}

