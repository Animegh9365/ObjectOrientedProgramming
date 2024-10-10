package com.Constructors.example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car myCar = new Car("Blue", "Honda Civic");
		// Expected to output "Blue Honda Civic"
	     System.out.println("Car details: " + myCar.color + " " + myCar.model);  
	}

}
