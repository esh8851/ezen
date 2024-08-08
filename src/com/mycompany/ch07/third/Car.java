package com.mycompany.ch07.third;

public class Car {
	
	public String name;
	public String color;
	
	public Car (String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public Car () {
		
	}
	
	public void sayCar () {
		System.out.println("Car.name: " + name);
	}

}
