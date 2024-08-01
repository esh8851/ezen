package com.mycompany.ch04;

public class If2_tr {

	public static void main(String[] args) {

//		일반 : 1, 5% 할인적용
//		브론즈 : 2, 10% 할인적용
//		실버 : 3, 15% 할인적용
//		골드 : 4, 20% 할인적용
//		플래티넘 : 5, 27% 할인적용
		
		int grade = 5;
		int cost = 12000;
		
		double salesCost = 0.0;
		
		if(grade == 1) {
			salesCost = 0.05;
			System.out.println("정가가 " + cost + "인 일반등급의 할인 가격은 " + (int)(cost*salesCost) + "원 입니다.");
		} else if(grade == 2) {
			salesCost = 0.1;
			System.out.println("정가가 " + cost + "인 브론즈등급의 할인 가격은 " + (int)(cost*salesCost) + "원 입니다.");
		} else if(grade == 3) {
			salesCost = 0.15;
			System.out.println("정가가 " + cost + "인 실버등급의 할인 가격은 " + (int)(cost*salesCost) + "원 입니다.");
		} else if(grade == 4) {
			salesCost = 0.2;
			System.out.println("정가가 " + cost + "인 골드등급의 할인 가격은 " + (int)(cost*salesCost) + "원 입니다.");
		} else if(grade == 5) {
			salesCost = 0.27;
			System.out.println("정가가 " + cost + "인 플래티넘등급의 할인 가격은 " + (int)(cost*salesCost) + "원 입니다.");
		} else {
			System.out.println("1 ~ 5까지만 가능");
		}
		
	}

}
