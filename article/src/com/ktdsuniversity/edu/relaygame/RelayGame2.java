package com.ktdsuniversity.edu.relaygame;

import java.util.Scanner;

//323페이지 +82인지 확인 하기 참조
// startsWith() 를 사용해서 풀어볼것
public class RelayGame2 {
	private Scanner keyboard;
	private String startWord;
	private String nextWord;
	
	
	
	
	public RelayGame2() {
		this.keyboard = new Scanner(System.in);
	}
	
	public void startGame() {
			System.out.println("게임이 시작되었습니다!");
			System.out.println("시작단어를 입력해주세요");
			this.startWord = this.keyboard.nextLine();  // 시작단어를 입력
			
			while (true) {		//언제 끝날지 모르니 무한반복
				System.out.println("다음단어를 입력해주세요");  // 다음단어의 공백제거
				this.nextWord = this.keyboard.nextLine(); 
				this.nextWord = this.nextWord.trim(); 
				
				
				// 시작단어의 첫번째 글자 추출
				// 배열을 생각하면 편하다.
				// "기찻길옆오막살이" .length() ==> 8 - 1 ===> 7
				// 0 1 2 3 4 5 6 7
				String lastLetter = this.startWord.charAt(this.startWord.length() - 1) + "";  // 문제에서 요구사항은 3글자 이상의 단어를 요구함
							
				
				if (this.nextWord.startsWith(lastLetter)) {  //맞을때
					if(this.nextWord.length() >= 3){
						this.startWord = this.nextWord;
					}
					else {
						System.out.println("게임이 종료되었습니다.");
						break;
					}
				}
				else {
					System.out.println("게임이 종료되었습니다.");
					break;
				}
			}	
			
			
			
		
			
	}
		
	public static void main(String[] args) {
		RelayGame game = new RelayGame();
		game.startGame();
	}
}
