package oop;

public class Seller {
	
	int proPay = 1000; // 상품가격
	int isStock; //재고
	int shopMoney = 0; // 자본금
	
	public void isSell(int num) {	
		if (isStock == 0){		// 이 부분을 맨아래로 내려서 else 식으로 했다면 더 간결했을 것
			System.out.println("품절되었습니다");
			return; //return도 여기서 하기보단 아래 상품 구매중에 재고가 소진되면 품절요청
		}			//안내 상황이 나올수 있었으므로 좀더 고려했으면 좋은 코드가 됬을 것
		
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


