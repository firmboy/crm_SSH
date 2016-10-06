package com.itcast.crm.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itcast.crm.customer.domain.Customer;
import com.itcast.crm.customer.service.CustomerService;

public class Spring_hibernate {
	
	/**
	 * 测试整合struts2框架
	 * 将action的创建交给Spring框架
	 */
	@Test
	public void test2(){
		try {
			Customer c = new Customer();
			c.setCust_name("吉泽");
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			CustomerService service =(CustomerService) context.getBean("customerService");
			service.save(c);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//1.测试依赖关系，
	//2.测试在Application中配置的hibernae的参数是否正确
	//3.测试事务配置是否正确
	@Test
	public void test1(){
		try {
			Customer c = new Customer();
			c.setCust_name("吉泽");
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			CustomerService service =(CustomerService) context.getBean("customerService");
			service.save(c);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
