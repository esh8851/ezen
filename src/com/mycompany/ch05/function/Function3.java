package com.mycompany.ch05.function;

public class Function3 {

	public static void main(String[] args) {

//		세 수를 주면 최대값을 반환하는 함수
		
		int maxVal = max (1,3,7);
		
	}
	
	public static int max (int a, int b, int c) {
		int result = 0;
		if(a != b && b != c && c != a) {
			if(a > b && a > c) {
				result = a;
			} else if (b > a && b > c) {
				result = b;
			} else {
				result = c;
			}
		} else {
//			by pass
		}
		System.out.println(result);
		return result;
	}

}
