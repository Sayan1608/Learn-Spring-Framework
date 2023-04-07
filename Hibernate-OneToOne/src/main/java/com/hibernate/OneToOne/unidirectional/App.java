package com.hibernate.OneToOne.unidirectional;

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

			// create Question

			Question q1 = new Question();
			q1.setquestionId(347);
			q1.setQuestionStatement("What is matter ?");

			Question q2 = new Question();
			q2.setquestionId(345);
			q2.setQuestionStatement("What is photosynthesis ?");

			Answer a1 = new Answer();
			a1.setAnswerId(290);
			a1.setAnswer("Any substance that has mass and occupies space.");

			Answer a2 = new Answer();
			a2.setAnswerId(259);
			a2.setAnswer(
					"the process by which plants use sunlight, water, and carbon dioxide to create oxygen and energy in the form of sugar");

			q1.setAnswer(a1);
			q2.setAnswer(a2);

			tx = session.beginTransaction();

			session.save(q1);
			session.save(q2);
			session.save(a1);
			session.save(a2);

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
