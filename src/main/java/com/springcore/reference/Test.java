package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/reference/refrenceconfig.xml");
		
		A a=(A)context.getBean("refA");
		
		
		
		System.out.println(a.getX());
		
		/* By doing this, we are simply fetching the value of y- which is present in B, by using reference of B in A */
		
		System.out.println(a.getObj().getY());
		
		System.out.println(a);

	}

}
