package com.ktdsuniversity.edu.array;

public class Q10818 {

	public static void main(String[] args) {
		int[] num = {20, 10, 35, 30, 7};
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
			if (num[i] > max) {
				max = num[i];
			}
		}
		
		System.out.println(min + " " + max);
	}
}