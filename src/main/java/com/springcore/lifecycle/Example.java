package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	
	private String subject;

	
	
	
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		
		System.out.println("Setting Subject : Using Annotations for configuration");

		this.subject = subject;
	}

	
	
	
	
	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	
	
	
	
	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	// Note that both the @PostConstruct and @PreDestroy annotations are part of Java EE.
	// Since Java EE was deprecated in Java 9, and removed in Java 11, we have to add an 
	// additional dependency to use these annotations:


	
	
	@PostConstruct
	public void shuru()
	{
		System.out.println("Shuru hori cheeze using annotation");
	}
	
	
	@PreDestroy
	public void band()
	{
		System.out.println("Band hori cheeze using annotation");

	}
	
	

}
