package com.springcore.practiceAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/practiceAnnotation/autoconfig.xml");
		Details d=(Details)context.getBean("details");
		System.out.println(d.getAddress());
						
	}

}
