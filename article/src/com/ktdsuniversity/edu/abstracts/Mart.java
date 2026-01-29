package com.ktdsuniversity.edu.abstracts;

public  class Mart extends AbstractMart {  
	/**에러가 안사라지는 이유 슈퍼클래스에
	 *  구현되지않은 메소드 3개가 존재하기때문
	 *  
	 *  상속한 클래스가 추상 클래스 이면서 추상 메소드가 존재할경우
	 *  추상 메소드를 구현하지않으면 에러가 발생한다.
	 *  
	 *  해결방법 2가지
	 *  	1. 추상 메소드를 서브 클래스에서 구현한다  --> 추상 메소드를 오버라이드한다.
	 *  	2. 서브클래스를 추상 클래스로 변환한다. --> 인스턴스로 생성할 수 없다
	 *  	
	 *  
	*/
	public Mart(int prouctPrice) {
		super(prouctPrice);
		
	}
	@Override
	public int usePoint(Guest guest) {
	
		return 0;
	}
	@Override
	public void givePoint(Guest guest, int amount) {
	
		
	}
	@Override
	public int discount(Guest guest, int amount) {
		
		return 0;
	}
	
}
