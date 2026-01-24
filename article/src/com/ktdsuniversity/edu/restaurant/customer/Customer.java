package com.ktdsuniversity.edu.restaurant.customer;



/**
 * 
 * 손님이 제공하는데이터
 * 손님 이름
 * 지갑
 * 배부름
 * 취기
 * 
 * 
 * 손님은 메뉴판을 참고해서 식당에게 주문을 한다
 * 음식 이름 음식 개수
 * 술 이름  술개수
 * 
 * 주문에 성공하면
 * 음식의 배부름 * 주문 개수 만큼 손님의 배부름에 더한다
 * 술의 도수 * 주문 개수 만큼 손님의 취기에 더한다.,
 * 
 *  .
 * 
 */
public class Customer {
	private String name; // 손님이름
	private int wallet; // 지갑 
	private int full; // 배부름
	private double drunk; // 취기
	
	public Customer(String name,int wallet) {
		this.setName(name);	// 이름받아오기
		this.setWallet(wallet);// 무게 받아오기
		this.setFull(0);		// 취기와 배부름은  항상 0
		this.setDrunk(0.0);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getWallet() {
		return wallet;
	}


	public void setWallet(int wallet) {
		this.wallet = wallet;
	}


	public int getFull() {
		return full;
	}


	public void setFull(int full) {
		this.full = full;
	}


	public double getDrunk() {
		return drunk;
	}


	public void setDrunk(double drunk) {
		this.drunk = drunk;
	}
	
	
	
	

	
}
