package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Certificate;
import com.hibernate.entity.Student;

public class EmbeddableDemo {

	public static void main(String[] args) {

		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;

		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			
			System.out.println(session);

			tx = session.beginTransaction();

			// code to save Student

			Certificate certificate1 = new Certificate("JAVA", "4 months");
			Certificate certificate2 = new Certificate("DBMS", "1 months");

			Student student1 = new Student();

			student1.setId(201);
			student1.setName("Ram Kumar");
			student1.setCity("Mumbai");
			student1.setCertificate(certificate1);

			Student student2 = new Student();

			student2.setId(202);
			student2.setName("Shyam Kumar");
			student2.setCity("Delhi");
			student2.setCertificate(certificate2);

			session.save(student1);
			session.save(student2);

			tx.commit();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			session.close();
			sessionFactory.close();
		}
	}

}
