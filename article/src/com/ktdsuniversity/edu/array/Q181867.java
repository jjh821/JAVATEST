package com.ktdsuniversity.edu.array;
/**
 * 문자열 myString이 주어집니다.
 *  myString을 문자 "x"를 기준으로 나눴을 때
 *   나눠진 문자열 각각의 길이를 
 * 순서대로 저장한 배열을 return 하는 solution
 *  함수를 완성해 주세요.
 * 
 * 
 */
public class Q181867 {

	public static void split(String str) {

		if (str.endsWith("x")) {
			str += " ";
		}
		
		String[] splitted = str.split("x");
		
		int[] result = new int[splitted.length];

		for (int i = 0; i < splitted.length; i++) {
			result[i] = splitted[i].trim().length();
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		split("oxooxoxxox");
		split("xabcxdefxghi");
	}
}