package com.ktdsuniversity.edu.fp.basic.convert;

public class Test {
	public static void main(String[] args) {
		Converter converter = new Converter();
		
		//숫자로 변환한 결과를 반환
		converter.printConverterResult2("10", str -> Integer.parseInt(str));
		converter.printConverterResult2("12", Integer::parseInt); //에러가 없이 동작되는 이유 : 형태가 똑같기 때문 public static int parseInt(String s)
		
		converter.printConverterResult2("dkrqw", str -> str.length());
		converter.printConverterResult2("dkrqw", String::length);//단축표현 위아래 두줄은 같은 의미로 동작된다. 
		//중요한건 파라미터의 타입이 중요함 
	}
}
