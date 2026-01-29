package com.ktdsuniversity.edu.inheritance;

public class Zoo {
	public static void main(String[] args) {
		String name = "장민창";
		String other = "장민창";
		System.out.println(name == other);
		
		
		
		//Bird bird = new Animal("오리","꽥",15f,20f,50f);
		
		Animal lion = new Animal("사자","크아앙", 80f, 60f, 200f);
		
		Animal tiger = new Animal("호랑이","어흥", 50f, 55f, 200f);
		
		
		Animal duck = new Bird("오리","꽥",15f,20f,50f);
		Animal duck2 = new Bird("오리","꽥",15f,20f,50f);
		
		System.out.println(duck.getName().equals(duck2.getName()));
		
		System.out.println("== 비교" + (duck == duck2));
		System.out.println("equals 비교" + duck.equals(duck2) );
		duck.howling();
		duck.move();
		//duck.fly();
		//duck.land();
		
		System.out.println(duck);
		
		StringBuffer sb = new StringBuffer();
		sb.append("sadsasadsad");
		System.out.println(sb);
		//
		//if(duck instanceof Bird) {
			//Bird bird = (Bird) duck;
			//bird.fly();
			//bird.land();
		//}
		//현재버젼
		if (duck instanceof Bird bird) {
			bird.fly();
			bird.land();
			
			bird.land();
			bird.move();
			
			bird.fly();
		}
		
	
		
		lion.howling();
		tiger.howling();
		
		lion.move();
		tiger.move();
		
		tiger.attack(duck);
		lion.attack(tiger);
		tiger.attack(lion);
		duck.attack(tiger);
		
		
	}
}
