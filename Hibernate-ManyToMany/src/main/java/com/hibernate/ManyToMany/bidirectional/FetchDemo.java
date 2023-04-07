package com.hibernate.ManyToMany.bidirectional;

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
        	session = sessionFactory.openSession();
        	
        	
        	Project project1 = session.get(Project.class, 202);
        	
        	System.out.println(project1.getProjectId() + " : " + project1.getProjectName() + "\nAssigned to : " + project1.getEmployees());
        	
        	System.out.println("*********************************");
        	
        	Employee emp1 = session.get(Employee.class, 102);
        	
        	System.out.println(emp1.getEmployeeId() + " : " + emp1.getEmployeeName() + "\nAssigned Projects : " + emp1.getProjects());
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
			sessionFactory.close();
		}
	}

}
