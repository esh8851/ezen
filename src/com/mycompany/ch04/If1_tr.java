package com.mycompany.ch04;

public class If1_tr {

	public static void main(String[] args) {

//		if - 학점 계산
//		A: 90 : 97 93
//		B: 89 ~ 80
//		C: 79 ~ 70
//		D: 69 ~ 60
//		F: 59 ~

		int score = 97;
		
//		if(score >= 90) {
//			System.out.println("A");
//		} else if(score >= 80) {
//			System.out.println("B");
//		} else if(score >= 70) {
//			System.out.println("C");
//		} else if(score >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
		
//		if(score <= 100 && score >= 90) {
//			System.out.println("A");
//		} else if(score <= 89 && score >= 80) {
//			System.out.println("B");
//		} else if(score <= 79 && score >= 70) {
//			System.out.println("C");
//		} else if(score <= 69 && score >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
		
		if(score <= 100 && score >= 90) {
			if(score >= 97) {
				System.out.println("A+");
			} else if(score <= 93) {
				System.out.println("A-");
			} else {
				System.out.println("A");
			}
		} else if(score <= 89 && score >= 80) {
			if(score >= 87) {
				System.out.println("B+");
			} else if(score <= 83) {
				System.out.println("B-");
			} else {
				System.out.println("B");
			}
		} else if(score <= 79 && score >= 70) {
			if(score >= 77) {
				System.out.println("C+");
			} else if(score <= 73) {
				System.out.println("C-");
			} else {
				System.out.println("C");
			}
		} else if(score <= 69 && score >= 60) {
			if(score >= 67) {
				System.out.println("D+");
			} else if(score <= 63) {
				System.out.println("D-");
			} else {
				System.out.println("D");
			}
		} else {
			System.out.println("F");
		}
		
	}

}
