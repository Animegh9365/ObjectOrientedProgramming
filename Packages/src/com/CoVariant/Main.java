package com.CoVariant;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		Vehicle v1 = car.start();
		System.out.println("Returned object of type: " + v1.getClass().getSimpleName());
		
		Bike bike = new Bike();
		Vehicle v2 = bike.start();
		System.out.println("Returned object of type: " + v2.getClass().getSimpleName());
	}

}
