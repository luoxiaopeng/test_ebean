package com.test_ebean;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.test_ebean.query.QCustomer;

import io.ebean.DB;

@SpringBootTest
class TestEbeanApplicationTests {

	@Test
	void contextLoads() {
		Customer customer = new Customer();
		customer.setId(2);
		customer.setName("Hello world");

		// insert the customer in the DB
		DB.save(customer);

		// Find by Id
		var customers = new QCustomer().findList();
	}

}
