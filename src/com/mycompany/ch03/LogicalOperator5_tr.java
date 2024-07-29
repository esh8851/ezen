package com.mycompany.ch03;

public class LogicalOperator5_tr {

	public static void main(String[] args) {

		int a = 93;
		
		if (a > 90 && a < 99) {
			System.out.println("true"); // true
		}
		
		if (a >= 93 & a < 99) {
			System.out.println("true"); // true
		}
		
		if (a > 93 || a < 99) {
			System.out.println("true"); // true
		}
		
		if (a > 93 | a < 99) {
			System.out.println("true"); // true
		}
		
		if (a > 93 ^ a < 99) {
			System.out.println("true"); // true
		}
		
		
	}

}
