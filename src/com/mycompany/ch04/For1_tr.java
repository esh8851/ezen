package com.mycompany.ch04;

public class For1_tr {

	public static void main(String[] args) {

//		2단 부터 출력되는 구구단 프로그램을 작성하시오
//		각 단계 마다 구분선을 넣어 주세요
//		2 * 1 = 2
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.println(j + "*" + "i" + "=" + i*j);
			}
			if(i == 9) {
				System.out.println();
			} else {
				System.out.println("-------");
			}
		}
		
	}

}
