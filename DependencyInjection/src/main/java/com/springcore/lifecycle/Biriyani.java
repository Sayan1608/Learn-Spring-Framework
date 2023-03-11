package com.springcore.lifecycle;

public class Biriyani {
	private double price;

	public Biriyani() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Order Placed");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Biriyani [price=" + price + "]";
	}
	
	
	
	public void init() {
		System.out.println("Inside init method : preparing your biriyani");
	}
	
	public void destroy() {
		System.out.println("Delivered your Biriyani : now taste our Royal Biriyani!!");
	}
	
	
}
