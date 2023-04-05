package com.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class FetchDemo {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = null;
		Session session = null;
		
		try {
			 sessionFactory = new Configuration().configure().buildSessionFactory();
			 session = sessionFactory.openSession();
			 
			 // get(), load() : studentId : 101
			 
			 Student student1 = session.load(Student.class, 101);
			 Student student2 = session.load(Student.class, 102);
			 
			 System.out.println(student1);
			 System.out.println(student2);
			 
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		
		
		
		
		
		
	
		
		
	}

}
