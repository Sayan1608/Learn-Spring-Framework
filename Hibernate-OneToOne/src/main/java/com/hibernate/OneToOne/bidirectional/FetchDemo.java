package com.hibernate.OneToOne.bidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			sessionFactory = new Configuration().configure("hibernate1.cfg.xml").buildSessionFactory();
			session = sessionFactory.openSession();

			User user = session.get(User.class, 102);

			System.out.println("UserId : " + user.getUserId() + " : " + user.getUserName() + "\nCreds : "
					+ user.getUserCredentials());

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
			sessionFactory.close();
		}
	}

}
