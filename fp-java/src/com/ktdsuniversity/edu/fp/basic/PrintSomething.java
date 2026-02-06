package com.ktdsuniversity.edu.fp.basic;

@FunctionalInterface  // 무조건 한개만 존재하게 강제함
public interface PrintSomething {
	
	void print(String message);
	
	//void printRepeat(String message);
	// 이 람다가 누구한테 할당하는것인지 모르기때문에 
	// 람다는 한개만 존재해야 하기때문에 2개 이상이거나 아예 없으면 동작하지않음
}
