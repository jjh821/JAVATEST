package com.ktdsuniversity.edu.exceptions;

public class TryExam {
	
	public static void handleException() {
		try {
		Class.forName("sdfsdfd");
		}
		catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
	
	public static void numberFormatExam(String str) {
		if (str != null) {
			int value = 0;
			try {
				
				System.out.println("변환 전!");
				value = Integer.parseInt(str);  // 예외 발생 가능성 높음
				System.out.println("변환 후!"); //만약에 a라는 글자를 str에게 할당했다고 하면 이코드는 동작이 되지않는다 catch에세 바로 가버리기 때문
			}
			catch (NumberFormatException nfe) {
				
				System.out.println(nfe.getMessage());
				nfe.printStackTrace(); // 에러가 발생하게 된 원인들을 모두 출력
				
			}
			System.out.println(value);
		
		}
		
		
		
	}
	public static void main(String[] args) {
		numberFormatExam("10000");
		numberFormatExam("3212113");
		numberFormatExam("asddsaf");
		numberFormatExam("10000");
		
		
	}
}
