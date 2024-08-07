package com.mycompany.ch07.first;

public class SportsCarEx {

	public static void main(String[] args) {

		ElectricCar electricCar = new ElectricCar();
		electricCar.charge();
		electricCar.radio(37);
		electricCar.powerOn();
		electricCar.speed(200);
		
		Me me = new Me();
		me.aaa();
		me.powerOff();
		me.window();
		me.radio(23);
		
		me.airOn();
		me.speed(200);
		
		Car car = new Car();
		car.speed(200);
		
		me.setCompany("페라리");
		System.out.println(me.getCompany());
		me.setNumber("0000");
		System.out.println(me.getNumber());
		
		me.color = "Red";
		System.out.println(me.color);
		
		int result = me.sum(3,7);
		System.out.println(result);
		
		me.minus();
		
	}

}
