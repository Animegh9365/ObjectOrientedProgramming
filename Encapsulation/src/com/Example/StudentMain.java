package com.Example;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student(1,"Animegh",15);
		
		System.out.println("Initial details:");
		System.out.println("Roll Number: " + s1.getRollNumber());
		System.out.println("Student name: " + s1.getName());
		System.out.println("Age: " + s1.getAge());
		
		//accessing the setter method outside the Student class
		s1.setName("Panda");
		s1.setAge(23);
		
		System.out.println("Final details: ");
		System.out.println("Roll Number: " + s1.getRollNumber());
		System.out.println("Student name: " + s1.getName());
		System.out.println("Age: " + s1.getAge());
		
	}

}
