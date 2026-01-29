package com.ktdsuniversity.edu.mart;
// 편의점

public class CVSMart extends Mart{

	public CVSMart(int productPrice) {
		super(productPrice);
	}
		 
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
					
	//오버라이드 써야 문제로직 해결가능
	// 기본값 0을 무시하고 다시 로직 구성
			
		
	@Override
	public int usePoint(Guest guest) {
			int point = guest.getPoint();
			if (point >= 100) {
			guest.usePoint(point);
			return point;
			}	
			return 0;
	}

	@Override
	public void givePoint(Guest guest, int amount) {
		int point = (int) (amount * 0.001);
		guest.addPoint(point);
	}
}
	


