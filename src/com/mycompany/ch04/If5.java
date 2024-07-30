package com.mycompany.ch04;

public class If5 {

	public static void main(String[] args) {

		int a = 92;
		int b = 72;
		int c = 76;
		
		if(a != b && b != c && c !=a) {
			if(a > b && a > c) {
				System.out.println("최대값은 a");
			} else if(b > a && b > c) {
				System.out.println("최대값은 b");
			} else {
				System.out.println("최대값은 c");
			}
			
			if(a < b && a < c) {
				System.out.println("최소값은 a");
			} else if(b < a && b < c) {
				System.out.println("최소값은 b");
			} else {
				System.out.println("최소값은 c");
			}
		} else {
			System.out.println("2개의 동일한 정수");
		}
		
//		if(a != b && b != c && c != a) {
//			if(a > b && a > c) {
//				System.out.println("최대값은 : " + a);
//			} else if (b > a && b > c) {
//				System.out.println("최대값은 : " + b);
//			} else {
//				System.out.println("최대값은 : " + c);
//			}
//			
//			if(a < b && a < c) {
//				System.out.println("최소값은 : " + a);
//			} else if ( b < a && b < c ) {
//				System.out.println("최소값은 : " + b);
//			} else {
//				System.out.println("최소값은 : " + c);
//			}
//		} else {
//			System.out.println("적어도 2개의 동일한 정수가 존재 합니다. 수정해 주세요");
//		}
		
	}

}
