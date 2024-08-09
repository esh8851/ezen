package com.mycompany.ch07.first;

public class RadioCar extends Car{
	
	public int channel;
	
	public void radioOn () {
		System.out.println("라디오를 켭니다.");
	}
	
	public void changeChannelRadio (int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	public void radioOff () {
		System.out.println("라디오를 끕니다.");
	}
	
	public void radioOff (int a) {
		
	}

	@Override
	public void powerOn() {
		System.out.println("자식의 시동을 켭니다.");
	}

}
