package com.mycompany.ch07.third;

public class Student extends People{
	
	public int studentNo;
	
	public Student (String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	public Student (String name, String ssn) {
		super(name, ssn);
	}
	
	public Student () {
		
	}

	@Override
	void sayName() {
//		System.out.println("People.name :" + name);
//		super.sayName();
		if(studentNo >= 21) {
			super.sayName();
		} else {
			System.out.println("Student.name :" + name);
		}
	}
	

}
