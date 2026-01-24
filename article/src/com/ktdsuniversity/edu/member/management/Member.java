package com.ktdsuniversity.edu.member.management;

public class Member {
	
		private String id; //String 에서는 Member 패키지의 내용을 알수가 없는 상태
		private String name; // public 의 추가로 내용 공개
		
		
		public Member(String id , String name){
			
			this.id = id;
			this.name = name;
			
		} 
		
		public String getId(){//노출시키고 싶은변수의 타입을 반환타입으로 설정
			return this.id;
		}
		public String getName(){//노출시키고 싶은변수의 타입을 반환타입으로 설정
			return this.name;
		}
		
		
							
		public void printInfo(){
			System.out.println("작성자 ID" + this.id);
			System.out.println("작성자 이름" + this.name);
		}
}
