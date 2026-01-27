package com.ktdsuniversity.edu.array;

public class Q181861 {

	public static void make(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		int[] result = new int[sum];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i]; j > 0; j--) {
				result[index] = arr[i];
				index++;
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		make(new int[] {5, 1, 4});
		make(new int[] {6, 6});
		make(new int[] {1});
	}
}