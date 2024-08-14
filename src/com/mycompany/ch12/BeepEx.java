package com.mycompany.ch12;

import java.awt.Toolkit;
//module-info.java
//module ezen {
//	requires java.desktop;
//	requires java.sql;
//}

public class BeepEx {

	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Ctrl + Shift + O
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
