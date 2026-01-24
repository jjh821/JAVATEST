package com.ktdsuniversity.edu.restaurant.menu;

public class Menu {
	/**
	 * 데이터 클래스 
	 *
	 *
	 * 음식의 이름
	 * 음식의 가격
	 * 음식의 무게
	 * 
	 * 
	 * 술의 이름
	 * 술의 가격
	 * 술의 도수
	 * 
	 * 데이터 입력 자체는 restaurant 에서 받음
	 * 술과 음식은 손님이 정하지만
	 * 술과 음식의 도수와 무게는 식당이 가지고 있다
	 * 
	 * public 할때 한꺼번에 입력받는것이 난이도가 낮음
	 * 
	 * 음식과 술의 데이터는 식당 손님 양쪽이 모두 요구함
	 * 
	 */
	private String foodname;  //음식 이름
	private String alcoholname;// 술 이름
	private int weight; // 음식 무게
	private double alcoholabv; //술 도수
	private int foodprice; // 음식 가격
	private int alcoholprice;// 술 가격
	
;
	
	public Menu(String foodname, int weight,int foodprice ,String alcoholname,double alcoholabv, int alcoholprice) {
		this.foodname = foodname;
		this.weight = weight;
		this.foodprice = foodprice;
		this.alcoholname = alcoholname;
		this.alcoholabv = alcoholabv;
		this.alcoholprice = alcoholprice;
	}
	
	
	public String getFoodname() {
		return foodname;
	}
	public int getWeight() {
		return weight;
	}
	public String alcoholName() {
		return alcoholname;
	}
	public double  getAlcoholabv() {
		return alcoholabv;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setAlcoholName (String alcoholname) {
		this.alcoholname = alcoholname;
	}
	public void setAlcoholabv(double alcoholabv) {
		this.alcoholabv = alcoholabv;
	}
	public int getAlcoholprice() {
		return alcoholprice;
	}
	public void setPrice(int alcoholprice) {
		this.alcoholprice = alcoholprice;
	}


	public int getFoodprice() {
		return foodprice;
	}


	public void setFoodprice(int foodprice) {
		this.foodprice = foodprice;
	}
	
}
