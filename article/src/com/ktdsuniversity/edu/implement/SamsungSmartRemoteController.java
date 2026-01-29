package com.ktdsuniversity.edu.implement;

public class SamsungSmartRemoteController  implements SamsungRemoteController{

	@Override
	public void turnOn(TV tv) {
		tv.turnOn();
		
	}

	@Override
	public void turnOff(TV tv) {
		tv.turnOff();
		
	}

	@Override
	public void changeCannel(TV tv, int channelNumber) {
		tv.changeCannel(channelNumber);
		
	}

	@Override
	public void changeVolumn(TV tv, int volumn) {
		tv.changeVolumn(volumn);
		
	}

	@Override
	public void runNetflix(SamsungSmartTV tv) {
		tv.runNetflix();
		
	}

	@Override
	public void Menu(SamsungSmartTV tv) {
		tv.runMenu();
		
	}

	@Override
	public void runCoupangPaly(SamsungSmartTV tv) {
		tv.runCoupangPaly();
		
	}


	

}
