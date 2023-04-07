package com.hibernate.OneToOne.bidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;

		try {
			sessionFactory = new Configuration().configure("hibernate1.cfg.xml").buildSessionFactory();
			session = sessionFactory.openSession();

			// create User
			
			User user1 = new User();
			user1.setUserId(101);
			user1.setUserName("Sayan Sengupta");
			
			User user2 = new User();
			user2.setUserId(102);
			user2.setUserName("Ramesh Sinha");
			
			// create creds
			
			UserCredentials cred1 = new UserCredentials();
			cred1.setCredId(201);
			cred1.setUsername("sayan");
			cred1.setPassword("12345");
			
			UserCredentials cred2 = new UserCredentials();
			cred2.setCredId(202);
			cred2.setUsername("ramesh");
			cred2.setPassword("12345");
			
			cred1.setUser(user1);
			cred2.setUser(user2);
			
			tx = session.beginTransaction();
			
			session.save(user1);
			session.save(user2);
			session.save(cred1);
			session.save(cred2);
			
			
			tx.commit();
			System.out.println("Success!");

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
			sessionFactory.close();
		}
	}
}
