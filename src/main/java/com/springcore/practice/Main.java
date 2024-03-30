package com.springcore.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/practice/practiceconfig.xml");
		
		Students s1=(Students)context.getBean("student1");
		System.out.println(s1);
		
		Students s2=(Students)context.getBean("student2");
		System.out.println(s2);
		
		
	}

}
