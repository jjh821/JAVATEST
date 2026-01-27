package com.ktdsuniversity.edu.array;

import java.util.Arrays;

public class Q181868 {

	public static void printWord(String str) {
		// 좌우 공백 제거
		str = str.trim();

		// 중복 공백 문자 제거.
		while (str.contains("  ")) {
			str = str.replace("  ", " ");
		}

		String[] splitted = str.split(" ");

		System.out.println(Arrays.toString(splitted));
	}

	public static void main(String[] args) {
		printWord(" i    love  you");
		printWord("    programmers  ");
	}
}