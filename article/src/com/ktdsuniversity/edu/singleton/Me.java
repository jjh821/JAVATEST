package com.ktdsuniversity.edu.singleton;

public class Me {
	
	
	private int money;
	private int point;
	//애플리케이션 전역에서 쓰겠다. = static
	private static Me me; 
	
	
	private String name;
	
	
	//생성자가 공개되어있지않는다. 만약 공개되어있으면 어디에서나 인스턴스를 만들 수 있기때문에
	public Me(){
		this.name = "장민창";	
	}
	
	public  static Me getInstance() {
		//원래는 synchronized 라는게 추가로 필요함
		if(Me.me == null) {
			Me.me = new Me(); 
		}
		return Me.me;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
