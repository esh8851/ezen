package com.mycompany.ch04;

import java.net.MulticastSocket;

public class For3 {

	public static void main(String[] args) {

//		(10*5)
//		**********
//		**********
//		**********
//		**********
//		**********
		
//		for(int i=1; i<=5; i++) {
//			String star = "";
//			for(int j=1; j<=10; j++) {
//				star += "*";
//			}
//			System.out.println(star);
//		}
		
		
		
//		(1,10번째 출력)
//		**********
//		*        *
//		*        *
//		*        *
//		**********
		
//		for(int i=1; i<=5; i++) {
//			String star = "";
//			for(int j=1; j<=10; j++) {
//				if(i == 2 && j>=2 && j<=9) {
//					star += " ";
//				} else if (i == 3 && j>=2 && j<=9){
//					star += " ";
//				} else if (i == 4 && j>=2 && j<=9){
//					star += " ";
//				} else {
//					star += "*";
//				}
//			}
//			System.out.println(star);
//		}
		
//		for(int i=1; i<=5; i++) {
//			String star = "";
//			for(int j=1; j<=10; j++) {
//				if(i == 1 || i == 5) {
//					star += "*";
//				} else {
//					if(j == 1 || j == 10) {
//						star += "*";						
//					} else {
//						star += " ";
//					}
//				}
//			}
//			System.out.println(star);
//		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				if(i>=2 && i<=4) {
					if(j>=2 && j<=9) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
//		1
//		12
//		123
//		1234
//		12345
//		123456
//		1234567
//		12345678
//		123456789
//		1 3 5 7 90
//		출력하는 프로그램을 만드시오
		
		for(int i=1; i<=10; i++) {
			if(i == 10) {
				for(int j=1; j<=i-1; j++) {
					if(j%2==1) {
						System.out.print(j);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("0");
			} else {
				for(int j=1; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		
	}

}
