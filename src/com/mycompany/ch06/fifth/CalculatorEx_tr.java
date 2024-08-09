package com.mycompany.ch06.fifth;

public class CalculatorEx_tr {

	public static void main(String[] args) {

		System.out.println(Calculator_tr.PAI);
		
		int addStatic = Calculator_tr.addStatic(13, 72);
		System.out.println(addStatic);
		
		int result = add(1,3);
		System.out.println(result);
		
	}
	
	public static int add (int a, int b) {
		return a+b;
	}
	
	public int minus (int a, int b) {
		int result = add(1,3);
		return a-b;
	}
	
}
