package com.ktdsuniversity.edu.app.v1;

import java.util.ArrayList;
import java.util.List;

class ContactManager {
	private List<Contact> contactList;
	
	public ContactManager() {
		this.setContactList(new ArrayList<>());
		
	}
	/**
	 * 각각의 기능은 메소드로 만들고 파라미터는 스스로 고려
	 * 
	 * 
	 */
	//1. contactlist에 contact 인스턴스를 추가하는 기능
	public void addContact(Contact contact) {
		this.contactList.add(contact);
	}
	
	//2.contactList의 모든 연락처 정보를 출력하는 기능

	public void printAllContacts() {
		this.contactList.forEach(System.out::println);
	}
	
	
//	//3. contactList에서 전화번호 검색결과 출력하는기능
//	
//	// 예> 010을 파라미터로 전달하면 전화번호에 010이 포함된 연락처의 모든 정보를 출력한다

	public List<Contact> searchPhone(String number) {
		List<Contact> result = new ArrayList<>(); // 
		for (Contact c : this.contactList) { 
			if (c.getPhones() != null && !c.getPhones().isEmpty()) {
				if (c.getPhones().get(0).getPhoneNumber().contains(number)) {
					result.add(c);
				}
			}
		}
		return result;
	}
//	//4.contactList에서 이름 검색결과 출력하는 기능
//	// 예> "김" 을 파라미터로 전달하면 name. firestName . lastName, companyName,

	public List<Contact> searchName(String name) {
		List<Contact> result = new ArrayList<>();
		for (Contact c : this.contactList) {
			if (c.getName() != null && c.getName().contains(name)) {
				result.add(c);
			}
		}
		return result;
	}
////	//5.contactList에서 이메일 검색결과 출력하는 기능
////	// 예> "@abc.com"을 파라미터로 전달하면 이메일에 "@abc.com"이 
////		//포함된 연락처의 모든 정보출력
/// 

	public List<Contact> searchEmail(String email) {
		List<Contact> result = new ArrayList<>();
		for (Contact c : this.contactList) {
			if (c.getName() != null && c.getEmail().contains(email)) {
				result.add(c);
			}
		}
		return result;
	}
	//6. 연락처 정보 수정기능
	
	
	// 예> 다양한 검색의 결과중 하나를 선택해  연락처 정보를 수정할수 있는 기능
	//    이름을 변경, 전화번호 ,추가 , 전화번호 수정, 회사정보 수정
	 public void replaceContact(Contact contact) {
		 for (Contact c : this.contactList) {
			 if (c.getName().equalsIgnoreCase("Y")) {
				 
			 }
		 }
	 }
	
	//7.연락처 정보 삭제 기능
	//예> 다양한 검색의 결과중 하나를 선택해서 contactList에서 제거하는 기능/.
	public void deleteContact(int index) {
		if (index >= 0 && index < this.contactList.size()) {
			this.contactList.remove(index);
		}
	}
	
		public static void main(String[] args) {
			ContactHelper helper = new ContactHelper();
			
			ContactManager cm = new ContactManager();
			int menuNum = 0;
			
			List<Contact> searchResult = null;
			String searchKeyword = null;
			while (true) {
				
				searchKeyword = null;
				searchResult = null;
				
				System.out.println("=".repeat(40));
				System.out.println("1. 연락처 등록");
				System.out.println("2. 연락처 조회");
				System.out.println("3. 연락처 검색 - 전화번호");
				System.out.println("4. 연락처 검색 - 이름");
				System.out.println("5. 연락처 검색 - 이메일");
				System.out.println("9. 종료");
				System.out.println("=".repeat(40));
				
				menuNum = helper.inputInteger();
				if (menuNum == 9) {
					break;
				}
				else if (menuNum == 1) {
					cm.addContact(helper.makeContact());
				}
				else if (menuNum == 2) {
					cm.printAllContacts();
				}
				else if (menuNum == 3) {
					searchKeyword = helper.inputRequireField(1, "검색할 전화번호를 입력하세요: ", "한 글자 이상 입력하세요.");
					searchResult = cm.searchPhone(searchKeyword);
				}
				else if (menuNum == 4) {
					searchKeyword = helper.inputRequireField(1, "검색할 이름을 입력하세요: ","한 글자 이상 입력하세요.");
					searchResult = cm.searchName(searchKeyword);
				}
				else if (menuNum == 5) {
					searchKeyword = helper.inputRequireField(1, "검색할 이메일을 입력하세요: ","한 글자 이상 입력하세요.");
					searchResult = cm.searchEmail(searchKeyword);
				}
				
				if (searchResult != null) {
					System.out.println("[" + searchKeyword + "] 검색 결과");
					
					if (searchResult.isEmpty()) {
						System.out.println("검색 결과가 존재하지 않습니다.");
					}
					else {
						System.out.println(searchResult.size() + "개의 연락처가 검색되었습니다.");
						for (Contact contact : searchResult) {
							System.out.println(cm.getContactList().indexOf(contact) + ". " +  contact);
						}
						
						helper.replaceOrDeleteContact(cm);
					}
				}
			}
		}
	
	
	public List<Contact> getContactList() {
		return this.contactList;
	}
	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}
}
