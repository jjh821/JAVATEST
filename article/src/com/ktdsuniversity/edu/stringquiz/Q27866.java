package com.ktdsuniversity.edu.stringquiz;
// 
//S와 정수 
//i가 주어졌을 때, 
//S의 
//i번째 글자를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q27866 {
	// 
	//단어 S와 정수 
	//i가 주어졌을 때, 
	//S의 
	//i번째 글자를 출력하는 프로그램을 작성하시오.

	

		private Scanner keyboard;
		private String startWord;
		private int intNum;
		
		
		
		public Q27866(){
			this.keyboard = new Scanner(System.in);
		}
		
		public void whatNumber() {
			System.out.println("단어를 입력");
			this.startWord = this.keyboard.nextLine();
			
			System.out.println("정수를 입력");
			this.intNum = this.keyboard.nextInt();
			
			if(intNum <= this.startWord.length()) {
				String result = this.startWord.substring(intNum - 1, intNum);
			
			
			System.out.println(result );
			
			}
			
			
			
	}
			
			
		
}
	
		

