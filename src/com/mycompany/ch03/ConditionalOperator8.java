package com.mycompany.ch03;

public class ConditionalOperator8 {

	public static void main(String[] args) {

//		삼항 연산자 (조건식) ? A : B
		
		int math = 85;
		
		char grade = (math > 90) ? 'A' : 'B';
		
		System.out.println("grade : " + grade);
		
//		값이 0인 변수 선언
//		선언한 변수의 값이 0이면 10 대입 아니면 20대입
		
		int value = 0;
		
		int result = (value == 0) ? 10 : 20;
		
		System.out.println("result : " + result);
		
	}

}
