package com.mycompany.ch07.first;

public class CarEx {

	public static void main(String[] args) {

		RadioCar car = new RadioCar();
		car.radioOff();
		car.changeChannelRadio(13);
		car.powerOn();
		
		Me me = new Me();
		me.aaa();
		me.changeChannelRadio(72);
		
	}

}
