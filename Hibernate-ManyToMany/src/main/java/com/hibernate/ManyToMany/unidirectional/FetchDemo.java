package com.hibernate.ManyToMany.unidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
        Session session = null;
        Transaction tx = null;
        
        try {
        	sessionFactory = new Configuration().configure("hibernate1.cfg.xml").buildSessionFactory();
        	session = sessionFactory.openSession();
        	
        	Book book = session.get(Book.class, 501);
        	
        	System.out.println(book.getBookId() + " : " + book.getBookTitle() + "\nAuthors : " + book.getAuthors());
        	
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
			sessionFactory.close();
		}
	}

}
