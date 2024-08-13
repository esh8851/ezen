package com.mycompany.ch10.second;

public class ThrowsEx {

	public static void main(String[] args) throws ClassNotFoundException {

		aaa();
		
	}
	
	public static void aaa() throws ClassNotFoundException {
		Class clazz = Class.forName("ExTry");
	}

}
