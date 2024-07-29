package com.mycompany.ch03;

public class StringConcat7_tr {

	public static void main(String[] args) {

		String stringVal1 = "jdk ";
		String stringVal2 = "1.17";
		String stringVal5 = "10";
		
		String stringVal3 = stringVal1 + stringVal2;
		
		System.out.println(stringVal3); // jdk 1.17
		
		int a = 1;
		
		String stringVal4 = stringVal1 + a;
		System.out.println(stringVal4); // jdk 1
		
//		String stringVal6 = stringVal5 + a;
//		System.out.println(stringVal6); // 101
		
		int stringVal6 = Integer.parseInt(stringVal5) + a;
		System.out.println(stringVal6); // 11
		
	}

}
