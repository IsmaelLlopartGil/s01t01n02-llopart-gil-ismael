package edu.n2.exercise_1;

public class Phone {
	
	protected String trademark;
	protected String model;
	
	public Phone (String trademark, String model) {
		this.trademark = trademark;
		this.model = model;
	}
	
	public void trucar (String phoneNumber) {
		System.out.println("Trucant al número " + phoneNumber);
	}
}
