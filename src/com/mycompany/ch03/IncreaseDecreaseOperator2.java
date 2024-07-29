package com.mycompany.ch03;

public class IncreaseDecreaseOperator2 {

	public static void main(String[] args) {

		// 증감연산자 (++, --)
		int i = 7;
		int j = 8;
		
		i++;
		++j;
		
		System.out.println("i : " + i); // 8
		System.out.println("j : " + j); // 9
		
		int k = ++i;
		int m = j++;
		
		System.out.println("k :" + k); // 9
		System.out.println("i : " + i); // 9
		System.out.println("m : " + m); // 9
		System.out.println("j : " + j); // 10
		
		--i;
		int z = ++i + j++;
		
		System.out.println("z : " + z); // 19
		System.out.println("i : " + i); // 9
		System.out.println("j : " + j); // 11
		
	}

}
