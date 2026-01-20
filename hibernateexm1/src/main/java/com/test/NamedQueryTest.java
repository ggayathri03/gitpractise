package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class NamedQueryTest {
  public static void main(String[] args) {
	  Configuration cfg =new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session= sf.openSession();
		//TypedQuery query=session.createQuery("customquery");
		//query.setParameter("name", "Spring notes");
		//List<Book> books=query.getResultList();
		Query query =session.createNamedQuery("customquery");
		query.setParameter("name","Spring notes");
		List<Book> books=query.getResultList();
		System.out.println("Named Query Result");
		System.out.println(books);
		session.close();
  }
}
