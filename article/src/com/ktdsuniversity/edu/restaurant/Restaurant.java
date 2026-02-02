package com.ktdsuniversity.edu.restaurant;



public class Restaurant {

	
	private int account;
	private Menu[] menuArray;
	
	//private List<String> menus = new ArrayList
	private final int MAX_FULLNESS = 100;
	private final double MAX_DRUNK = 10.0;

	public void takeOrderByName(Customer customer, String name, int count) {
		for (int i = 0; i < menuArray.length; i++) {
			if (menuArray[i].getFoodname() != null && menuArray[i].getFoodname().equals(name)) {
				this.takeOrder(customer, i, count, 0);
				return;
			}
			if (menuArray[i].getAlcoholname() != null && menuArray[i].getAlcoholname().equals(name)) {
				this.takeOrder(customer, i, 0, count);
				return;
			}
		}
		throw new ArrayException("메뉴판에 없는 이름입니다: " + name);
	}

	public void takeOrder(Customer customer, int menuIndex, int foodCount, int alcoholCount) {

		if (menuIndex < 0 || menuIndex >= menuArray.length) {
			throw new ArrayException("메뉴 번호 오류");
		}

		Menu selectedMenu = menuArray[menuIndex];

		if (selectedMenu.getFoodstock() < foodCount || selectedMenu.getAlcoholstock() < alcoholCount) {
			throw new StockException("재고 부족");
		}

		int totalPrice = (selectedMenu.getFoodprice() * foodCount) + (selectedMenu.getAlcoholprice() * alcoholCount);
		int expectedFull = customer.getFull() + (selectedMenu.getWeight() * foodCount);

		double expectedDrunk = customer.getDrunk();
		if (alcoholCount > 0) {
			double rawDrunk = expectedDrunk + (selectedMenu.getAlcoholabv() * 0.1 * alcoholCount);
			expectedDrunk = Math.round(rawDrunk * 10) / 10.0;
		}

		if (expectedFull > this.MAX_FULLNESS) {
			throw new FullException("배가 너무 부름");
		}
		if (expectedDrunk >= this.MAX_DRUNK) {
			throw new DrunkenException("너무 취했음");
		}
		if (customer.getWallet() < totalPrice) {
			throw new MoneyException("잔액 부족");
		}

		customer.setFull(expectedFull);
		customer.setDrunk(expectedDrunk);
		customer.setWallet(customer.getWallet() - totalPrice);

		selectedMenu.setFoodstock(selectedMenu.getFoodstock() - foodCount);
		selectedMenu.setAlcoholstock(selectedMenu.getAlcoholstock() - alcoholCount);
		this.account += totalPrice;

		System.out.println("주문 성공");
	}

	public void setMenuArray(Menu[] menuArray) {
		this.menuArray = menuArray;
	}
//	public void setMenuArray(Menu[] menuArray) {
//		this.menuArray = menuArray;
//	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getAccount() {
		return account;
	}
}
