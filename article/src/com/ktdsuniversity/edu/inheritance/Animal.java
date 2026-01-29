package com.ktdsuniversity.edu.inheritance;

public class Animal {
		private String name;
		private String voice;
		private float speed;
		private float damage;
		private float hitPoint;
		
		public Animal(String name, String voice, float speed,float damage, float hitPoint) {
			this.name = name;
			this.voice = voice;
			this.speed = speed;
			this.damage = damage;
			this.hitPoint = hitPoint;
			
		}
		
		public String getName() { //게터임
			return this.name;
		}
		
		public void howling() {
			System.out.println(this.name + " : " + this.voice);
		}
		public void move() {
			System.out.println(this.name + " : " + this.speed + "km/h 의 속도로 움직임.");
			
		}
		public void attack(Animal other) {
			if(this.isDead()){
				System.out.println(this.name + " 이(가)  이미 죽어서 행동 할 수 없습니다.");
				return;
			}
			
			if(!(this instanceof Bird) && other instanceof Bird bird){ //내가 새가 아니라면 !this라는 건 없다
				//bird가 날고있으면 공격불가
				if(bird.getIsFly()) {
					System.out.println(other.getName() + " 이(가) 비행중이라 공격 할 수 없습니다");
					return;
				}
			}
			
			System.out.println(this.name + " 이(가) " + other.getName() + "에게 공격하려합니다.");
			if(!other.isDead()) {
			other.getDamage(this.damage);
			}
			else {
				System.out.println(other.getName() + " 이(가) 이미 죽었습니다.");
			}
		}
		public void getDamage(float damage) { //게터 아님
			System.out.println(this.name + " 이(가) " + damage + "만큼의 피해를 입었습니다." );
			this.hitPoint -= damage;
		}
		
		
		public boolean isDead() {
			return this.hitPoint <= 0;
		}
		
		public void setSpeed(float speed) {
			this.speed = speed;
		}
		@Override
		public boolean equals(Object obj) {
			if(this == obj) {
				return true;
			}
			if (obj instanceof Animal other) {
				return  other.getName().equals(this.name);
			}
		return super.equals(obj);
		}

		@Override
		public String toString() {
			return "Animal [name=" + name + ", voice=" + voice + ", speed=" + speed + ", damage=" + damage
					+ ", hitPoint=" + hitPoint + "]";
		}
		
		
		
}
