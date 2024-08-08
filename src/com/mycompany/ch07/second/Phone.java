package com.mycompany.ch07.second;

public class Phone {
	
//	-class MobilePhone : 전화걸기, 전화받기, 무선 기지국 연결, 배터리 충전하기
//	-class MusicPhone : 전화걸기, 전화받기, 무선기지국 연결, 배터리 충전하기, 음악다운받기, 음악재생하기
//	두 클래스를 생성하고 공통된 기능을 부모 클래스로 만들어 상속 관계를 형성
//	부모 클래스를 의 내용을 전부 오버라이드 진행...
	
	void phoneCall () {System.out.println("전화걸기");}
	void phoneRecieve () {System.out.println("전화받기");}
	void phoneConnect () {System.out.println("무선 기지국 연결");}
	void phoneCharge () {System.out.println("배터리 충전하기");}

}
