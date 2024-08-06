package com.mycompany.ch06.second;

public class IphoneEx {

	public static void main(String[] args) {
		
//		Iphone iphone = new Iphone();

		Iphone iphone2 = new Iphone(14);
		System.out.println("iphone2.cpu: " + iphone2.cpu);
		
		Iphone iphone3 = new Iphone(14, "64기가");
		System.out.println("iphone3.cpu: " + iphone3.cpu);
		System.out.println("iphone3.memory: " + iphone3.memory);
		
		Iphone iphone4 = new Iphone(14, "64기가", "Black");
		System.out.println("iphone4.cpu: " + iphone4.cpu);
		System.out.println("iphone4.memory: " + iphone4.memory);
		System.out.println("iphone4.color:" + iphone4.color);
		
	}

}
