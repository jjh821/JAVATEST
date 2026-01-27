package com.ktdsuniversity.edu.array;

public class Q1087 {
	public static void main(String[] args) {
		int[] numArray = {1 , 4, 1, 2,4,2,4,2,3,4,4};
		int findNum = 2;
		
		int count = 0;  //배열관련 문제가 나왔다면 묻지도 따지지도 말고 반복
		for (int i = 0; i < numArray.length; i++) {
			if(numArray[i] == findNum) {
				count++;
			}
		}
		System.out.println(count);
	}

}
