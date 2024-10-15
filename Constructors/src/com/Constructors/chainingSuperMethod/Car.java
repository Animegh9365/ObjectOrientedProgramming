package com.Constructors.chainingSuperMethod;

public class Car extends Vehicle {
	String model;
	public Car(String model) {
		super(4);
		this.model = model;
		System.out.println("Car model " + model + " created.");
	}
}
