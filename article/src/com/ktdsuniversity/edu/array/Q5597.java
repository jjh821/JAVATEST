package com.ktdsuniversity.edu.array;

//순서가 정렬이 안되있는 배열을 먼저 정리하고 
// 중간에 빠진 숫자를 상수 빼듯이 빼면된다
// 예시 1 = 2-1 1과 2는 이어짐 3-30= 27 이어지지않음
//	


import java.util.Arrays;

public class Q5597 {

	public static void main(String[] args) {
		int[] nums = {3, 1, 4, 5, 7, 9, 6, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
		
		// 정렬
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					temp = nums[i];			
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		// 과제를 내지 않은 사람 찾기
		int[] miss = new int[nums.length];
		int missIndex = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1] - 1) {
				miss[missIndex++] = nums[i] + 1;
			}
		}
		
		System.out.println(miss[0]);
		System.out.println(miss[1]);
		
	}
}
