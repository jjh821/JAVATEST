package com.ktdsuniversity.edu.restaurant;

public class RestaurantTest {
	public static void main(String[] args) {
		// 1. 식당 및 메뉴 구성
		// 메뉴 배열 생성 (음식명, 무게, 음식값, 술이름, 도수, 술값 순서)
		Menu[] menus = new Menu[2];
		menus[0] = new Menu("치킨", 40, 20000);
		menus[1] = new Menu("맥주", 4.5, 4000);

		Restaurant rest = new Restaurant();
		rest.setMenuArray(menus); // 메뉴판 등록
		rest.setAccount(45000);   // 식당 자본금 설정

		Customer kim = new Customer("김갑환", 100000); // 손님 구성 (이름, 지갑)
		
		
		
		
		try {
			// 치킨(0번 메뉴) 1개,
			rest.takeOrderByName(kim, "치킨", 1); //치킨주문
		}
		catch (ArrayException ae) {
			System.out.println("메뉴판에 없는 번호입니다. 번호를 확인하고 다시 주문하세요.");
		}
		catch (StockException se) {
			System.out.println("식당에 재고가 부족합니다. 다른 메뉴를 선택하세요.");
		}
		catch (FullException fe) {
			System.out.println("손님이 너무 배가 부릅니다. 더 이상 주문할 수 없습니다.");
		}
		catch (MoneyException me) {
			System.out.println("지갑에 잔액이 부족합니다. 돈을 더 채우고 주문하세요.");
		}
		
		try {
			rest.takeOrderByName(kim, "맥주",99); // 술 주문
		}
		catch (ArrayException ae) {
			System.out.println("메뉴판에 없는 번호입니다. 번호를 확인하고 다시 주문하세요.");
		}
		catch (StockException se) {
			System.out.println("식당에 재고가 부족합니다. 다른 메뉴를 선택하세요.");
		}
		catch (DrunkenException de) {
			System.out.println("손님이 너무 취했습니다. 술은 그만 마시게 하세요.");
		}
		catch (MoneyException me) {
			System.out.println("지갑에 잔액이 부족합니다. 돈을 더 채우고 주문하세요.");
		}

		// 3. 최종 결과 확인
		System.out.println("\n--- 최종 주문 결과 확인 ---");
		System.out.println("손님 이름: " + kim.getName());
		System.out.println("손님 배부름: " + kim.getFull());
		System.out.println("손님 취기: " + kim.getDrunk());
		System.out.println("손님 잔액: " + kim.getWallet());
		System.out.println("식당 매출(자본금): " + rest.getAccount());
	}
}
