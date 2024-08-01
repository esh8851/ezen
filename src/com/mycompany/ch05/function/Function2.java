package com.mycompany.ch05.function;

public class Function2 {

	public static void main(String[] args) {

//		짝수인지 홀수인지 구별하는 함수
		
		String result = oddEven(1372);
		System.out.println(result);
		
	}
	
	public static String oddEven (int num) {
		if(num % 2 == 1) {
			return "홀수";
		} else if(num == 0){
			return "0은 0";
		} else if(num < 0) {
			return "음수는 x";
		} else {
			return "짝수";
		}
	}

}
