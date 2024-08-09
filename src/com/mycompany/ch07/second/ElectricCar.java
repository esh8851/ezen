package com.mycompany.ch07.second;

public class ElectricCar extends Car{

	@Override
	public void carPowerOn() {
		System.out.println("ElectricCar.시동 켜기");
	}

	@Override
	public void carPowerOff() {
		System.out.println("ElectricCar.시동 끄기");
	}

	@Override
	public void carAir() {
		System.out.println("ElectricCar.에어컨 켜기");
	}

	@Override
	public void carWindow() {
		System.out.println("ElectricCar.창문 열기");
	}
	
	

}
