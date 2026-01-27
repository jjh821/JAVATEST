package com.ktdsuniversity.edu.array;

import java.util.Arrays;

public class Q181853 {

	public static void main(String[] args) {
		int[] numList = {12, 4, 15, 46, 38, 1, 14};
		
		int temp = 0 ;
		for (int i = 0; i < numList.length; i++) {
			for(int j = i + 1; j < numList.length; j++) {	
				if(numList[i] > numList[j]) {
			
				 temp = numList[i];
				 numList[i] = numList[j];
				 numList[j] = temp;
				}
			}
			
		}
		int[] result = new int[numList.length - 2]; // 데이터 길이 제한
		for(int i = 0; i < numList.length- 2 ; i++) {
			result[i] = numList[i] ;
		}
		System.out.println(Arrays.toString(result));
	}
}
