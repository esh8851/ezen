package com.mycompany.ch03;

public class CompareOperator4_tr {

	public static void main(String[] args) {

		int a = 30;
		int b = 70;
		
		boolean result1 = (a > b);
		boolean result2 = (a >= b);
		boolean result3 = (a < b);
		boolean result4 = (a <= b);
		boolean result5 = (a == b);
		boolean result6 = (a != b);
		
		System.out.println(result1); // false
		System.out.println(result2); // false
		System.out.println(result3); // true
		System.out.println(result4); // true
		System.out.println(result5); // false
		System.out.println(result6); // true
		
	}

}
