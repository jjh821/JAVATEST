package com.ktdsuniversity.edu.implement;

public class Test {
	public static void main(String[] args) {
		LgSmartTV lgTv = new LgTV();	// lg스마트 티비라고도 할수있고 lg티비라고 할수있다
		LgRemoteController lgRemoteCon = new LgSmartRemoteController(); 
		lgRemoteCon.turnOn(lgTv);
		lgRemoteCon.turnOff(lgTv);
		
		SamsungTV samsungTV = new SamsungTV();
		SamsungRemoteController samsungRemotecon = new SamsungSmartRemoteController();
		samsungRemotecon.turnOn(samsungTV);
		samsungRemotecon.turnOff(samsungTV);
	;
	}
}
