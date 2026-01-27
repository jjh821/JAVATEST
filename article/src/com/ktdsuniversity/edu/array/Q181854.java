package com.ktdsuniversity.edu.array;

public class Q181854 {

	public static void main(String[] args) {
		int[] arrList = {49, 12, 100, 276, 33};
		
		int n = 27;
		if(arrList.length % 2 != 0) {
			for (int i = 0; i < arrList.length; i+=2) {
				arrList[i] += n;
			 	
			}
		}else {
			for (int i = 1; i < arrList.length; i+=2) {
				arrList[i] += n;
			}
				
		}
		System.out.println(java.util.Arrays.toString(arrList));
	
	}
}
/** 강사님 코드
 * public class Q181854 {

	public static void add(int[] arr, int num) {
		if (arr.length % 2 == 1) {
			for (int i = 0; i < arr.length; i += 2) {
				arr[i] += num;
			}
		}
		else {
			for (int i = 1; i < arr.length; i += 2) {
				arr[i] += num;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		add(new int[]{49, 12, 100, 276, 33}, 27);
		add(new int[]{444, 555, 666, 777}, 100);
	}
}
 * 
 */
