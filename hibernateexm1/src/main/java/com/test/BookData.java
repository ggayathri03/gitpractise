package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class BookData {  
	
	public static void main(String[] args) {
		
		Configuration cfg =new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session= sf.openSession();
		
		Transaction t=session.beginTransaction();
		
		Book obj = new Book();
		
		obj.setB_name("Spring boot");
		
		obj.setB_author("Jay");
		
		obj.setB_price(250);
		
		//session.persist(obj);
		
		//t.commit();
		Book dt=session.get(Book.class,52);
	    System.out.println("done...");
		System.out.println(dt.getId()+" "+dt.getB_name()+" "+dt.getB_author()+" "+dt.getB_price());
		session.remove(dt);
		 
		session.close();
	}
 
}
 