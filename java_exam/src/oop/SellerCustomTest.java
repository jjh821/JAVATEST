package oop;
public class SellerCustomTest {
	public static void main(String[] args) {
		Seller seller = new Seller();
		Customer customer = new Customer();
		
		seller.isStock = 100; // 재고 설정
		customer.wallte = 10000; // 지갑 돈 설정
		

		seller.isSell(5);	// 5개 판매
		System.out.println("");
		customer.Byecount(5); // 5개 구입
		
		
	}
}