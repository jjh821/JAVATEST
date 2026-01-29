package com.ktdsuniversity.edu.inheritance;

public class Bird extends Animal { //확장한다. 에러가 나는 이유 : 생성자가 없기때문

	private boolean isFly;
	private float walkingSpeed;
	
	public Bird(String name, String voice, float speed,float damage, float hitPoint) {
		super(name, voice , speed , damage, hitPoint);
		this.walkingSpeed = speed;
	}
	public void fly() {
		this.isFly = true;
		super.setSpeed(70f);
	}
	public void land() {
		this.isFly = false;
		super.setSpeed(this.walkingSpeed);// 원래속도
	}
	public boolean getIsFly() {
		return this.isFly;
	}
	//Brid 클래스의 최종 Super Class 인 Object 클래스의 toString()메소드를 다시 정의한다.
	@Override
	public String toString() { //toString 구조를 여기서 변경
		String str = "Bird [name: %s, isFly: %s]";
		return str.formatted(super.getName(), this.isFly);
	}
	
}
