package com.mycompany.ch07.third;

public class Company extends Car {
	
	public int carNo;
	
	public Company (String name, String model, int carNo) {
		super(name, model);
		this.carNo = carNo;
	}
	
	public Company (String name, String model) {
		super(name, model);
	}
	
//	public Company () {
//		
//	}

	@Override
	public void sayName() {
		if(carNo >= 13) {
			super.sayName();
		} else {
			System.out.println("Company.name :" + name);
		}
		
	}
	
	

}
