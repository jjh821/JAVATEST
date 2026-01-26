package com.ktdsuniversity.edu.stringquiz;

import java.util.Scanner;

/**
 * 문제
알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

입력
알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

출력
입력으로 주어진 글자의 아스키 코드 값을 출력한다.

예제 입력 1 
A
예제 출력 1 
65
 * 
 * 
 */

public class Q11654 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);// 입력
		
		String intWord = in.nextLine(); // 할당
		
		char result = intWord.charAt(0); // 문자열 하나만 걸러냄
										// 어처피 입력되는 값은 철자 1개와 숫자 1자리 뿐이기 떄문
		System.out.println((int)result); // 문자형을 강제로 int 숫자형으로 바꾸면 아스키 코드 출력
	}
	
}
