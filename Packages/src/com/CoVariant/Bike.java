package com.CoVariant;

public class Bike extends Vehicle {
	Vehicle start() {
		System.out.println("Bike is starting");
		return this;
	}
}
