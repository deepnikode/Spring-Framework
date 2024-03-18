package com.springcore.constructorinjection;

public class Certificate {
	
	String certi;

	@Override
	public String toString() {
		return certi;
	}

	public Certificate(String certi) {
		super();
		this.certi = certi;
	}
	
	
	
	

}
