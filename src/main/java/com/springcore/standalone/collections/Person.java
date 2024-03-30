package com.springcore.standalone.collections;

import java.util.*;

public class Person {

	private List<String> friends;

	private Map<String, Integer> feesStructure;
	
	private Properties property;
	
	
	
	public Properties getProperty() {
		return property;
	}

	public void setProperty(Properties property) {
		this.property = property;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	
	
	

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feesStructure=" + feesStructure + "]";
	}

	
	
	
	public Map<String, Integer> getFeesStructure() {
		return feesStructure;
	}

	public void setFeesStructure(Map<String, Integer> feesStructure) {
		this.feesStructure = feesStructure;
	}
	
	
	
}
