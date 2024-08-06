package com.mycompany.ch06.fifth;

public class Calculator_trEx {

	public static void main(String[] args) {

		System.out.println(Calculator_tr.PAI);
		
		int sum = Calculator_tr.add(1,3);
		System.out.println(sum);
		
		int result = add(3,7);
		
	}
	
	public static int add (int a, int b) {
		return a+b;
	}
	
	public double minus (int a, int b) {
		int result = add(3,7);
		return a-b;
	}

}
