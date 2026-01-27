package com.ktdsuniversity.edu.array;

public class ArrayExam {
	
	public static void main(String[] args) {
		int[] numArray = new int[10];
		numArray[0] = 10;  //길이를 제한시키고 값을 구한다
		//							       0    1    2   3  4----
		String[] strArray = new String[] {"A", "B","C","D","E"};// 값을 할당함으로서 길이를 구한다;
		//String[] strArray = new String[0]; 은 같은 뜻
		System.out.println(strArray[3]);//"D"
		
		
		String[] strArray2 = {"A","B","C","D","E","F","G"};
		System.out.println(strArray2[6]);
		

	}
	
}
