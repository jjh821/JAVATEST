package com.ktdsuniversity.edu.relaygame;

import java.util.Scanner;

public class RelayGame {
	
	private Scanner keyboard;
	private String startWord;
	private String nextWord;
	
	
	
	
	public RelayGame() {
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
				String lastLetter = this.startWord.charAt(this.nextWord.length() - 1) + "";  // 문제에서 요구사항은 3글자 이상의 단어를 요구함
				
				
				//다음 단어의 첫번째 글자.
				// "기찻길옆오막살이"
				// 01 2 345 67
				String firstLetter = this.nextWord.substring(0, 1); // 0부터 시작해서 1전까지 가지고오라
				
				if(lastLetter.equals(firstLetter)) {  //맞을때
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
