package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Dessert implements InitializingBean, DisposableBean {
	
	private String dessertType;

	public Dessert(String dessertType) {
		super();
		this.dessertType = dessertType;
	}

	public Dessert() {
		super();
	}

	public String getDessertType() {
		return dessertType;
	}

	public void setDessertType(String dessertType) {
		this.dessertType = dessertType;
	}

	@Override
	public String toString() {
		return "Dessert [dessertType=" + dessertType + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Your Dessert is about to arrive now...init ");
		
	}

	public void destroy() throws Exception {
		System.out.println("Delivered your Dessert");
		
	}
	
}
