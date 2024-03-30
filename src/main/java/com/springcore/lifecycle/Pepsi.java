package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	
	
	private double prize;

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		
		System.out.println("Setting Prize of Pepsi : Using Interfaces for Configuration");

		this.prize = prize;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [prize=" + prize + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		// -> You can change init method name, and java developers have done the same...
		
		System.out.println("In Init method ## Using Interfaces  ## (Rishta vahi soch nayi");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		// -> You can change destroy method name, and java developers have done the same...
		
		System.out.println("In Destroy method ## Using Interfaces  ## (Rishta vahi soch nayi");
	}
	
	
}
