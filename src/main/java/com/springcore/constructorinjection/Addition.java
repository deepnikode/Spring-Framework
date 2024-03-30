package com.springcore.constructorinjection;

public class Addition {
	private int a;
	private int b;
	
	public Addition(int a,int b)
	{
		this.a=a;
		this.b=b;
		
		System.out.println("Constructor: int,int");
	}
	
	public Addition(double a,double b)
	{
		this.a=(int)a;
		this.b=(int)b;
		
		System.out.println("Constructor: double,double");
	}
	
	
	/* 
	   
	 * JVM will follow order of the constructor, and call accordingly
	   but, in String case, it will act differently----
	   
	    Because by default it will assume that all the values are of string type, 
	    and when it identifies that there is STRING present- then Priority will be given to the string type....
	    
	    and String will run First...................................................
	    
	    if you have to call the specific constructor, then you have to SPECIFY the type:::::
	    			i.e->    <constructor-arg value="34" type="int"/>
	    			
	    Here we can Resolve Ambiguiti problem, with the help of "type"
	  
	*/
	public Addition(String a,String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		
		System.out.println("Constructor: String,String");
	}
	
	
	public void doSum()
	{
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);


		System.out.println("Sum is:" +(this.a+this.b) );
	}
	

}

