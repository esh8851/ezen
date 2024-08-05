package com.mycompany.ch05.function;

public class Function4_tr {

	public static void main(String[] args) {

//		100 이내의 자연수에서 선택된 수만큼 합산
		
		int sum = sum(72);
		System.out.println(sum);
		
	}
	
	public static int sum(int a) {
		int result = 0;
		if(a > 0 && a <= 100) {
			for(int i=0; i<=a; i++) {
				result += i;
			}
		} else {
//			by pass
		}
		return result;
	}

}
