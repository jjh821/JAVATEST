package com.ktdsuniversity.edu.restaurant.restaurant;

import com.ktdsuniversity.edu.restaurant.customer.Customer;
import com.ktdsuniversity.edu.restaurant.menu.Menu;

/**
 * 
 * 식당의 필드
 * 
 * 식당의 취함 기준
 * 
 * 식당의 배부름 기준
 * 
 * 식당 메뉴 리스트
 
 * 
 * 
 * 
 * 
 * 
 *
 
 * 만약에 손님이 너무 취했거나 너무 배부르면
 * * 주문을 거부한다
 * 
 * 만약 식당에 존재하지않는 종류의 음식이나 술이면
 *  주문이 실패한다
 * 
 * 돈이 있는가?
 * 
 *  식당은 메뉴판을 참고해서 손님이 주문한 음식이름
 *  술 이름을 받아온다.
 *  또한 개수도 받아온다
 *  
 *  
 *  
 *  존재한다면 주문을 이어간다.
 *  
 *  식당은 손님이 주문한 음식의 개수만큼 음식값을 계산
 *  식당은 손님이 주문한 술의개수 만큼 술을 받아온다
 * 
 * 
 * 
 * 두 기준에 미달이면 주문 성공* 
 * 
 * buyer 클래스에서 했던 캡슐화를 좀 참고해볼것
 */


public class Restaurant {
	
	private String name;  //
	private int account; // 자본금
	private Menu menu; // 메뉴 데이터 클래스 참조

	
	private final int MAX_FULLNESS = 100; //식당 기준치 배부름
	private final double MAX_DRUNK = 10;// 식당 기준치 취기
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public int	getMAX_FULLNESS() { 
		return MAX_FULLNESS;
	}
	public double getMAX_DRUNK() {
		return MAX_DRUNK;
	}
	
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public void takeOrder(Customer customer, int foodCount, int alcoholCount){
		
		int foodWeight = this.menu.getWeight(); //음식무게
		double alcoholabv = this.menu.getAlcoholabv();//술 도수
		int fPrice = this.menu.getFoodprice(); // 음식값
		int aPrice = this.menu.getAlcoholprice(); // 술값
		
		int totalPrice = ((fPrice * foodCount) + (aPrice * alcoholCount));
		
		int expectedFull = customer.getFull() + (foodWeight * foodCount);
		double rawDrunk = customer.getDrunk() + (alcoholabv * 0.1 * alcoholCount);
		double expectedDrunk = Math.round(rawDrunk * 10) / 10.0;
		
		
		
		
		if (expectedFull > this.MAX_FULLNESS ) {
			System.out.println("배부름 초과 ");
			return;
		}
		if(expectedDrunk >= this.MAX_DRUNK) { // 도수가 제한 기준보다 초과하면
			System.out.println("취기 초과");
			return;
		}
		
		 
		if (customer.getWallet() < totalPrice) {
			System.out.println("잔액 부족"); //지갑 잔액 확인
			return;
		}
		customer.setFull(expectedFull); //
		customer.setDrunk(expectedDrunk);// 취기 = 알코올도수 x 0.1
		customer.setWallet(customer.getWallet() - totalPrice);// 지갑에서 지출

		this.account += totalPrice; // 자본금에 추가 

		System.out.println("주문 성공");
		
		
		
		
		
		
		
	}
	
	
	
}
