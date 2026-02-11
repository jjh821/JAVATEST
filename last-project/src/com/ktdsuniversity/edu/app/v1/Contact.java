package com.ktdsuniversity.edu.app.v1;

import java.util.ArrayList;
import java.util.List;

public class Contact {
	/**
	 * 
	 * 연락처의 이름
	 * 
	 */
	private String name;
	/**
	 * 연락처의 닉네임
	 */
	private String nickname;
	/**
	 * 
	 * 연락처 이메일
	 * 
	 */
	private String email;
	

	/**
	 * 이름
	 */
	//민창
	private String firstName;
	//장
	private String lastName;
	
	/**
	 * 전화 번호 목록
	 */
	private List<Phone> phones;
	/**
	 * 근무중인 회사정보
	 */
	private Company company;
	
	/**
	 * 메모
	 */
	private String memo;
	
	public  Contact(){
		this.setPhones(new ArrayList<>());
	}

	@Override
	public String toString() {
		String phone = (phones != null && !phones.isEmpty()) 
				? phones.get(0).getPhoneNumber() 
				: "번호 없음";
				
		return String.format("이름: %s (별명: %s) | 번호: %s | 이메일: %s", 
							  this.name, this.nickname, this.email, phone);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
