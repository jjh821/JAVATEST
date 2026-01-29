package com.ktdsuniversity.edu.carinstance;

public class Track {

	public static void main(String[] args) {
		Vehicle car = new Vehicle("마티즈");
		Vehicle car2 = new SportsCar("포르쉐 911");
		Vehicle car3 = new EV("Hummer EV", 6000000);
		Vehicle car4 = new BatMobile("배트카");
		
		car.startEngine();
		car2.startEngine();
		car3.startEngine();
		car4.startEngine();
		
	}
}
