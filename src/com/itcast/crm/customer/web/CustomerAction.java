package com.itcast.crm.customer.web;

import org.aopalliance.intercept.MethodInterceptor;
import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.web.util.WebAppRootListener;

import com.itcast.crm.customer.domain.Customer;
import com.itcast.crm.customer.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private CustomerService service;
	public void setCustomerService(CustomerService service){
		this.service = service;
	}
	
	
	public String add(){
		System.out.println("hehe");
		return null;
	}
	public String execute(){
		System.out.println("整合成功");
		System.out.println("========================================");
		return SUCCESS;
	}
	public String save(){
		Customer customer = new Customer();
		customer.setCust_name("小苍");
		service.save(customer);
		return SUCCESS;
	}
}
