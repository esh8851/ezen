package com.mycompany.ch06.second;

public class Car_trEx {

	public static void main(String[] args) {
		
		Car_tr car_tr = new Car_tr();

		Car_tr car_tr2 = new Car_tr(12, "로마", "Red", "페라리");
		System.out.println(car_tr2.engine);
		System.out.println(car_tr2.name);
		System.out.println(car_tr2.color);
		System.out.println(car_tr2.company);
		
		car_tr2.color = "White";
		System.out.println(car_tr2.color);
		
		Car_tr car_tr3 = new Car_tr(4, "그랜다이져", "Black", "현대자동차");
		System.out.println(car_tr3.name);
		
		car_tr3.name = "gv80";
		System.out.println(car_tr3.name);
		
	}

}
