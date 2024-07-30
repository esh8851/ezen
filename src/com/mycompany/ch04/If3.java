package com.mycompany.ch04;

public class If3 {

	public static void main(String[] args) {
		
//		int 타입의 변수를 1개 선언하고
//		짝수와 홀수를 판단하는 프로그램을 작성하시오

		int val = 0;
		
		if(val % 2 == 0) {
			if(val == 0) {
				System.out.println("0");
			} else {
				System.out.println("짝수");
			}
		} else if(val < 0) {
			System.out.println("음수 놉");
		} else {
			System.out.println("홀수");
		}
		
	}

}
