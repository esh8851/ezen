package com.mycompany.ch07.second;

public class SportsCar extends Car{

	@Override
	public void carPowerOn() {
		System.out.println("SportsCar.시동 켜기");
	}

	@Override
	public void carPowerOff() {
		System.out.println("SportsCar.시동 끄기");
	}

	@Override
	public void carAir() {
		System.out.println("SportsCar.에어컨 켜기");
	}

	@Override
	public void carWindow() {
		System.out.println("SportsCar.창문 열기");
	}
	
	

}
