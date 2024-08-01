package com.mycompany.ch04;

public class If3_tr {

	public static void main(String[] args) {

//		int 타입의 변수를 1개 선언하고
//		짝수와 홀수를 판단하는 프로그램을 작성하시오
		
		int a = 3;
		
		if(a % 2 == 1) {
			System.out.println("홀수");
		} else if(a == 0) {
			System.out.println("0은 0");
		} else if(a < 0) {
			System.out.println("음수 x");
		} else {
			System.out.println("짝수");
		}
		
	}

}
