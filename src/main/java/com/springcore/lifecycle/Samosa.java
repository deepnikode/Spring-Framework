package com.springcore.lifecycle;

public class Samosa {

	private double prize;

	
	
	
	
	
	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {

		System.out.println("Setting Prize of Samosa : XML Configuration");

		this.prize = prize;
	}

	
	
	
	
	
	@Override
	public String toString() {
		return "Samosa [prize=" + prize + "]";
	}

	
	
	
	
	
	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
						// You can change the name of init method and destroy method 
						// and keep any alternative name of your choice...
					
	
	
	public void hey()
	{
		System.out.println("In Init : Hello-i have changed my name, How are you?");
	}
	
	
	
	
	public void bye()
	{
		System.out.println("In Destroy : Bye -i am going to be destroyed....");
	}
	
	
	
}
