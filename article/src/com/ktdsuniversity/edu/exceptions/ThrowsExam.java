package com.ktdsuniversity.edu.exceptions;

import java.lang.reflect.Constructor;

//이렇게 하지말란 예제 


public class ThrowsExam {
	
	/**
	 * 
	 * createNewInstance("com.ktdsuniversity.edu.restuarant.Customer")
	 * => Customer 의 인스턴스가 반환  //리플랙션이라는 고급기술임.
	 * @param classPath 
	 * @return
	 */
	
	public static Object creatNewInstance(String classPath) {
		
		Class clazz = null;
		
		try {
			clazz = Class.forName(classPath);//클래스의 원형자체가 반환됨
			}//원래는 throws 의 역할
			catch(ClassNotFoundException cnfe){
			System.out.println(classPath + ":존재하지않는 클래스입니다.");
			}
			if (clazz != null) {
			
			Constructor constructor = null;
			try {
			constructor = clazz.getConstructor(String class , int class);//생성자를 가지고오라  ()의미 생성자에 들어가는 파라미터를 가지고 와라
			}
			catch(NoSuchMethodException nsme){
				System.out.println("생성자를 찾을 수 없습니다.");
			}
			if(constructor != null ) {
				
				
				Object instance = constructor.newInstance("리플랙션",100); //생성자를 가져왔으니 이제 호출하겠다.
				
			}
			
			
			}
		return null;
	}
	
	public static void main(String[] args) {
		Custmoer cust = (Customer) createNewInstance("com.ktdsuniversity.edu.restuarant.Customer");
		System.out.println(cust.Name);
	}

}
