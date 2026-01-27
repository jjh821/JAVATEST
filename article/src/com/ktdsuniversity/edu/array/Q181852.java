package com.ktdsuniversity.edu.array;

import java.util.Arrays;

public class Q181852 {

	public static void main(String[] args) {
		int[] numlist = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		/*
		 * 1. [12, 4, 15, 46, 38, 1, 14, 56, 32, 10]
		 * 2. [4,12, 15, 46, 38, 1, 14, 56, 32, 10]  //앞에 있는 숫자 2개를 비교해서 작은게 앞으로 와라
		 * 3. [4,1, 15, 46, 38, 12, 14, 56, 32, 10]  //12와 15비교 12와 16비교....12와 1비교시에 1이 더 작으므로 1이 12의 자리로
		 * 4. [4,1, 15, 46, 38, 10, 14, 56, 32, 12]  // 10과 12 위치 변경
		 * 5. [4,1, 15, 46, 38, 10, 14, 56, 32, 12]  // 4를 가지고 비교 4의 위치와 1의 위치를 변경
		 * 6. [1,4, 14, 46, 38, 10, 15, 56, 32, 12]  // 
		 * 7. [1,4, 10, 46, 38, 14, 15, 56, 32, 12]  // 
		 * 8. [1,4, 10, 38, 14, 46, 15, 56, 32, 12]  // 
		 * 9. [1,4, 10, 38, 14, 32, 15, 56, 46, 12]  // 
		 * 10. [1,4, 10, 14, 38,32 , 15, 56, 46, 12]  //1.에서 38 뒤로 비교 
		 * 11. [1,4, 10, 14, 32,38 , 15, 56, 46, 12]  //1.에서 38 뒤로 비교 
		 * 12. [1,4, 10, 14, 32,38 , 15, 56, 46, 12]  //1.에서 38 뒤로 비교 
		 * ....
		 * n. [1,4,10,12,14,15,32,38,46,56]; // 비교를 하면서 높이있는 인덱스와 비교 이 사이클이 12에서 부터 시작해서 반복
		 */
		int temp = 0;
		for (int i = 0; i < numlist.length; i++) {
			for(int j = i + 1; j < numlist.length; j++) {
				System.out.println(numlist[i] + "와 비교중인 숫자는" + numlist[j]);
				if(numlist[i] > numlist[j]) {
					// numlist[j]와  numlist[i]의 자리를 바꾼다.
				 //흔히 많이 하는 실수 
					// a =b; b = a;   이러면 a = 7 b = 7이된다.
					// int c = a; a =b; b = c; 이렇게하면  a = b 는 둘다 7 b = c는 둘다 5
				 temp = numlist[i];
				 numlist[i] = numlist[j];
				 numlist[j] = temp;
				}
			}
			
		}
		
		int[] result = new int[numlist.length - 5];
		for(int i = 5; i < numlist.length; i++) {
			result[i-5] = numlist[i];
		}
		System.out.println(Arrays.toString(result));

	}

}
