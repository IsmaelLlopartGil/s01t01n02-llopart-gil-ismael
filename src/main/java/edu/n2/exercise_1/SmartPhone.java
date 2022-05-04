package edu.n2.exercise_1;

public class SmartPhone extends Phone implements Camera, Clock  {
	
	public SmartPhone (String trademark, String model) {
		super(trademark, model);
	}

	public void toPhotograph() {
		System.out.println("S�est� fent una foto.");
	}

	public void setAlarm() {
		System.out.println("Est� sonant l�alarma.");
	}
	
}
