package com.mycompany.ch05.function;

public class Function3_tr {

	public static void main(String[] args) {

//		세 수를 주면 최대값을 반환하는 함수
		
//		int maxVal = max(1,3,7);
//		System.out.println(maxVal);
		
		maxa(3,7,"aa");
		
	}
	
	public static int max (int a, int b, int c) {
		int result = 0;
		if(a != b && b != c && a != c) {
			if(a > b && a > c) {
				result = a;
			} else if(b > a && b > c) {
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
	
	public static void maxa(int a, int b, String c) {
		int result = a + b;
		System.out.println(result);
		String hi = "hi" + c;
		System.out.println(hi);
	}

}
