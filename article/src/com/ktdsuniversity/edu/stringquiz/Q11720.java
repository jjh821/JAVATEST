package com.ktdsuniversity.edu.stringquiz;

import java.util.Scanner;

public class Q11720 {
/** 예시
 * int length = numString.length();

int radix =1;
for (int i= 1; i < length(); i++;){
	radix * =10;
}
long num = Long.praseLong(numString);
int divResult = 0;
int sum = 0;
while (ture){
	divResult = (int) (num/radix);
	sum += divResult;

	
	num = (divResult * radix);
	radix /= 10;
	
	if (radix == 0){
	    break;
	}
	System.out.println(sum);
 * 
 * 
 * 
 */
	
	private Scanner keyboard;
	
	public Q11720() {
		this.keyboard = new Scanner(System.in);	
	}
	public void plusNum() {
		int n = this.keyboard.nextInt(); 
		// 
		String numbers = this.keyboard.next();
		
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			char tempChar = numbers.charAt(i);
			int num = Integer.parseInt(tempChar + "");
			sum += num;
		}
	
		
		System.out.println(sum);
		
	
	}
		 
	
	
	
	public static void main(String[] args) {
		Q11720 quiz = new Q11720();
		quiz.plusNum();
		
	}

}

