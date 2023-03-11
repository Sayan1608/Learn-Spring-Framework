package com.springcore.stereotype.annotations.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("confign/spring-config-bean-scope.xml");
		
		Student student1 = context.getBean("student", Student.class);
		
		Student student2 = context.getBean("student",Student.class);
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student1==student2);
	}

}
