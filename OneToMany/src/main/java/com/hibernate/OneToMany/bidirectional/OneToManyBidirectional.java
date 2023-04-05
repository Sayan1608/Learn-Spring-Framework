package com.hibernate.OneToMany.bidirectional;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyBidirectional {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;

		try {
			sessionFactory = new Configuration().configure("hibernate1.cfg.xml").buildSessionFactory();

			// open session

			session = sessionFactory.openSession();

			// create user

			User user1 = new User();
			user1.setUserId(101);
			user1.setUserName("Sayan Sengupta");

			// create some accounts

			Account acc1 = new Account();
			acc1.setAccountId(201);
			acc1.setAccountName("Subho Sen");
			acc1.setUser(user1);

			Account acc2 = new Account();
			acc2.setAccountId(202);
			acc2.setAccountName("Norris Rad");
			acc2.setUser(user1);

			Account acc3 = new Account();
			acc3.setAccountId(203);
			acc3.setAccountName("Uncle Tom");
			acc3.setUser(user1);
			
			List<Account> accounts = new LinkedList();
			accounts.add(acc1);
			accounts.add(acc2);
			accounts.add(acc3);
			user1.setAccounts(accounts);

			// save the objects

			// begin Transaction

			tx = session.beginTransaction();

			session.save(user1);
			session.save(acc1);
			session.save(acc2);
			session.save(acc3);

			// commit transaction

			tx.commit();
			System.out.println("success");

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
			sessionFactory.close();
		}
	}

}
