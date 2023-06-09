package com.springcore.autowiring;

public class Address {
	private String street;

	public Address() {
		super();
	}

	public Address(String street, String city, String state, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	private String city;
	private String state;
	private String country;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
		System.out.println("Setting street");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		System.out.println("Setting city");
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("Setting state");
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
		System.out.println("Setting country");
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
}
