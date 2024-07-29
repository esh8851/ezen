package com.mycompany.ch03;

public class ConditionalOperator8_tr {

	public static void main(String[] args) {

		int math = 93;
		
		char result = (math > 90) ? 'A' : 'B';
		
		System.out.println(result); // A
		
//		값이 0인 변수 선언
//		선언한 변수의 값이 0이면 10 대입 아니면 20대입
		
		int val = 0;
		
		int result2 = (val == 0) ? 10 : 20;
		
		System.out.println(result2); // 10
		
	}

}
