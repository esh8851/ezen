package com.mycompany.ch06.first;

public class CandyEx {

	public static void main(String[] args) {

		Candy candy = new Candy();
		System.out.println(candy.taste);
		
		candy.eat();
		
		String position = candy.position("나");
		System.out.println(position);
		
	}

}
