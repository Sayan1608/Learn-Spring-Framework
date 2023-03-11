package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("confign/spring-config-ci.xml");

		Person person1 = context.getBean("person1", Person.class);

		System.out.println("Person1 details :\n" + person1);
		System.out.println("Phone Numbers : \n" + person1.getPhoneNumbers());
		System.out.println("Person Address : \nStreet : " + person1.getAddress().getStreet() + "\nCity: "
				+ person1.getAddress().getCity() + "\nState : " + person1.getAddress().getState() + "\nCountry : "
				+ person1.getAddress().getCountry());
	}

}
