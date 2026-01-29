package com.ktdsuniversity.edu.mart;

public class Guest {
	private int money;  
	private int point;
	private double discount;
	
	public Guest(int money,int point) {
		
		this.money = money;
		this.point = point;
	}
	public int getMoney() {
		return this.money;
	}
	
	
	public int getPoint() {
		return this.point;
	}
	
	public void usePoint(int point) {
		this.point -= point;
	}
	
	public void addPoint(int point) {
		this.point += point;
	}
	
	
	public void pay(int amount) {
		this.money -= amount;
	}
	public void giveMoney(int remainMoney) {
		this.money += remainMoney;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	

	
}