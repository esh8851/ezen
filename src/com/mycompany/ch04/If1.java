package com.mycompany.ch04;

public class If1 {

	public static void main(String[] args) {
		
//		if - 학점 계산
//		A: 90 : 97 93
//		B: 89 ~ 80
//		C: 79 ~ 70
//		D: 69 ~ 60
//		F: 59 ~

		int score = 93;
		
//		if(score >= 90) {
//			System.out.println(score + "점은 A입니다.");
//		} else if (score >= 80) {
//			System.out.println(score + "점은 B입니다.");
//		} else if (score >= 70) {
//			System.out.println(score + "점은 C입니다.");
//		} else if (score >= 60) {
//			System.out.println(score + "점은 D입니다.");
//		} else {
//			System.out.println(score + "점은 F입니다.");
//		}
		
//		if(score >= 90 && score <= 100) {
//			System.out.println(score + "점은 A입니다.");
//		} else if (score >= 80 && score <= 89) {
//			System.out.println(score + "점은 B입니다.");
//		} else if (score >= 70 && score <= 79) {
//			System.out.println(score + "점은 C입니다.");
//		} else if (score >= 60 && score <= 69) {
//			System.out.println(score + "점은 D입니다.");
//		} else {
//			System.out.println(score + "점은 F입니다.");
//		}
		
		if(score >= 90 && score <= 100) {
			if(score >= 97) {
				System.out.println(score + "점은 A+입니다.");
			} else if (score <= 93) {
				System.out.println(score + "점은 A-입니다.");
			} else {
				System.out.println(score + "점은 A입니다.");
			}
		} else if (score >= 80 && score <= 89) {
			if(score >= 87) {
				System.out.println(score + "점은 B+입니다.");
			} else if (score <= 83) {
				System.out.println(score + "점은 B-입니다.");
			} else {
				System.out.println(score + "점은 B입니다.");
			}
		} else if (score >= 70 && score <= 79) {
			if(score >= 77) {
				System.out.println(score + "점은 C+입니다.");
			} else if (score <= 73) {
				System.out.println(score + "점은 C-입니다.");
			} else {
				System.out.println(score + "점은 C입니다.");
			}
		} else if (score >= 60 && score <= 69) {
			if(score >= 67) {
				System.out.println(score + "점은 D+입니다.");
			} else if (score <= 63) {
				System.out.println(score + "점은 D-입니다.");
			} else {
				System.out.println(score + "점은 D입니다.");
			}
		} else {
			System.out.println(score + "점은 F입니다.");
		}
		
	}

}
