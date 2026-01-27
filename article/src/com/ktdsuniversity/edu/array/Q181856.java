package com.ktdsuniversity.edu.array;

public class Q181856 {

	
	
	public static void main(String[] args) {
		int[] arr1 = {49, 13};
		int[] arr2 = {70, 11, 2};

        // 메서드 호출		
		int result = compareArrays(arr1, arr2);
		System.out.println(result);

	}
		
		
		public static int compareArrays(int[] arr1, int[] arr2) {
		if(arr1.length > arr2.length) {
			return 1;
		}
		else if(arr1.length < arr2.length){
			return -1;
		}else {
			int sum1 = 0;
			int sum2 = 0;
			for(int i = 0; i < arr1.length; i++) {
				sum1 += arr1[i];
				sum2 += arr2[i];
			}
			
			if(sum1 > sum2){
				return 1; //1을 출력; 
			}else if(sum1 == sum2) {
				return 0;
			}else {
				return -1;
			}
		 }
		
	}
}

/** 강사님 코드
 * package com.ktdsuniversity.edu.array;

public class Q181856 {

	public static void compare(int[] arr1, int[] arr2) {
		if (arr1.length > arr2.length) {
			System.out.println(1);
		}
		else if (arr1.length < arr2.length) {
			System.out.println(-1);
		}
		else {
			int aSum = 0;
			int bSum = 0;
			
			for (int i = 0; i < arr1.length; i++) {
				aSum += arr1[i];
			}
			
			for (int i = 0; i < arr2.length; i++) {
				bSum += arr2[i];
			}
			
			if (aSum > bSum) {
				System.out.println(1);
			}
			else if (aSum < bSum) {
				System.out.println(-1);
			}
			else {
				System.out.println(0);
			}
		}
	}
	public static void main(String[] args) {
		compare(new int[] {49, 13}, new int[] {70, 11, 2});
		compare(new int[] {100, 17, 84, 1}, new int[] {55, 12, 65, 36});
		compare(new int[] {1, 2, 3, 4, 5}, new int[] {3, 3, 3, 3, 3});
		
	}
}
 */
