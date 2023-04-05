package com.hibernate.OneToMany.bidirectional;

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

			// open session

			session = sessionFactory.openSession();

			Account acc1 = session.get(Account.class, 202);

			System.out.println("AccountId : " + acc1.getAccountId() + "\nAccountName: " + acc1.getAccountName()
					+ "\nUserName : " + acc1.getUser().getUserName());

			System.out.println("success");

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
			sessionFactory.close();
		}
	}

}
