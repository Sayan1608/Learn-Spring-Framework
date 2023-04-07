package com.hibernate.OneToOne.unidirectional;

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

			Question question = session.get(Question.class, 347);
			
			System.out.println("Question : " + question.getQuestionStatement() + "\nAnswer : " + question.getAnswer().getAnswer());

			

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
			sessionFactory.close();
		}
	}

}
