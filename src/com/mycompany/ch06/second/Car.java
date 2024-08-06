package com.mycompany.ch06.second;

public class Car {

//	field
	int engine;
	String name;
	String color;
	String company;
	
	Car () {
		
	}
	
	Car (String color) {
		this.color = color;
	}

	Car (int engine, String name, String color, String company) {
		this.engine = engine;
		this.name = name;
		this.color = color;
		this.company = company;
	}
	
}