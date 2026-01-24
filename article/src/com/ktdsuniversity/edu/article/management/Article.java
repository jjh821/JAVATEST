package com.ktdsuniversity.edu.article.management;

import com.ktdsuniversity.edu.member.management.Member;


public class Article {
	
	String title;
	//String authorName;
	//String authorID;  
	String content;
	Member author;  // 첫번쨰 방법 타입을 쓸때  패키지를 쭉 작성
					// 두번쨰 방법 import 를 사용
					// 세번째 방법 Quick fixes 사용
					// 네번째 방법 control + shift + 대문자 O 를 해서 패키지 선택 
	// 작성자와 관련되어있는 member 가 이미 있으므로 Member 를 이용
	
	public Article(String title, Member author, String content) {
		this.title = title;
		this.author = author;
		this.content = content;
				
	}
	
	public void viewArticleDescription() { //맴버 변수에 있는 내용 전부출력
		System.out.println("제목" + this.title);
		System.out.println("내용" + this.content);
		//this.author.printInfo();  // 아래 두개 코드는 필요없음
		System.out.println("작성자 id" + this.author.getId());   // 올바르게 적어도 오류가 나는 상태 
		System.out.println("작성자 name" + this.author.getName()); // 접근지시자를 활용하면 오류 해결
	}
	
	
	public static void main(String[] args) {
		
		Member author = new Member("superuser", "관리자");
		Article article = new Article("테스트", author, "내용");	 //"테스트", 맴버인스턴스, "내용"
		article.viewArticleDescription(); //게시글 내용을 출력
	}
	
}
