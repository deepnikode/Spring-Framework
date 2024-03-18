package com.springcore;

public class Students
{

	private int studentId;
	private String studentName;
	private String studentAddress;
	
	
	
	
	
	//ToString
	
	@Override
	public String toString() 
	{
		return "Students [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + "]";
	}

	
	
	
	
	
	//Getters and Setters
	
	public int getStudentId() 
	{
		return studentId;
	}


	public void setStudentId(int studentId) 
	{	
		System.out.println("Setting student ID");
		
		this.studentId = studentId;
	}


	public String getStudentName() 
	{	
		
		return studentName;
	}


	public void setStudentName(String studentName) 
	{
		System.out.println("Setting student NAME");
		
		this.studentName = studentName;
	}


	public String getStudentAddress() 
	{
		return studentAddress;
	}


	public void setStudentAddress(String studentAddress) 
	{	
		System.out.println("Setting student ADDRESS");
		
		this.studentAddress = studentAddress;
	}
	
	
	
	
	
	
	//Parameterized Constructor
	
	public Students(int studentId, String studentName, String studentAddress) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}




	//Default Constructor

	public Students() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
}
