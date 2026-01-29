package com.ktdsuniversity.edu.mart;
//백화점
public class DepartmentMart  extends CVSMart{

	public DepartmentMart(int productPrice) {
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
					 
	@Override
	public int usePoint(Guest guest) {
		int point = guest.getPoint();
		// 백화점은 10,000점 이상일 때만 사용 가능 (편의점의 100점 규칙을 덮어씀)
		if (point >= 10000) {
			guest.usePoint(point);
			return point;
		}
		return 0;
		}

		@Override
		public int discount(Guest guest, int amount) {
			// VVIP는 10%  VIP 3% 
			if (guest instanceof VVIP) {
				return (int) (amount * 0.1);
			} else if (guest instanceof VIP) {
				return (int) (amount * 0.03);
			}
			return 0;
		}

		@Override
		public void givePoint(Guest guest, int amount) {
			// 백화점 등급별 나누기 
			if (guest instanceof VVIP) {
				guest.addPoint((int) (amount * 0.03));
			} else if (guest instanceof VIP) {
				// VIP는 적립 없음 
			} else {//일반마트도 마찬가지;
				guest.addPoint((int) (amount * 0.005));
			}
	
	
		}
}