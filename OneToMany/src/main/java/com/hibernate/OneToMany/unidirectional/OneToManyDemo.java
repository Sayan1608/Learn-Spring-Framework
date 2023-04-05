package com.hibernate.OneToMany.unidirectional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;

		try {
			System.out.println("Persisting Begins...");
			sessionFactory = new Configuration().configure().buildSessionFactory();

//			// Create Question
//
			Question q1 = new Question();
			q1.setQuestionId(1002);
			q1.setQuestion("What is Hibernate ?");
//
//			// create answers
//
			Answer a1 = new Answer();
			a1.setAnswerId(301);
			a1.setAnswer("Hibernate is a ORM tool");

			Answer a2 = new Answer();
			a2.setAnswerId(302);
			a2.setAnswer("Hibernate helps to map object in Java Application to tables in Database");

			Answer a3 = new Answer();
			a3.setAnswerId(303);
			a3.setAnswer("Hibernate increases execution speed due to caching");

			List<Answer> answer1 = new ArrayList<Answer>();
			answer1.add(a1);
			answer1.add(a2);
			answer1.add(a3);
			q1.setAnswers(answer1);

			// open session

			session = sessionFactory.openSession();

			tx = session.beginTransaction();

			session.save(q1);
			session.save(a1);
			session.save(a2);
			session.save(a3);

			// commit the transaction

			tx.commit();
			
			// fetch question along with answers
			
//			Question question1 = session.get(Question.class, 1001);
//			
//			System.out.println("Question : "+question1.getQuestion());
//			
//			List<Answer> answers = question1.getAnswers();
//			Iterator<Answer> itr = answers.iterator();
//			
//			while(itr.hasNext()) {
//				System.out.println(itr.next().getAnswer());
//			}
				

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
			sessionFactory.close();
		}
	}

}
