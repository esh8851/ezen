package com.mycompany.ch05.function;

public class Function {

	public static void main(String[] args) {
		
//		public 리턴자료형 메소드명 (입력자료형1 입력변수1, 입력자료형2 입력변수2, ...) {
//			...
//			return 리턴값; // 리턴자료형이 void인 경우에는 return문이 필요없다.
//		}

		int result = sum(3,7);
		System.out.println(result);
		
	}
	
	public static int sum (int a,int b) {
		int sum = a + b;
		return sum;
	}

}
