package com.ktdsuniversity.edu.stringquiz;
import java.util.Scanner;
/**
 * 
 * 문제
 * 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.

출력
첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
 * 
 */


public class Q2743 {
	private Scanner keyboard;
	private String startWord;
	

	
	
	
	public Q2743(){
		this.keyboard = new Scanner(System.in);
	}
	public void wordLength() {
		System.out.println("단어를 입력");
		this.startWord = this.keyboard.nextLine();
		
		int result = this.startWord.length();
		
		
		System.out.println(result );
	}
	public static void main(String[] args) {
		Q2743 quiz = new Q2743();
		quiz.wordLength();
		}




}

