package com.ktdsuniversity.edu.restaurant;
import com.ktdsuniversity.edu.restaurant.customer.Customer;
import com.ktdsuniversity.edu.restaurant.menu.Menu;
import com.ktdsuniversity.edu.restaurant.restaurant.Restaurant;
/**
 * 
 * 식당- 손님 구현
 * 
 * 손님이 들어온다
 * 
 * 손님이 식당에서 주문하려면 먼저 식당이 주문을 받아야한다
 * 
 ** 식당은 손님이 배부른지 확인
 * 식당은 손님이 취한지 확인
 * 
 * 손님이 특정 음식을 식당에 주문한다
 * 음식값의 개수를 받는다.
 * 음식값의 총합을 계산한다
 * 
 * 손님이 특정 술을 식당에 주문한다
 * 술의 개수를 받는다.
 * 술값의 총합을 계산한다.
 * 
 *
 * 손님의 음식값의 총합 + 술값의 총합을 손님 지갑 값과 비교
 * 
 * 모자란다 -> 주문을 거부한다
 * 
 * 충분하다
 *	음식+ 술값의 총합을 손님 지갑에서 뺀다.
 * 손님의 배부름이 증가한다
 * 손님의 알코올 도수가 증가한다.
 * 
 * 출력
 * 손님의 이름
 * 손님의 배부름 정도
 * 손님의 취함 정도
 * 손님이 주문한 음식:
 * 손님이 주문한 술:
 * 현재 손님의 음식값
 * 현재 손님의 술값
 * 현재 지갑의 남은잔액
 * 
 * 
 * 
 * 

 
 */


public class RestaurantTest {
	public static void main(String[] args) {
		// 1. 식당구성
		Menu menu = new Menu("치킨", 40, 20000, "소주", 19.0, 5000);
		Restaurant rest = new Restaurant();
		rest.setMenu(menu);
		rest.setAccount(45000);

		Customer kim = new Customer("김철수", 100000); // 손님 구성 이름,지갑
		
		
		// 2. 주문 실행 (음식 1개, 술 1병)
		rest.takeOrder(kim, 10, 42);
		
		// 3. 결과 확인
		System.out.println("--- 주문 결과 ---");
		System.out.println("손님 배부름: " + kim.getFull());
		System.out.println("손님 취기: " + kim.getDrunk());
		System.out.println("손님 잔액: " + kim.getWallet());
		System.out.println("식당 잔고: " + rest.getAccount());
		System.out.println("식당 기준 취기: " + rest.getMAX_DRUNK());
		System.out.println("식당 기준 배부름: " + rest.getMAX_FULLNESS());
	}
}
