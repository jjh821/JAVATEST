package com.ktdsuniversity.edu.fp.basic;

import com.ktdsuniversity.edu.fp.basic.impl.CallAge;
import com.ktdsuniversity.edu.fp.basic.impl.CallAge2;
import com.ktdsuniversity.edu.fp.basic.impl.PrintName;
import com.ktdsuniversity.edu.fp.basic.impl.PrintName2;

public class CallFunction {

	
		
		public void callInterface(PrintSomething ps) {
			String something = "반복";
			ps.print(something);
		}
		
		public void callAbstratClass(CallSomething cs) {
			String something = "쉰다섯";
			int result = cs.call(something);
			System.out.println(result);
		}
		
		public static void main(String[] args) {
			
			CallFunction cf = new CallFunction();
			cf.callInterface(new PrintName2());
			cf.callAbstratClass(new CallAge2());
			
			
			cf.callInterface(new PrintSomething() {

				@Override
				public void print(String message) {
					System.out.println(message);
					if(message != null) {
						System.out.println(message + "는 " + message.length() + "글자 입니다");
					}
				}
			});
			// 새로운기능을 클래스없이 만들어보자
			cf.callAbstratClass(new CallSomething() {

				@Override
				public int call(String message) {
					if( message != null) {
						return message.length();
					}
					return 0;
				}
			});
			//메소드만 전달
			cf.callInterface((String message) -> System.out.println(message + " 입니다.") );//중괄호가 없어지면 반환을 시킨다.
//			파라미터가 1개이면  파이프 없이도 쓸수 있다.
			
			//			boolean은 어떤 타입인 경우에도 상관없이 받는다.
			
//			만약에 일치하지 않을 경우에는 
			cf.callInterface((String message) -> message.length() ); // 이게 왜 작동되는지는;
//			cf.callAbstratClass((String message) -> { return 0;  }); // 아랫줄만 에러가 나는이유는 반환값이 없기때문
			
			PrintSomething function = (String message) -> {
				if (message == null) {
					System.out.println("파라미터 잘못됨");
				}
				else {
					System.out.println(message.repeat(40));
				}
			};
			
			System.out.println(function);
			
			cf.callInterface(function);
		}
		
	

}
