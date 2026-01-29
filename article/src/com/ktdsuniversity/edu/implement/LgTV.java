package com.ktdsuniversity.edu.implement;

public class LgTV implements LgSmartTV{

	@Override
	public void turnOn() {
		
		System.out.println("LG 티비를 켭니다.");
	}

	@Override
	public void turnOff() {
		
		System.out.println("LG 티비를 끕니다.");
	}

	@Override
	public void changeCannel(int channelNumber) {
		System.out.println("삼성 티비의 채널을 바꿉니다." + channelNumber);
		
	}

	@Override
	public void changeVolumn(int volumn) {
		System.out.println("삼성 티비의 채널을 바꿉니다." + volumn);
		
	}

	@Override
	public void runNetflix() {
		System.out.println("LG 티비의 넷플릭스를 켭니다.");
		
	}

	@Override
	public void runInternet() {
		System.out.println("LG 티비의 인터넷을 켭니다.");
		
	}

	@Override
	public void runYoutube() {
		System.out.println("LG 티비의 유튜브를 켭니다.");
		
	}
	
}
