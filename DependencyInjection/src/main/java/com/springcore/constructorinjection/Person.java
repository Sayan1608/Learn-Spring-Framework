package com.springcore.constructorinjection;

import java.util.List;

public class Person {

	private int personId;
	private String personName;
	private List<String> phoneNumbers;
	private Address address;

	public Person(int personId, String personName, List<String> phoneNumbers) {
		this.personId = personId;
		this.personName = personName;
		this.phoneNumbers = phoneNumbers;
	}

	public Person(int personId, String personName, List<String> phoneNumbers, Address address) {
		this.personId = personId;
		this.personName = personName;
		this.phoneNumbers = phoneNumbers;
		this.address = address;
	}

	@Override
	public String toString() {
		return personName + " : " + personId;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
