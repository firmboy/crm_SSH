package com.itcast.crm.test;

import org.junit.Test;

import com.itcast.crm.customer.domain.Customer;
import com.itcast.crm.customer.service.CustomerService;
import com.itcast.crm.customer.service.impl.CustomerServiceImpl;

public class Hibernate_test {
	
	@Test
	public void test1(){
		Customer customer = new Customer();
		customer.setCust_name("玛利亚");
		CustomerService service = new CustomerServiceImpl();
		service.save(customer);
	}
}
