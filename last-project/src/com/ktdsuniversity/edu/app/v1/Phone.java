package com.ktdsuniversity.edu.app.v1;

public class Phone {

	public static enum Type{
		PERSONAL, HOME, COMPANY
		
	}
	
	private Phone.Type phoneType;
	private String phoneNumber;
	
	public Phone(Phone.Type phoneType, String phoneNumber) {
		this.setPhoneType(phoneType);
		this.setPhoneNumber(phoneNumber);
		
	}

	@Override
	public String toString() {
		return "휴대폰 이름" + phoneType + ", 전화번호" + phoneNumber ;
	}

	public Phone.Type getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(Phone.Type phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
