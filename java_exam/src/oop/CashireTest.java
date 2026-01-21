package oop;

public class CashireTest {
    public static void main(String[] args) {
        Cashier cashier = new Cashier();

        // 1. 손님 입장
        cashier.isCustomer = false;
        cashier.amountMoney = 10000;
        cashier.CheckoutCustomer();

        // 2. 카드 결제 시도 (잔액 부족 상황)
        cashier.isCard = true;
        cashier.isCardMoney = 5000;
        cashier.paymentMethod();
        cashier.cardPayment();

        // 3. 다른 수단으로 변경 (현금 결제)
        cashier.isCard = false; // 카드 모드 끄기
        cashier.isCash = true;  // 현금 모드 켜기
        cashier.isCashMoney = 20000; // 2만원 제출
        cashier.paymentMethod();
        cashier.cashPayment();
    }
}