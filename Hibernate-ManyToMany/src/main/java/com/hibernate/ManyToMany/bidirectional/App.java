package com.hibernate.ManyToMany.bidirectional;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction tx = null;
        
        try {
        	sessionFactory = new Configuration().configure("hibernate1.cfg.xml").buildSessionFactory();
        	session = sessionFactory.openSession();
        	
        	
        	tx = session.beginTransaction();
        	
        	// code to save data
        	
        	Employee emp1 = new Employee();
        	emp1.setEmployeeId(101);
        	emp1.setEmployeeName("Ram");
        	
        	Employee emp2 = new Employee();
        	emp2.setEmployeeId(102);
        	emp2.setEmployeeName("Shyam");
        	
        	Employee emp3 = new Employee();
        	emp3.setEmployeeId(103);
        	emp3.setEmployeeName("Piyush");
        	
        	
        	Project proj1 = new Project();
        	proj1.setProjectId(201);
        	proj1.setProjectName("Library Management System");
        	
        	
        	Project proj2 = new Project();
        	proj2.setProjectId(202);
        	proj2.setProjectName("Employee Management Portal");
        	
        	List<Employee> employeeList = new ArrayList();
        	List<Project> projectList = new ArrayList();
        	
        	employeeList.add(emp1);
        	employeeList.add(emp2);
        	employeeList.add(emp3);
        	
        	projectList.add(proj1);
        	projectList.add(proj2);
        	
        	emp1.getProjects().add(proj1);
        	
        	emp2.setProjects(projectList);
        	
        	
        	emp3.getProjects().add(proj2);
        	
        	
        	
        	
        	session.save(emp1);
        	session.save(emp2);
        	session.save(emp3);
        	
        	session.save(proj1);
        	session.save(proj2);
        	
        	
        	
        	
        	
        	
        	
        	tx.commit();
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			session.close();
			sessionFactory.close();
		}
    }
}
