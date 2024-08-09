package com.mycompany.ch07.second;

public class SecondEx {

	public static void main(String[] args) {

		MusicPhone musicPhone = new MusicPhone();
		
		musicPhone.phoneCall();
		
		MobilePhone mobilePhone = new MobilePhone();
		
		mobilePhone.phoneCall();
		
//		-----------------------------------------------
		
		ElectricCar electricCar = new ElectricCar();
		electricCar.carAir();
		
		SportsCar sportsCar = new SportsCar();
		sportsCar.carWindow();
		
		
	}

}
