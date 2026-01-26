package com.ktdsuniversity.edu.stringquiz;

import java.util.Scanner;

public class Q10809 {
	private Scanner keyboard;
	
	public Q10809(){
		this.keyboard = new Scanner(System.in);
	}
	public void findAlp() {
		String s = this.keyboard.next();
		
		for (char c = 'a'; c <= 'z'; c++) {
			int index = s.indexOf(c);
			System.out.print(index + " ");
		}
		
		
	}
	
	public static void main(String[] args) {

		Q10809 quiz = new Q10809();
		quiz.findAlp();

	}

}
