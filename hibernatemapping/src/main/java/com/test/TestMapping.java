package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMapping {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t= session.beginTransaction();
		Address adr=new Address();
		adr.setCity("Bangalore");
		adr.setState("KA");
		adr.setCountry("India");
		Employee emp=new Employee();
		
		emp.setE_name("Arjun");
		emp.setE_company("abc");
		emp.setAddress(adr);
	
		session.persist(adr);
		session.persist(emp);
		t.commit();
		System.out.println("done.. ");
		session.close();
		
	}
}
