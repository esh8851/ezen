package com.mycompany.ch07.first;

public class ElectricCar extends Car{
	
	int radio;
	
	void charge () {System.out.println("충전을 합니다.");}
	void window () {System.out.println("창문을 엽니다.");}
	void navi () {System.out.println("네비를 켭니다");}
	void radio (int radio) {
		this.radio = radio;
		System.out.println("라디오 채널을" + radio + "번으로 바꿉니다.");
	}
	
	@Override
	void airOn() {
		System.out.println("에어큰을 끕니다.");
	}
	
	@Override
	void speed(int a) {
		System.out.println("속도: " + (a + 100));
	}
	
	
	

}
