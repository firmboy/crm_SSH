package com.itcast.crm.customer.dao.impl;


import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.itcast.crm.customer.dao.CustomerDao;
import com.itcast.crm.customer.domain.Customer;
import com.itcast.crm.customer.utils.HibernateUtils;

@Component
public class CustomerDaoImpl implements CustomerDao {
	
	@Resource
	private SessionFactory factory;
	public void setSessionFactory(SessionFactory factory) {
		this.factory = factory;
	}
	/**
	 * 保存用户
	 */
	public void save(Customer customer) {
		try {
			Session session = factory.getCurrentSession();
			System.out.println("保存方法正在执行");
			session.save(customer);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
