package com.ktdsuniversity.edu.stringquiz;
import java.util.Scanner;



public class Q1152 {
		
	private Scanner keyboard;
		private String input;
		private String trimmed;
		
		
		public Q1152(){
			this.keyboard=new Scanner(System.in);
		}
		
		public void countWords(){
			this.input=this.keyboard.nextLine();
			this.trimmed=this.input.trim();
		
			if(this.trimmed.isEmpty()){//스페이스 미포함시 ture
				System.out.println(0); // 글자수가 0개인지 체크
			}else{
				String[] words=this.trimmed.split(" ");// 배열 생성
				System.out.println(words.length);// 배열 출력
			}
		}
		public static void main(String[] args){
			Q1152 quiz=new Q1152();
			quiz.countWords();
		}
}
