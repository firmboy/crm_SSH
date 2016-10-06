package com.itcast.crm.customer.service.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.itcast.crm.customer.dao.CustomerDao;
import com.itcast.crm.customer.dao.impl.CustomerDaoImpl;
import com.itcast.crm.customer.domain.Customer;
import com.itcast.crm.customer.service.CustomerService;
import com.itcast.crm.customer.utils.HibernateUtils;

@Component(value="customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Resource
	private CustomerDao dao;
	public void setCustomerDao(CustomerDao dao) {
		this.dao = dao;
	}

	/**
	 * 保存用户
	 */
	public void save(Customer customer) {
		/*Session session = HibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		try {
			CustomerDao dao = new CustomerDaoImpl();
			dao.save(customer);
			tr.commit();
		} catch (Exception e) {
			tr.rollback();
			throw new RuntimeException(e);
		}*/
		
		
		dao.save(customer);
	}
	
	
	
	
	
	
}
