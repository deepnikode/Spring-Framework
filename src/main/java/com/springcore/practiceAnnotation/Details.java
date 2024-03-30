package com.springcore.practiceAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Details {
	
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setter");
		this.address = address;
	}
	
	

	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Details(Address address) {
		super();
		System.out.println("Constructor");

		this.address = address;
	}

	@Override
	public String toString() {
		return "Details [address=" + address + "]";
	}
	

}
