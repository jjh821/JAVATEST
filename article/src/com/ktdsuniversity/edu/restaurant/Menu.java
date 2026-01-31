package com.ktdsuniversity.edu.restaurant;

public class Menu {
	private String foodname;
	private String alcoholname;
	private int foodprice;
	private int alcoholprice;
	private int weight;
	private double alcoholabv;
	
	private int foodstock = 100;
	private int alcoholstock = 100;

	public Menu(String foodname, int weight, int foodprice) {
		this.foodname = foodname;
		this.weight = weight;
		this.foodprice = foodprice;
	}

	public Menu(String alcoholname, double alcoholabv, int alcoholprice) {
		this.alcoholname = alcoholname;
		this.alcoholabv = alcoholabv;
		this.alcoholprice = alcoholprice;
	}

	// Getter & Setter (탭 간격 및 수직 정렬 적용)
	public String getFoodname() {
		return foodname;
	}

	public String getAlcoholname() {
		return alcoholname;
	}

	public int getFoodprice() {
		return foodprice;
	}

	public int getAlcoholprice() {
		return alcoholprice;
	}

	public int getWeight() {
		return weight;
	}

	public double getAlcoholabv() {
		return alcoholabv;
	}

	public int getFoodstock() {
		return foodstock;
	}

	public void setFoodstock(int foodstock) {
		this.foodstock = foodstock;
	}

	public int getAlcoholstock() {
		return alcoholstock;
	}

	public void setAlcoholstock(int alcoholstock) {
		this.alcoholstock = alcoholstock;
	}
}
