package com.ktdsuniversity.edu.coffee;

public class CoffeeShopTest {
	
	public static void main(String[] args) {
		//int a =10;
		//String str = a +" ";
		//String.value0f(false);
		Coffee hotCoffee = new Coffee("아메리카노 hot", 4500 ,1000);
		Coffee iceCoffee = new Coffee("아이스 티", 4000 ,60);
	
		
//		CoffeeShop starbucks = new CoffeeShop(hotCoffee, iceCoffee);
		CoffeeShop starbucks = new CoffeeShop();
		
		int price = starbucks.orderCoffe(CoffeeOrder.HOT);
		System.out.println(price);
		
		price = starbucks.orderCoffee(CoffeeOrder.HOT);
		System.out.println(price);
		
		
		price = starbucks.orderCoffee(0, 10);
		System.out.println(price);
		
	}

}
