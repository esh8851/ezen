package com.mycompany.ch06.second;

public class MouseEx {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse("로지텍");
		System.out.println(mouse.name);
		
		Mouse mouse2 = new Mouse(13, "로지텍", "Black");
		System.out.println(mouse2.mouseNo);
		System.out.println(mouse2.name);
		System.out.println(mouse2.color);
		
		mouse2.color = "White";
		System.out.println(mouse2.color);

	}

}
