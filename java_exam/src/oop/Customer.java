package oop;
public class Customer {
	int currentWeight; // 현재 장바구니 무개
	int price = 1000; // 상품 가격
	int proWeight = 500; // 상품 무게 
	int shopBagCount = 0; //현재 상품 개수
	int bagWeight; // 무게 상한선
	int wallte; // 지갑
	public void Byecount(int num) {
		if (wallte < (num * price)) {
			System.out.println("돈이 부족합니다.");
			printStatus();
			return;
		}
		if ((currentWeight + (num * proWeight)) > bagWeight) {
			System.out.println("더 이상 장바구니를 들 수 없습니다.");
			printStatus();
			return;
		}
		wallte -= (num * price);
		shopBagCount += num;
		currentWeight += (num * proWeight);
		printStatus();
	}
	public void printStatus() {
		System.out.println("구매자의 상품 수: " + shopBagCount);
		System.out.println("장바구니의 무게: " + currentWeight + "g");
		System.out.println("지갑의 돈: " + wallte);
	}
}


