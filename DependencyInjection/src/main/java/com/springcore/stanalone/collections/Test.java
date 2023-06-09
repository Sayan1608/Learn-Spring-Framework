package com.springcore.stanalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = 
					new ClassPathXmlApplicationContext("confign/spring-config-standalone-collections.xml");
		
		Person person1 = context.getBean("person1", Person.class);
		
		System.out.println(person1.getFriendList());
		System.out.println(person1.getCities());
		System.out.println("____________________________________");
//		System.out.println(person1.getCities().getClass().getName());
		System.out.println(person1.getFeeStructure());
		System.out.println(person1.getProperties());
	}

}
