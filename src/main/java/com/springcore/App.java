package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
  	
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    	Students student1=(Students) context.getBean("student1");
    	
    	System.out.println(student1);
    
    	
    	
    	
    	Students student2=(Students) context.getBean("student2");
    	
    	System.out.println(student2);
    	
    	
    	Students student3=(Students) context.getBean("student3");
    	
    	System.out.println(student3);
    	
    	
    	Students student4=(Students) context.getBean("student4");
    	
    	System.out.println(student4);
    	
    	
    	Students student5=(Students) context.getBean("student5");
    	
    	System.out.println(student5);
    	
    }
    
    
}
