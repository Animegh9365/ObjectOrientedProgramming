package com.Example;

public class Student {
	// Providing security to the data using private
	private int rollNumber;
	private String name;
	private int age;
	
	public Student(int rollNumber, String name, int age) {
		this.rollNumber = rollNumber;
		this.name = name;
		setAge(age);
	}
	//getter method to get rollNumber
	public int getRollNumber() {
		return rollNumber;
	}
	//getter method to get name
	public String getName() {
		return name;
	}
	//getter method to get age of student
	public int getAge() {
		return age;
	}
	//setter method to set name outside the class
	public void setName(String name) {
		this.name = name;
	}
	//setter method to set age outside the class
	public void setAge(int age) {
		if (age>0) {
			this.age = age;
		}
		else {
			System.out.println("Invalid age. Age must be positive");
		}
	}
}
