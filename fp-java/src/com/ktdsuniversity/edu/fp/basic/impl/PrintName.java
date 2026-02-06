package com.ktdsuniversity.edu.fp.basic.impl;

import com.ktdsuniversity.edu.fp.basic.PrintSomething;

public class PrintName implements PrintSomething{

	@Override
	public void print(String message) {
		System.out.println(message.repeat(5));
		
	}
		//null을 전달했을때 에러가 나지않는 클래스 하나 더만듦
	
	
	

}
