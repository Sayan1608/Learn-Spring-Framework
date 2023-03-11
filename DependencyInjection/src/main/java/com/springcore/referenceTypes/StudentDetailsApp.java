package com.springcore.referenceTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDetailsApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("confign/spring-config-ref.xml");
		
		Student student1 = context.getBean("student1", Student.class);
		
		Student student2 = context.getBean("student2", Student.class);
		

		System.out.println("Student Name : " + student1.getStudentName());
		System.out.println("Studnent Address : \nStreet : "+student1.getStudentAddress().getStreet()
											+"\nCity: " + student1.getStudentAddress().getCity()
											+"\nState : "+student1.getStudentAddress().getState()
											+"\nCountry : "+student1.getStudentAddress().getCountry());
		
		System.out.println("***********************************************************************");
		
		System.out.println("Student Name : " + student2.getStudentName());
		System.out.println("Studnent Address : \nStreet : "+student2.getStudentAddress().getStreet()
											+"\nCity: " + student2.getStudentAddress().getCity()
											+"\nState : "+student2.getStudentAddress().getState()
											+"\nCountry : "+student2.getStudentAddress().getCountry());
		
	}

}
