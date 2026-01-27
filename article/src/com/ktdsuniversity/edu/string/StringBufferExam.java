package com.ktdsuniversity.edu.string;

public class StringBufferExam {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("sadsadwqerwqfagj");
		sb.append("sadsadwqerwqfagj");
		sb.append("sadsadwqerwqfagj");
		sb.append("sadsadwqerwqfagj");
		sb.append("sadsadwqerwqfagj");
		
				
		String str = sb.toString();
		
		System.out.println(sb);
		System.out.println(str);
		
		
		StringBuffer longString = new StringBuffer();
		for (int i = 0; i < 10; i++) {
			longString.append("sdsasasadsadsa");
			
		}
		apppendString(longString);
		
		String resulString = longString.toString();
		System.out.println(resulString);

	}
	private static void apppendString(StringBuffer buffer) {
		buffer.append("asdsadsfsfa");
		
	}
	
}
