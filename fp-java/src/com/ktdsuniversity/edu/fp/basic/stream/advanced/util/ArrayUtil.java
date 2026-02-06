package com.ktdsuniversity.edu.fp.basic.stream.advanced.util;

public abstract class ArrayUtil {
	private ArrayUtil() {}
	
	public static String getValue(String[] array, int index) {
		if(array.length > index && index >= 0) {
			String value = array[index];
			if(value != null) {  // 벨류가 null이 아니면
				value = value.replace("\"", ""); // 벨류에서 제거하라 ""를
			}
			return value;
		}
		return null;
	}
}
