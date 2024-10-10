package com.Constructors.example;

class Car {
    String color;
    String model;

    // Constructor using 'this' to refer to instance variables
    public Car(String color, String model) {
        this.color = color;  // 'this.color' refers to the instance variable, 'color' to the parameter
        this.model = model;  // Similarly, 'this.model' refers to the instance variable
    }
}