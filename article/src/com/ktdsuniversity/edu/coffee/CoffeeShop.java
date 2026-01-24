package com.ktdsuniversity.edu.coffee;

public class CoffeeShop {
	/**
	 * 커피숍에서 판매하는 따뜻한 아메리카노
	 * 
	 */
	private Coffee hot;
	/**
	 * 커피숍에서 판매하는 시원한 음료
	 * 
	 */
	private Coffee ice;
	
	
	
	public CoffeeShop(Coffee hot, Coffee ice  ) {
		this.hot = hot;
		this.ice = ice;
		
	}
	
	/**
	 * 
	 * @param menu	메뉴들의 번호 1: hot 2: ice
	 * @param quantity 주문수량
	 * @param isStock 
	 * @return	주문가격
	 */
	public int orderCoffee(int menu, int quantity) {

		if(menu == 1) {
			if (this.hot.getStock() >= quantity) {
				System.out.println(this.hot.getName() + "음료를 " + quantity + "개 주문 받았습니다.");
				int stock = this.hot.getStock();
				stock -= quantity;
				this.hot.setStock(stock);
				return this.hot.getPrice() * quantity;
				}
			else {
				return 0;
			}
		}
		else if (menu == 2) {
			if (this.ice.getStock() >= quantity) {
			System.out.println(this.ice.getName() + "음료를 " + quantity + "개 주문 받았습니다.");
			int stock = this.ice.getStock();
			stock -= quantity;
			this.ice.setStock(stock);
			return this.ice.getPrice() * quantity;
			
			
			}
			else {
				 return 0;
			}
		}
		else{
			System.out.println("존재하지 않는 음료 입니다");
			return 0;
		}
		
	

		
	}

	
}
