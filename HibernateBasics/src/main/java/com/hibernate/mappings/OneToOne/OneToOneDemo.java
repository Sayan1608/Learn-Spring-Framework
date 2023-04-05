package com.hibernate.mappings.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneDemo {

	public static void main(String[] args) {

		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;

		try {

			sessionFactory = new Configuration().configure().buildSessionFactory();
			Answer a1 = new Answer();
			a1.setAnswerId(344);
			a1.setAnswer("Java is a programming language");
			

			Answer a2 = new Answer();
			a2.setAnswerId(345);
			a2.setAnswer("OOPs is a programming structure built using the concept of Classes and objects.");

			Question q1 = new Question();
			q1.setQuestionId(1212);
			q1.setQuestion("What is Java ?");
			q1.setAnswer(a1);
			a1.setQuestion(q1);

			Question q2 = new Question();
			q2.setQuestionId(1205);
			q2.setQuestion("What is OOPS ?");
			q2.setAnswer(a2);
			a2.setQuestion(q2);

			session = sessionFactory.openSession();

			tx = session.beginTransaction();
			
			session.save(q1);
			session.save(q2);
			
			session.save(a1);
			session.save(a2);
			
			tx.commit();
			
			
			// fetch question
			
			Question question =  session.load(Question.class, 1212);
			System.out.println(q1.getQuestion() +" : " + q1.getAnswer().getAnswer());

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
			sessionFactory.close();
		}
		
		System.out.println("done");

	}

}
