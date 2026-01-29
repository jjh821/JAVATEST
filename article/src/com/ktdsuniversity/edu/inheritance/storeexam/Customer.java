package com.ktdsuniversity.edu.inheritance.storeexam;

public class Customer {
	private String name; // 손님이름
	private String grade; 
	
	private int wallet; // 지갑
	private int point; // 포인트
	
	
	
	public Customer(String name,String grade, int wallet, int point ) {
		this.name = name;
		this.grade = grade;
		this.wallet = wallet;
		this.point = point;
		
	}
	
	public String getName() {
		return name;
	}
	public String getGrade() {
		return grade;
	}
	
	public int getWallet() {
		return wallet;
	}
	public int getPoint() {
		return point;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}
