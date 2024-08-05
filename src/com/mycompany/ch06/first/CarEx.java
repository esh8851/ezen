package com.mycompany.ch06.first;

public class CarEx {

	public static void main(String[] args) {

		Car car = new Car();
		
		System.out.println("car.engine : " + car.engine);
		car.go();
		car.back();
	}

}
