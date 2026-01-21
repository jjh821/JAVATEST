package oop;

public class Cashier {
	/**
	 * <pre>
	 * 
	 * 손님이 계산대로 온다  
	 * 손님에게 금액을 안내한다
	 * 
	 * 손님에게 결재 수단을 물어본다.
	 * 손님에게 받은 결제 수단으로 결재를 시도한다
	 * 1.현금이라면 금액이 맞는지 확인하고 
	 * -정확한 금액이면 그대로 결재
	 * -금액이 많으면 결재 후 거스름돈을 준비
	 * -가게 포스기 안에 거스름 돈을 줄 금액이 충분한지 확인
	 * -충분하다면 거슬러주고 없다면 결제 실패 후 다른 결제수단으로 결제하도록 안내
	 * -금액이 적으면 결재 실패 후 부족한 금액을 안내하거나 다시 결재 수단으로 돌아감
	 * 
	 * 2. 카드를 받은 경우
	 * - 카드잔액이 충분하면 결재 후 다시 결재수단으로 돌아간다
	 * - 잔액이 부족하다면 다시 결재수단으로 돌아간다
	 * -
	 
	 * -있다면 1.에서 계산된 거스름돈 값을 확인후 준다.
	 * 
	 * -카드 결재시 성공이면 계산 완료 안내 문구만 출력한다.
	 * 
	 * </pre>
	 */
		
		boolean isCustomer; // 손님
		int amountMoney = 9000; // 결재금액
	
		
		public void CheckoutCustomer(){
			if (!isCustomer) {
				System.out.println("계산 대기중.");	
				isCustomer = false;
				return;
			}
			else {
				System.out.println("계산 안내 도와드리겠습니다.");
				isCustomer = true;
			}
		}	
		
		
		public void CustomerAmountMoney(){	
			if (!isCustomer) {
				System.out.println("계산 대기 중 ");	
				return;
			}
			if (amountMoney > 0 ) {
				System.out.println("결재금액은 총" + amountMoney +"입니다.");
			}
			else {
				System.out.println("결재 할 금액이 없습니다");
				return;
			}
			
			
			
		}
		
		
		boolean isCard;
		boolean isCash;
		
		public void paymentMethod() {
			if (!isCustomer) {
				System.out.println("손님이 없습니다 대기 중 .");		
				return;
			}
			if (isCard) {
				System.out.println("카드 결재"); //카드를 내민경우
				
			}
			else if (isCash) {  //현금을 준 경우
				System.out.println("현금 결재");
			}
		}
		
		
		int isCardMoney;
		
		public void cardPayment() {
			if (!isCustomer) {
				System.out.println("손님이 없습니다 대기 중 .");		
				return;
			}
			if (isCardMoney >= amountMoney) {
				System.out.println("결재가 완료되었습니다.");
				return;
			}
			else {
				System.out.println("카드 잔액이 부족합니다.");
				
			}
		}
		int isCashMoney;
		
		public void cashPayment() {
			if (!isCustomer) {
				System.out.println("손님이 없습니다 대기 중 .");		
				return;
			}
			if (isCashMoney >= amountMoney) {
				System.out.println("결재가 완료되었습니다.");
				System.out.println("거스름돈은" + (isCashMoney - amountMoney)+"입니다.");
				return;
			}
			else if( isCashMoney == amountMoney ){
				System.out.println("결재가 완료되었습니다.");
				return;
			}
			else  {
				System.out.println("현금이 부족합니다.");
				
			}
			
		}
}


