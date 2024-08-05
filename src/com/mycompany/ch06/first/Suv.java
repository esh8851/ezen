package com.mycompany.ch06.first;

public class Suv {

	int engine = 8;
	String name = "지바겐";
	String company = "벤츠";
	String color = "블랙";
	
	void price() {
		System.out.println("비싸");
	}
	
	public int sum (int a, int b) {
		int result = a + b;
		return result;
	}
	
	public String money (String a) {
		String result = "";
		
		switch(a) {
		case "사장":{
			result = "사장의 연봉은 2억 입니다.";
			break;
		}
		case "부장":{
			result = "부장의 연봉은 1억 입니다.";
			break;
		}
		case "과장":{
			result = "과장의 연봉은 8000 입니다.";
			break;
		}
		case "대리":{
			result = "대리의 연봉은 7000 입니다.";
			break;
		}
		case "사원":{
			result = "사원의 연봉은 5000 입니다.";
			break;
		}
		case "나":{
			result = "나의 연봉은 5000 입니다.";
			break;
		}
		default :
			result = "사장,부장,과장,대리,사원,나 중 고르시오.";
			break;
		}
		return result;
	}
	
}
