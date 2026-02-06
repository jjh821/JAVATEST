package com.ktdsuniversity.edu.fp.basic.calc;

public class Test {
	
	public static void main(String[] args) {
		Calculator calc2 = new Calculator();
		
		// num1 ,num2를 더해 반환한다.
		int result = calc2.calc2(1,2 ,(num1,num2) -> num1 + num2);
		
		//파라미터가 여러개일때는 소괄호가 생략이 안된다
		// 반환을 시켜야 함으로 중괄호 생략
		
		System.out.println(result);
		
		// num1, num2를 제곱한 수를 반환
		result = calc2.calc2(3, 4, (num1,num2) -> (int)Math.pow(num1, num2));
		System.out.println(result);
		
		//num1, num2중 작은 수를 반환
		 result = calc2.calc2(2,66 ,(num1,num2) ->Math.min(num1, num2) 
	
		);
		System.out.println(result);
		
		
		//num1이 num2의 제곱수라면 0을반환, 아니라면 1을 반환
		result = calc2.calc2(24, 4, (num1,num2) ->(num1 == Math.pow(num2, 2)) ? 0 : 1);
		System.out.println(result);
		
	}

}
