package com.mycompany.ch04;

public class Switch2_tr {

	public static void main(String[] args) {

		String position = "대리";
		
		switch (position) {
		case "사장":{
			System.out.println("사장의 연봉은 2억입니다.");
			break;
		}
		case "부장":{
			System.out.println("부장의 연봉은 1억5천입니다.");
			break;
		}
		case "과장":{
			System.out.println("과장의 연봉은 1억입니다.");
			break;
		}
		case "대리":{
			System.out.println("대리의 연봉은 8천입니다.");
			break;
		}
		case "사원":{
			System.out.println("사원의 연봉은 7천입니다.");
			break;
		}
		case "나":{
			System.out.println("나의 연봉은 7천입니다.");
			break;
		}
		default :
			System.out.println("퇴사");
			break;
		}
		
	}

}
