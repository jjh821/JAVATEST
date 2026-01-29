package com.ktdsuniversity.edu.inheritance.storeexam;

public class StoreItem {
	
	private String name; //상품 이름
	private int price; // 상품 가격
	private int stock; // 재고
	
	public StoreItem(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public String getName() {
		return name;
		
	}
	
	public int getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
