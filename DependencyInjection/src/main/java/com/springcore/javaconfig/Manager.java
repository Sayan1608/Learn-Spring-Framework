package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("manager")
public class Manager {
	@Value("101")
	private int id;
	@Value("Manager1")
	private String name;
	
	private Employee emp;

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

	
	public Employee getEmployee() {
		return emp;
	}
	
	@Autowired
	public void setEmployee(Employee employee) {
		this.emp = employee;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", employee=" + emp + "]";
	}

}
