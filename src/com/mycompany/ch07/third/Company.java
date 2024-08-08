package com.mycompany.ch07.third;

public class Company extends Car {
	
	int carNo;
	
	public Company (String name, String color, int carNo) {
		super(name,color);
		this.carNo = carNo;
	}
	
	public Company () {
		
	}

	@Override
	public void sayCar() {
		if(carNo >= 10) {
			System.out.println("Company.name: " + name);
		} else {
			super.sayCar();
		}
	}
	
	

}
