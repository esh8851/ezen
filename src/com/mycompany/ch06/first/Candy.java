package com.mycompany.ch06.first;

public class Candy {

	int count = 1;
	String taste = "커피맛";
	String color = "갈색";
	String company = "melland";
	
	void eat() {
		System.out.println("먹어");
	}
	
	static String position(String a) {
		String result = "";
		switch(a) {
		case "사장": {
			result = "사장의 연봉은 2억 입니다.";
			break;
		}
		case "부장": {
			result = "부장의 연봉은 1억 5천 입니다.";
			break;
		}
		case "과장": {
			result = "과장의 연봉은 1억 입니다.";
			break;
		}
		case "대리": {
			result = "대리의 연봉은 8천 입니다.";
			break;
		}
		case "사원": {
			result = "사원의 연봉은 7천 입니다.";
			break;
		}
		case "나": {
			result = "나의 연봉은 7천 입니다.";
			break;
		}
		default :
			System.out.println("사장, 부장, 과장, 대리, 사원, 나 중 선택하세요.");
		}
		return result;
	}
	
}
