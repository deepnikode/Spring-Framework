package com.springcore.practice;

public class Students {

	
	private int rno;
	private String name;
	private float percent;
	
	private Gift gift;

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	public Gift getGift() {
		return gift;
	}

	public void setGift(Gift gift) {
		this.gift = gift;
	}

	@Override
	public String toString() {
		return "Students [rno=" + rno + ", name=" + name + ", percent=" + percent + ", gift=" + gift + "]";
	}
	
	
	
	
	
	
	
	
}
