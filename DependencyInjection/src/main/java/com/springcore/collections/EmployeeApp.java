package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("confign/spring-config-collections.xml");
		
		Employee employee1 = context.getBean("emp1", Employee.class);
		
		System.out.println(employee1.getEmployeeName());
		System.out.println(employee1.getPhoneNumbers());
		System.out.println(employee1.getCities());
		System.out.println(employee1.getCourses());
	}
}
