package com.ktdsuniversity.edu.array;

public class Q2562 {

	public static void main(String[] args) {
		int[] num = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		int max = Integer.MIN_VALUE;
		int index = 0;
		
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
				index = i;
			}
		}
		
		System.out.println(max);
		System.out.println(index + 1);
		
	}
}
