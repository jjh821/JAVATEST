package com.ktdsuniversity.edu.coffee;

public class CoffeeShop {
	
	
	public static final int HOT = 1;
	public static final int ICE = 2;
	
	
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
	
	public CoffeeShop(){
		//this.hot = new Coffee("기본 아메리카노", 1500 ,30);
		//this.ice = new Coffee("아이스 아메리카노", 1500 ,50);
		this(new Coffee("기본 아메리카노", 1500 ,30),
			new Coffee("아이스 아메리카노", 1500 ,50));
	}
	
	
	public CoffeeShop(Coffee hot, Coffee ice  ) {
		this.hot = hot;
		this.ice = ice;
		
	}
	/**
	 * 가장 첫번쨰 메뉴를 한개 주문한다
	 * @return
	 */
	public int orderCoffee(CoffeeOrder coffeeorder) {
		
		if(coffeeorder == CoffeeOrder.HOT) {
			return this.menu = this.hot;
		}else if(coffeeorder == CoffeeOrder.ICE) {
			return this.menu; = this.ice
		}
		
		
	
	}
	
	
	/**
	 * 
	 * 메뉴 한개만 주문
	 * @param menu
	 * @return
	 */
	
	public int orderCoffee(int coffeeor) {
		int price = this.orderCoffee(menu , 1);
		return price;
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
