package com.PackageExample;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		Vehicle vehicle1 = car.start();
		System.out.println("Returned object is of type: " + vehicle1.getClass().getSimpleName());
		Bike bike = new Bike();
		Vehicle vehicle2 = bike.start();
		System.out.println("Returned object is of type: " + vehicle2.getClass().getSimpleName());
		
	}

}
