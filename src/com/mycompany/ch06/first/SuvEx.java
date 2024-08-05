package com.mycompany.ch06.first;

public class SuvEx {

	public static void main(String[] args) {

		Suv suv = new Suv();
		
		System.out.println("suv.name : " + suv.name);
		
		suv.price();
		
		int sum = suv.sum(13, 72);
		System.out.println(sum);
		
//		인풋:문자열(사장,부장,과장,대리,사원,나)
//		직급에 따른 연봉을 알려주는 함수
		
		String money = suv.money("사장");
		System.out.println(money);
		
		String money2 = suv.money("부장");
		System.out.println(money2);
		
	}

}
