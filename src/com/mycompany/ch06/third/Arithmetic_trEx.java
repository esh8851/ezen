package com.mycompany.ch06.third;

public class Arithmetic_trEx {

	public static void main(String[] args) {

		Arithmetic_tr arithmetic_tr = new Arithmetic_tr();
		
		int plus = arithmetic_tr.plus(1,3);
		System.out.println(plus);
		
		int minus = arithmetic_tr.minus(3,1);
		System.out.println(minus);
		
		int multibly = arithmetic_tr.multiply(3,7);
		System.out.println(multibly);
		
		int divide = arithmetic_tr.divide(72,3);
		System.out.println(divide);
		
		int remain = arithmetic_tr.remain(12,3);
		System.out.println(remain);
		
	}

}
