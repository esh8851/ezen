package com.mycompany.ch07.third;

public class Car {
	
	public String name;
	public String model;
	
	public Car (String name, String model) {
		this.name = name;
		this.model = model;
	}
	
	public Car () {
		
	}
	
	public void sayName () {
		System.out.println("Car.name :" + name);
	}

}
