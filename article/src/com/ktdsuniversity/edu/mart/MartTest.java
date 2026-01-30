package com.ktdsuniversity.edu.mart;

public class MartTest {

	public static void main(String[] args) {
		Mart mart = new Mart ("무",1500);
		CVSMart cvs = new CVSMart("도시락",3000);
		DepartmentMart depart = new DepartmentMart("나이키 운동화",200000);
		
		Guest guest = new Guest(10000 , 0);
		Guest guest2 = new Guest(50000, 10000);
		Guest guest3 = new VIP(1_000_000,20000);
		
		mart.sell(guest, 3);
		cvs.sell(guest2, 2);
		depart.sell(guest3, 3);
		
		
		System.out.println("현재 보유 " + guest);
		System.out.println("현재 보유 " + guest2);
		System.out.println("현재 보유 " + guest3);
	}

}
