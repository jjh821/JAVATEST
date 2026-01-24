package com.ktdsuniversity.edu.coffee;

public class CoffeeShopTest {
	
	public static void main(String[] args) {
		
		Coffee hotCoffee = new Coffee("아메리카노 hot", 4500 ,1000);
		Coffee iceCoffee = new Coffee("아이스 티", 4000 ,60);
	
		
		CoffeeShop starbucks = new CoffeeShop(hotCoffee, iceCoffee);
		
		int price = starbucks.orderCoffee(1,3);
		System.out.println(price);
		
		price = starbucks.orderCoffee(2, 6);
		System.out.println(price);
		
		
		price = starbucks.orderCoffee(0, 10);
		System.out.println(price);
		
	}

}
