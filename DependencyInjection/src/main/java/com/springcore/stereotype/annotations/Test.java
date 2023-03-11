package com.springcore.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("confign/spring-stereotype-config.xml");
		
		Person person = context.getBean("ob", Person.class);
		
		System.out.println(person);
		System.out.println(person.getPhoneNumbers());
		
	}

}
