package com.springcore.stanalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private List<String> friendList;
	private Set<String> cities;
	private Map<String, Integer> feeStructure;
	private Properties properties;

	public List<String> getFriendList() {
		return friendList;
	}

	public void setFriendList(List<String> friendList) {
		this.friendList = friendList;
	}

	public Set<String> getCities() {
		return cities;
	}

	public void setCities(Set<String> cities) {
		this.cities = cities;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
