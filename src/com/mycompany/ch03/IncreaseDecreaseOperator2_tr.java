package com.mycompany.ch03;

public class IncreaseDecreaseOperator2_tr {

	public static void main(String[] args) {

		int i = 3;
		int j = 7;
		
		++i;
		j++;
		
		System.out.println(i); // 4
		System.out.println(j); // 8
		
		int m = ++i;
		int k = j++;
		
		System.out.println(m); // 5
		System.out.println(i); // 5
		System.out.println(k); // 8
		System.out.println(j); // 9
		
		--i;
		int z = ++i + j++;
		
		System.out.println(i); // 5
		System.out.println(j); // 10
		System.out.println(z); // 14
		
	}

}
