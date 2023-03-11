package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("confign/spring-config-lifecycle.xml");
		context.registerShutdownHook();
		
		Biriyani biriyani = context.getBean("biriyani", Biriyani.class);
		
		System.out.println("Biriyani Served \n"+biriyani);
		
		/*
		 * Dessert dessert = context.getBean("dessert", Dessert.class);
		 * 
		 * 
		 * 
		 * System.out.println("Dessert Served \n"+dessert);
		 */
		
	}

}
