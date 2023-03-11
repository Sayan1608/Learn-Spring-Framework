package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("confign/spring-config-autowire.xml");

		Student student1 = context.getBean("student1", Student.class);

		System.out.println(student1);
	}

}
