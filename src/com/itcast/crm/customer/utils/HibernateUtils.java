package com.itcast.crm.customer.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory factory = null;
	static{
		Configuration config = new Configuration();
		config.configure();
		factory = config.buildSessionFactory();
	}
	
	public static Session getCurrentSession(){
		return factory.getCurrentSession();
	}
	
	public static Session openSession(){
		return factory.openSession();
	}
	
	public static void main(String[] args){
		openSession();
	}
}
