package com.mycompany.ch04;

public class Switch1_tr {

	public static void main(String[] args) {

		int num = 3;
		
		switch(num) {
		case 1:{
			System.out.println(num + "번 입니다.");
			break;
		}
		case 2:{
			System.out.println(num + "번 입니다.");
			break;
		}
		case 3:{
			System.out.println(num + "번 입니다.");
			break;
		}
		case 4:{
			System.out.println(num + "번 입니다.");
			break;
		}
		case 5:{
			System.out.println(num + "번 입니다.");
			break;
		}
		default :
			System.out.println("1 ~ 4번까지 가능");
			break;
		}
		
	}

}
