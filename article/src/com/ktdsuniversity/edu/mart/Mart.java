package com.ktdsuniversity.edu.mart;

// 일반마트로 치기
public class Mart {
	
	private String productName; // 상품이름
	private int productPrice;// 상품가격
	
	public Mart(String productName,int productPrice) { // 상품 가격
		this.productName = productName;
		this.productPrice = productPrice;
		

	}
	
	//배열로 했었으면 더 좋았을텐데 
	// 일단 당장은 구동이 되는걸 목표
	// 손님 //판매수 //돈
	public void sell(Guest guest, int sellCount) {
	
		int money = guest.getMoney();
		int totalAmount = sellCount * productPrice;// 총 금액 합산
		
		
		System.out.println("상품명: " + this.productName);
	
		
		// 할인 할거 하기
		int discountAmount = this.discount(guest, totalAmount);// 할인 금액

		if (discountAmount < totalAmount) {
			System.out.println("할인 후 금액: " + discountAmount);
		}
		
		
		int usedpoint = this.usePoint(guest);
		if (usedpoint > discountAmount) {
			usedpoint = discountAmount; // 포인트가 결제 금액을 초과하지 않도록 한도 조절
		}
		if (usedpoint > 0) {
		System.out.println("사용한 포인트: " + usedpoint);
		}
		
//		int finalPrice = totalAmount - usedPoint - discountAmount;// 최종 결제액
		int finalPrice = discountAmount - usedpoint  ;// 실제 결제액
		System.out.println("총 결재 금액 :" + finalPrice);
		if (money < finalPrice) {
			System.out.println("돈이 부족합니다.");
			return; // 판매 중단
		}
		guest.pay(finalPrice); // 대금 지불
		guest.usePoint(usedpoint);// 사용한 포인트 깎기
		this.givePoint(guest, discountAmount); // 포인트 적립

		//		guest.giveMoney(change); // 거스름 돈 반환
		System.out.println("구매완료 거스름돈: " + guest.getMoney());
	}

	public int usePoint(Guest guest) { 
		// 백화점인지 / 편의점인지 보고 적립금 사용 여부 결정
	//		if (this instanceof DepartmentStore as) {
	//			int point = guest.getPoint();
	//			if (point >= 10000) {
	//				guest.usePoint(point);
	//				return point;
	//			}
	//		}
		//일반마트에서 안씀 이 로직
		
		return 0; 
	}

	public void givePoint(Guest guest, int amount) {
		//굳이 여기서 구현하기보단...일단 다른 쪽에서 구현하는 방식으로
		}

	public int discount(Guest guest, int amount) {
		// 백화점인지  보고 할인적용
				// if(this instanceof  DepartmentStore ){
				//백화점이면 
				//VIP는 3퍼센트 할인적용
				//VVIP는 10퍼센트 할인적용
			//}
				
				//else 
				// 일반마트나 편의점이면 포인트 적립을 하지않는다
				
				//호출할떄 순서가 그럼
				//할인적용을 먼저 하고 -> 포인트 사용 여부 -> 마지막으로 포인트 적립
				//일반마트에서도 사용안하니까 0반환
		return amount;
	}
}
