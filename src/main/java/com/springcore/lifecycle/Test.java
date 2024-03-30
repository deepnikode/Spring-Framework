package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
			AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
			
			Samosa s=(Samosa)context.getBean("s1");
			
			Pepsi p=(Pepsi)context.getBean("p1");
			
			Example e=(Example)context.getBean("e1");

			
			System.out.println(s);
			System.out.println(p);
			System.out.println(e);
			                                                     
			
			// registerShutdownHook() -> is present in AbstractApplicationContext Interface 
			// and it will be responsible for calling destroy method...
			
			context.registerShutdownHook();
	}

}
