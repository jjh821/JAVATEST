package com.ktdsuniversity.edu.inheritance.storeexam.storelist;


import com.ktdsuniversity.edu.inheritance.storeexam.StoreItem;
import com.ktdsuniversity.edu.restaurant.customer.Customer;


public class Store {
	/**
	 * 손님은 별도의 클래스를 만들어서 사용
	 * 로직은 예전 레스토랑 패키지 커스토머 부분참조
	 * 
	 * 일반 마트 
	 * 상품 진열 판매 거스름돈 계산식
	 * 세 가게에 공통적으로 존재하는 기능들만 있으므로
	 * 부모 클래스로 적용
	 * 상속은 일반마트 -> 편의점 -> 백화점 순으로
	 * 위에서 했던 배트모빌 까지의 방식을 참고
	 * 오버라이딩 최대한 배제
	 * 
	 * 진열 상품 목록은 배열 이용  자판기 상품 로직 참조
	 * 상품 구매는 단일 하나가 아니기 때문에 
	 * for 문을 이용한 반복문을 사용해 구매로직
	 * 돈이 상품금액의 
	 *  총합보다 부족하면 
	 * 부족 출력
	 * 
	 * 
	 */
	
	StoreItem[] items;
	

	// 자판기 클래스의  배열 수 이용
	public Store(StoreItem items1,StoreItem items2,StoreItem items3,StoreItem items4) {
		this.items = new  StoreItem[4];
		this.items[0] = items1;
		this.items[1] = items2;
		this.items[2] = items3;
		this.items[3] = items4;
		
	}
	
	public void sellItems(int itemNumber,int quantity, Customer customer) {
		if (itemNumber < 0 || itemNumber >= this.items.length) {
			System.out.println("상품 목록에 없습니다");
			return;
			
		}
		
		StoreItem target = this.items[itemNumber];
		
		if(target.getStock() == 0) {
			System.out.println("품절 되었습니다!");
			return;
		}
		if (target.getStock() < quantity) {
			System.out.println("구매하려는 수량이 재고보다 많습니다.");
			return;
		}
		int totalPrice = target.getPrice() * quantity;
		
		if (customer.getWallet() < totalPrice) {
			System.out.println("돈이 부족합니다  부족한 금액: " + (totalPrice - customer.getWallet()));
		} else {
	
		customer.setWallet(customer.getWallet() - totalPrice); // 지갑 갱신
		target.setStock(target.getStock() - quantity);         // 재고 갱신
		System.out.println(target.getName() + " " + quantity + "개 구매 ");
		System.out.println("거스름돈: " + customer.getWallet()); 
		}
	}		
		
	public void itemInfo() {
		for (int i = 0; i < this.items.length; i++) {
			System.out.println(this.items[i].getName() + " " + this.items[i].getStock() + "개 남았습니다.");
		}
	}
	
	
	
}
