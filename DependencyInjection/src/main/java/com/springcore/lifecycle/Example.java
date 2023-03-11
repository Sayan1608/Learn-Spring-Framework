package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example {
	private String subject;

	public Example() {
		super();
	}

	public Example(String subject) {
		super();
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	@PostConstruct
	private void start() {
		System.out.println("starting example...");
	}
	
	@PreDestroy
	private void end() {
		System.out.println("ending example...");
	}
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("confign/spring-config-lifecycle.xml");
		
		context.registerShutdownHook();
		
		Example example = context.getBean("example", Example.class);
		
		System.out.println(example);
	}

}
