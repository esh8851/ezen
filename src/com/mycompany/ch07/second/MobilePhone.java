package com.mycompany.ch07.second;

public class MobilePhone extends Phone{

	@Override
	void phoneCall() {
		System.out.println("모바일 전화걸기");
	}

	@Override
	void phoneRecieve() {
		System.out.println("모바일 전화받기");
	}

	@Override
	void phoneConnect() {
		System.out.println("모바일 무선 기지국 연결");
	}

	@Override
	void phoneCharge() {
		System.out.println("모바일 배터리 충전하기");
	}
	
	

}
