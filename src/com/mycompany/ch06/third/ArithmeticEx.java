package com.mycompany.ch06.third;

public class ArithmeticEx {

	public static void main(String[] args) {

		Arithmetic arithmetic = new Arithmetic();
		
		int sum = arithmetic.sum(1, 3);
		System.out.println(sum);
		
		int minus = arithmetic.minus(3, 1);
		System.out.println(minus);
		
		int multiply = arithmetic.multiply(3, 7);
		System.out.println(multiply);
		
		int divide = arithmetic.divide(6, 3);
		System.out.println(divide);
		
		int remain = arithmetic.remain(1, 3);
		System.out.println(remain);
		
	}

}
