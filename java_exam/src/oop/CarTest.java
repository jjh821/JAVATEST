package oop;

public class CarTest {

	public static void main(String[] args) {
		
		//boolean bool;
		//int sp;
		//System.out.println(sp);
		
		Car kona = new Car();
		System.out.println(kona);
		kona.pressEngineStartButton();// 추가하면 엔진 스타트 버튼 메소드를 호출해서 시동을 켬
		kona.pressGasolinPedal(20); // speed 30
		
		//kona의 엔진 상태를 출력한다
		boolean konakEngineState = kona.isEngineStart;
		System.out.println("kona Engine: " +  konakEngineState);
		//kona의 현재 속도를 출력한다.
		int konaSpeed = kona.speed;
		System.out.println("kona speed: " + konaSpeed);
		
		
		
		
		Car carnival = new Car(); // 카니발의 엔진 상태와 스피드를 출력
		System.out.println(carnival);
		
		carnival.pressGasolinPedal(200);
		carnival.pressEngineStartButton();
		carnival.pressBreakPedal(10);
		carnival.pressBreakPedal(10);
		
		boolean carnivalEngineState = carnival.isEngineStart;
		int carnivalSpeed = carnival.speed;
		System.out.println("carnival.Engine: " + carnivalEngineState);		
		System.out.println("carnival.Speed: " + carnivalSpeed);		
		
		
	}
	
}
