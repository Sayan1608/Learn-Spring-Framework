package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfiguration {

	@Bean
	public Book getBook() {
		Book book = new Book();
		book.setBookTitle("The Power of the Subconcious Mind");
		return book;
	}

	@Bean(name = { "student", "student1", "firststudent" })
	public Student getStudent() {
		Student student = new Student();
		student.setBook(getBook());
		return student;
	}

}
