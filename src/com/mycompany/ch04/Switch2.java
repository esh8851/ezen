package com.mycompany.ch04;

public class Switch2 {

	public static void main(String[] args) {

		String position = "대리";
		
		switch (position) {
		case "사장": {
			System.out.println("연봉은 2억");
			break;
		}
		case "부장": {
			System.out.println("연봉은 1억");
			break;
		}
		case "과장": {
			System.out.println("연봉은 8000");
			break;
		}
		case "대리": {
			System.out.println("연봉은 7000");
			break;
		}
		case "주임": {
			System.out.println("연봉은 5000");
			break;
		}
		case "사원": {
			System.out.println("연봉은 4800");
			break;
		}
		case "나": {
			System.out.println("연봉은 100조");
			break;
		}
		default:
			System.out.println("퇴사");
			break;
		}
		
	}

}
