package com.mycompany.ch06.second;

public class Iphone {
	
	int cpu;
	String memory;
	String color;
	
	Iphone () {
		
	}
	
	Iphone(int cpu){
		this.cpu = cpu;
	}
	
	Iphone(int cpu, String memory){
		this.cpu = cpu;
		this.memory = memory;
	}
	
	Iphone(int cpu, String memory, String color){
		this.cpu = cpu;
		this.memory = memory;
		this.color = color;
	}

}
