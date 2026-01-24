package oop;
//메인코드는 필요한 경우에만 생성
/**
 *<pre>
 * 객체 지항 프로그래밍의 첫번째 실습
 * 
 * 자동차의 속성과  기능을 구현함으로서 
 * 객체에 대해 이해한다.
 * </pre>
 */
public class Car {
	//클래스의 속성 (맴버변수  | 인스턴스 필드)
	/**
	 * <pre>
	 * 엔진의 시동여부 
	 * 엔진이 꺼져있을떄는 가속페달을 누르거나 
	 * 브레이크 페달을 눌러도 아무런 효과가 없다
	 * 엔진이 켜져 있을때는 누르는 페달에 따라 속도 (speed)가 변화된다.
	 * </pre>
	 */
	boolean isEngineStart;
	/**
	 * <pre>
	 * 자동차의 현재 속도를 표현한다
	 * 
	 * 
	 * 가속페달을 누르면 속도가 증가한다
	 * 브레이크 페달을 누르면 속도가 감소한다
	 * 
	 * 
	 * </pre>
	 */
	int speed; //메소드가 아니라 클래스 안쪽에 적음= 인스턴스 필드
	//인스턴트 메소드.
	
	
	String name;	//맴버변수
	/**
	 * 
	 * 일반적으로 생성자의 타입과 이름은 맴버변수의 타입과 이름이 같다
	 */
	public Car(String name) { //지역변수
		// 맴버변수  = 파라미터;  란 얘기 그럼 car test 파일에서 오류가 날것 
		this.name = name;
	}
	
			
	/**
	 * 현재 엔진의 상태에 따라서 시동을 켜거나 끈다
	 * 시동이 걸리면 isStartEngine 의 값이 true 꺼지면 false 가 된다.
	 * 시동이 꺼지면 speed 의 값은 0이 된다.
	 * 시동이 켜지면 speed 의 값은 10이 된다.
	 */
	public void pressEngineStartButton() {  //특수한 경우를 제외하고 static 안쓴다
		if (isEngineStart) {
			speed = 0;
			System.out.println("시동을 끕니다.");
			System.out.println("현재 속도는: "+ speed);
		}
		else {
			System.out.println("시동을 켭니다.");
			System.out.println("현재 속도는: "+ speed);
			isEngineStart = true ;
			speed = 10;
		}
	}
	/**
	 * <pre>
	 * 시동이 켜져 있을때 가속 페달을 누르는 압력만큼 속도가 증가한다.
	 * </pre>
	 * @param press 가속페달을 누르는 압력의 정도
	 */
	public void pressGasolinPedal(int press) {
		if (!isEngineStart) {
			speed += press;
			System.out.println("먼저 시동을 거세요");
			return;
		}
		speed += press;
		if (speed > 240) {
			speed = 240;
		}
		System.out.println("현재 속도는: "+ speed);
	}
	/**
	 * <pre>
	 * 시동이 켜져있을 때 브레이크 페달을 누르는 압력만큼 속도가 감소한다
	 * </pre>
	 * @param press 브레이크 페달을 누르는 압력의 정도
	 */
	public void pressBreakPedal(int press) {
		if(!isEngineStart) {
			speed -= press;
			if(speed < 0) {
				speed = 0;
			}
			System.out.println("현재 속도는: "+ speed);
		}
	}
	
	
}
