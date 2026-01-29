package com.ktdsuniversity.edu.implement;

public class LgSmartRemoteController implements LgRemoteController {

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
	public void runNetflix(LgSmartTV tv) {
		tv.runNetflix();
		
	}

	@Override
	public void runInterne(LgSmartTV tv) {
		tv.runInternet();
		
	}

	@Override
	public void runYoutube(LgSmartTV tv) {
		tv.runYoutube();
		
	}




}
