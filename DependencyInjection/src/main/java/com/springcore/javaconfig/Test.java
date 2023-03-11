package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		
//		Student student = context.getBean("student1", Student.class);
//		System.out.println(student);
//		student.study();
		
		Manager manager1 = context.getBean("manager", Manager.class);
		System.out.println(manager1);
	}

}
