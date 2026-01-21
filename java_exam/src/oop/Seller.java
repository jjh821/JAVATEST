package oop;

public class Seller {
	
	int proPay = 1000; // 상품가격
	int isStock; //재고
	int shopMoney = 0; // 자본금
	
	public void isSell(int num) {
		if (isStock == 0){
			System.out.println("품절되었습니다");
			return;
		}
		
		int realSale; // 실제 판매 개수
		
		if(	num > isStock ) {
			realSale = isStock; // 요구 개수가 많으면
		}
		else {
			realSale  = num; // 적거나 같으면
			
		}
		isStock = isStock - realSale;
		shopMoney = shopMoney + (realSale * proPay);
		
		printStatus();
	}
	public void printStatus() {
		System.out.println("판매자의 재고 수: " + isStock);
		System.out.println("판매자의 자본금: " + shopMoney);
		
	}
}


