package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("confign/spring-config-spel.xml");
		
		Demo demo = context.getBean("demo", Demo.class);
		
		System.out.println(demo);
	}

}
