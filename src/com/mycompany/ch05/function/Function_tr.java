package com.mycompany.ch05.function;

public class Function_tr {

	public static void main(String[] args) {

		int result = sum(1,3);
		System.out.println(result);
		
		val();
		
	}
	
	public static int sum(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
		return sum;
	}
	
	public static void val() {
		System.out.println("Hi");
	}

}
