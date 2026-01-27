package com.ktdsuniversity.edu.stringquiz;
import java.util.Scanner;
public class Q2908 {
	
	private Scanner keyboard;
	private String a, b, ra, rb;
	public Q2908() {
		this.keyboard = new Scanner(System.in);
	}
	public void printGreaterReversedNumber() {
		this.a = this.keyboard.next();
		this.b = this.keyboard.next();
		this.ra = "";
		this.rb = "";
		// for문과 charAt을 사용하여 문자열 뒤집기
		for (int i = 2; i >= 0; i--) {
			this.ra += this.a.charAt(i);
			this.rb += this.b.charAt(i);
		}
		// Integer.parseInt로 숫자로 변환하여 비교
		int na = Integer.parseInt(this.ra);
		int nb = Integer.parseInt(this.rb);
		System.out.println(na > nb ? na : nb);
	}
	public static void main(String[] args){
		Q2908 quiz=new Q2908();
		quiz.printGreaterReversedNumber();
	}
}