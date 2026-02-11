package com.ktdsuniversity.edu.app.v1;

import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactTest {
	private List<Contact> contactList;
	private Scanner input;
	public ContactTest() {
		this.setContactList(new ArrayList<>());
		this.input = new Scanner(System.in);
	}
	private void setContactList(ArrayList arrayList) {
		// TODO Auto-generated method stub
		
	}
	
	//1. contactlist에 contact 인스턴스를 추가하는 기능
	public void addContact(Contact contact) {
		this.contactList.add(contact);
	}
	
	//2.contactList의 모든 연락처 정보를 출력하는 기능
	public void printContact(Contact contact) { 
		System.out.println("연락처 목록");
		 if(this.contactList.isEmpty()) {  // 목록에 아무것도 없는 상황이라면
			 System.out.println("등록된 연락처가 없습니다. 등록을 먼저 하세요");
			 return;
		 }
		 for(Contact c : this.contactList) {
			System.out.println("이름" + c.getFirstName() + " " + c.getLastName());
			System.out.println("회사명" + c.getCompany().getCompanyName() );
			System.out.println("이메일 정보"+ c.getEmail());
			System.out.println("-------------------------");
		 }
	}
//	public void printAllContacts() {
//		this.contactList.forEach(System.out::println);
//	}
	
	
//	//3. contactList에서 전화번호 검색결과 출력하는기능
//	
//	// 예> 010을 파라미터로 전달하면 전화번호에 010이 포함된 연락처의 모든 정보를 출력한다
	public void searchNumber(String number) {
		if (number == null || number.trim().isEmpty()) {
			System.out.println("검색어를 입력하세요.");
			return;
		}

		for (Contact c : this.contactList) {
			// 번호 리스트가 있는지 확인 후 첫 번째 번호 꺼내기
			if (c.getPhones() != null && !c.getPhones().isEmpty()) {
				Phone p = c.getPhones().get(0);
				
				// 번호에 검색어가 포함 여부
				if (p.getPhoneNumber().contains(number)) {
					// 모든정보 출력
					System.out.println("--- 번호 검색 결과 ---");
					System.out.println("이름: " + c.getLastName() + c.getFirstName());
					
					// 회사 정보 
					if (c.getCompany() != null) {
						System.out.println("회사: " + c.getCompany().getCompanyName() + " (" + c.getCompany().getJob() + ")");
					}
					
					System.out.println("번호: " + p.getPhoneNumber() + " [" + p.getPhoneType() + "]");
					System.out.println("이메일: " + c.getEmail());
					
					// 메모
					if (c.getMemo() != null && !c.getMemo().isEmpty()) {
						System.out.println("메모: " + c.getMemo());
					}
					System.out.println("----------------------");
				}
			}
		}
	}
//	public List<Contact> searchPhone(String number) {
//		List<Contact> result = new ArrayList<>();
//		for (Contact c : this.contactList) { 
//			if (c.getPhones() != null && !c.getPhones().isEmpty()) {
//				if (c.getPhones().get(0).getPhoneNumber().contains(number)) {
//					result.add(c);
//				}
//			}
//		}
//		return result;
//	}
//	//4.contactList에서 이름 검색결과 출력하는 기능
//	// 예> "김" 을 파라미터로 전달하면 name. firestName . lastName, companyName,
//	//에 "김"이 포함된 연락처의 모든 정보 출력
	public void searchName(String name) {
		if (name == null || name.trim().isEmpty()) {
			System.out.println("검색어를 입력하세요.");
			return;
		}

		for (Contact c : this.contactList) {
			// 조건을 하나씩 체크
			// 1. 성(lastName)에 포함
			// 2. 이름(firstName)에 포함
			// 3. 회사명(companyName)에 포함
			
			boolean isMatch = c.getLastName().contains(name) || 
					  c.getFirstName().contains(name) || 
					  (c.getCompany() != null && c.getCompany().getCompanyName().contains(name));

			if (isMatch) {
				// 모든 조건 중 하나라도 맞으면 "모든 정보" 출력
				System.out.println("--- 검색 결과 ---");
				System.out.println("이름: " + c.getLastName() + c.getFirstName());
				System.out.println("회사: " + (c.getCompany() != null ? c.getCompany().getCompanyName() : "정보 없음"));
				System.out.println("이메일: " + c.getEmail());
				
				// 전화번호 리스트가 비어있지 않을 때만 첫 번째 번호 출력
				if (c.getPhones() != null && !c.getPhones().isEmpty()) {
					System.out.println("번호: " + c.getPhones().get(0).getPhoneNumber());
				}
				System.out.println("-----------------");
			}
		}
	}
//	public List<Contact> searchName(String name) {
//		List<Contact> result = new ArrayList<>();
//		for (Contact c : this.contactList) {
//			if (c.getName() != null && c.getName().contains(name)) {
//				result.add(c);
//			}
//		}
//		return result;
//	}
//	//5.contactList에서 이메일 검색결과 출력하는 기능
//	// 예> "@abc.com"을 파라미터로 전달하면 이메일에 "@abc.com"이 
//		//포함된 연락처의 모든 정보출력
	public void searchEmail(String email) {
		if (email == null || email.isEmpty()) { //이메일을 보통 붙여쓰지 공백은 없을테니
			System.out.println("검색어를 입력하세요.");
			return;
		}
		for(Contact c : this.contactList) {
			
			//조건체크  
			// 리스트에서 입력한 이메일에 @abc.com 이 포함 되어 있는가
			boolean isMatch = c.getEmail().contains(email);
			
			if (isMatch) {
				System.out.println("--- 검색 결과 ---");
				System.out.println("이름: " + c.getLastName() + c.getFirstName());
				System.out.println("회사: " + (c.getCompany() != null ? c.getCompany().getCompanyName() : "정보 없음"));
				System.out.println("이메일: " + c.getEmail());
				
				if (c.getPhones() != null && !c.getPhones().isEmpty()) {
					System.out.println("번호: " + c.getPhones().get(0).getPhoneNumber());
				}
				
				System.out.println("-----------------");
			}
			
		}	
	}
//	public List<Contact> searchEmail(String email) {
//		List<Contact> result = new ArrayList<>();
//		for (Contact c : this.contactList) {
//			if (c.getName() != null && c.getEmail().contains(email)) {
//				result.add(c);
//			}
//		}
//		return result;
//	}
	//6. 연락처 정보 수정기능
	
	public void replaceContact() {
		
			
			
	}
	
	// 예> 다양한 검색의 결과중 하나를 선택해  연락처 정보를 수정할수 있는 기능
	//    이름을 변경, 전화번호 ,추가 , 전화번호 수정, 회사정보 수정
	
	//7.연락처 정보 삭제 기능
	//예> 다양한 검색의 결과중 하나를 선택해서 contactList에서 제거하는 기능/.
	public void deleteContact(int index) {
		if (index >= 0 && index < this.contactList.size()) {
			this.contactList.remove(index);
		}
	}
	
	/**
	 * Phone(Phone.Type phoneType, String phoneNumber)
	 * 폰 파라미터
	 * 
	 * public Company(String companyName, String job , String address)
	 * 회사 파라미터
	 * 
	 * 연락처 배열 데이터()
	 * 
	 * 연락처 검색
	 *  연락처에 들어있는 정보 (이름,전화번호,회사정보,직급,)
	 *  
	 *  로직
	 * 반복(while)   // 항공예약편 참조
	 * 안에 for
	 * 연락처 혹은 회사명을 묻는데
	 * if(키보드 = null 이면)
	 * 		System.out 없는 번호 입니다
	 * else if(연락처들 중에서 키보드로 입력받았을때 그 번호가 List에서 일치하는 부분이 조금이라도 있다면)
	 		해당 번호를 가진 연락처 contact가 나와야함*
	 		
	 	
	 	회사명 검색
	 	
	 		
	 	
	 	stream을 쓸까? 
	 	//stateId가 3907번인 City의 ContryName을 출력
		for(City city: cities) {
			if(city.getStateId() == 3907) {
				System.out.println(city.getCountryName());
			}
		}
		시티에서 for문은 단순히 이거였는데
		포문은 사용하지 않는게 좋겠다
		쓰면 너무 많다;
		
		디쉬에서처럼 contact를 List로 만들어 버리면 되지않을까
		new contact ( )
		
		
		
		
	 	
	 *
	 */
	
	
	public static void main(String[] args) {
		
	}
	
	
}
