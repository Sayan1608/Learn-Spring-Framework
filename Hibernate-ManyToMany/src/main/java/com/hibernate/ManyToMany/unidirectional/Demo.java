package com.hibernate.ManyToMany.unidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
        Session session = null;
        Transaction tx = null;
        
        try {
        	sessionFactory = new Configuration().configure("hibernate1.cfg.xml").buildSessionFactory();
        	session = sessionFactory.openSession();
        	
        	Author author1 = new Author();
        	author1.setAuthorId(1001);
        	author1.setAuthorName("Timothy Wilson");
        	
        	Author author2 = new Author();
        	author2.setAuthorId(1002);
        	author2.setAuthorName("Chris Hemsworth");
        	
        	Book b1 = new Book();
        	b1.setBookId(501);
        	b1.setBookTitle("Abundance and Prosperity Hack");
        	b1.getAuthors().add(author1);
        	b1.getAuthors().add(author2);
        	
        	tx = session.beginTransaction();
        	
        	session.save(author1);
        	session.save(author2);
        	session.save(b1);
        	
        	tx.commit();
        	
        	System.out.println("Success!");
        	
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
			sessionFactory.close();
		}
	}

}
