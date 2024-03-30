package com.springcore.auto.wire.annotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	
	@Autowired
	
	//By using @Autowired, IOC Cointainer will inject dependencies automatically where it is needed.
	
	// # ways to use annotations
	//   1. above property (recommended)
	//   2. above set method()
	//   3. above constructor

	
	@Qualifier("address2")
	
	
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		
		System.out.println("use annotation above the set method(), IOC-C will use setter injection");
		this.address = address;
	}
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("use annotation above the constructor, IOC-C will use Constructor injection");
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
