package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        
        System.out.println(sessionFactory);
        
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        
        Student student2 = new Student(102, "Aquib Khan", "Varanasi");
        
        session.save(student2);
        
        session.getTransaction().commit();
    }
}
