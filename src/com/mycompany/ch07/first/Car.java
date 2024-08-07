package com.mycompany.ch07.first;

public class Car {
	
	public String model;
	public String color;
	
	private String company;
	private String number;
	
	void powerOn () {System.out.println("시동을 켭니다.");}
	void powerOff () {System.out.println("시동을 끕니다.");}
	void airOn () {System.out.println("에어컨을 켭니다.");}
	void speed (int a) {System.out.println("속도: " + a);}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
	private int add (int a, int b) {
		return a+b;
	}
	public int a;
	public int b;
	public int sum (int a, int b) {
		this.a = a;
		this.b = b;
		return a+b;
	}
	
	
	private int minus (int i, int j) {
		int result = i - j;
		return result;
	}
	public int minus = minus(3, 1);
	public void minus () {
		System.out.println(minus);
	}
	
}
