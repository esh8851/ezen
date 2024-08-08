package com.mycompany.ch07.second;

public class MusicPhone extends Phone{

	@Override
	void phoneCall() {
		System.out.println("음악 전화걸기");
	}

	@Override
	void phoneRecieve() {
		System.out.println("음악 전화받기");
	}

	@Override
	void phoneConnect() {
		System.out.println("음악 무선 기지국 연결");
	}

	@Override
	void phoneCharge() {
		System.out.println("음악 배터리 충전하기");
	}
	
	void down () {System.out.println("음악 다운받기");}
	void play () {System.out.println("음악 재생하기");}

}
