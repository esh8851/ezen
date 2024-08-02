package com.mycompany.ch05.function;

public class Function4 {

	public static void main(String[] args) {

//		100 이내의 자연수에서 선택된 수만큼 합산
		
		int sumVal = sum (100);
		
	}
	
	public static int sum (int a) {
		int result = 0;
		if(a > 0 && a <= 100) {
			for(int i=1; i<=a; i++) {
				result += i;
			}
		} else {
//			by pass
		}
		System.out.println(result);
		return result;
	}

}
