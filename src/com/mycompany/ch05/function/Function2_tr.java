package com.mycompany.ch05.function;

public class Function2_tr {

	public static void main(String[] args) {

//		짝수인지 홀수인지 구별하는 함수
		
		String val = oddEven(1379);
		System.out.println(val);
		
	}
	
	public static String oddEven(int a) {
		String result = "";
		if(a % 2 == 1) {
			result = "홀수";
		} else if(a == 0){
			result = "0은 0";
		} else if(a < 0){
			result = "음수는 x";
		} else {
			result = "짝수";
		}
		System.out.println(result);
		return result;
	}

}
