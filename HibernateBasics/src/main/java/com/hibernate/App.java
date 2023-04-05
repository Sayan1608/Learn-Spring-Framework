package com.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Address;
import com.hibernate.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        
        System.out.println(sessionFactory);
        
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        
        Student student2 = new Student(101, "Sayan Sengupta", "Durgapur");
        
        Address ad1 = new Address();
        ad1.setStreet("Dacres Lane");
        ad1.setCity("Kolkata");
        ad1.setX(123.25);
        ad1.setAddedDate(new Date());
        
        FileInputStream fis = new FileInputStream("src/main/java/img/DP.jpg");
        byte[] image = new byte[fis.available()];
        fis.read(image);
        
        ad1.setImage(image);
        
        session.save(student2);
        session.save(ad1);
        
        session.getTransaction().commit();
        
        System.out.println("done..");
    }
}
