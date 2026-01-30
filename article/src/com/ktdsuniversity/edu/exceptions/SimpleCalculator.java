package com.ktdsuniversity.edu.exceptions;

import com.ktdsuniversity.edu.exceptions.custom.DevideZeroException;
import com.ktdsuniversity.edu.exceptions.custom.NullOperatorException;

public class SimpleCalculator {
		/**
		 * 
		 * 계산기 
		 * @param a 계산할 값
		 * @param b 계산할 값
		 * @param operator 연산자 (+,-,*,/)
		 * @return 연산자에 따른 결과를 반환
		 */
		public int calc(int a, int b, String operator) {
			int result = 0;
			
			if (operator == null) {
//				System.out.println("잘못된 연산자 입니다");
				throw new NullOperatorException("잘못된 연산자 입니다.");  // throw 할시 아래코드들이 전부 데드 코드가 되기 때문에 주석처리
//				return 0;
				
				
			}
			
			if (operator.equals("+")) { // null.equals를 쓰는 첫순간 여기서 오류
				result = a + b;
			}
			else if (operator.equals("-")) {
				result = a - b;
			}
			else if (operator.equals("*")) {
				result = a * b;
			}
			else if (operator.equals("/")) {
				
				if(a ==0 || b == 0) {
					throw new DevideZeroException("잘못된 숫자 입니다.");
//					System.out.println("잘못된 숫자 입니다.");
//					return 0;
				}
				
			}
			else {
				throw new WrongThreadException("잘못된 연산자 입니다.");
//				System.out.println("잘못된 연산자 입니다");
			}
			return result;  // 계산 결과를 반환
		}
	
		public static void main(String[] args) {
			
			SimpleCalculator sc = new SimpleCalculator();
			int result = 0;
			
			try {
				result = sc.calc(10, 0, "+");			
			}
			catch(NullOperatorException noe){  // 연산자가 null  일때 처리
				System.out.println("연산자가 비어있습니다. 연산자를 채워서 다시 실행하세요");
			}
			catch(DevideZeroException dze){  // 숫자가 0일때 처리
				System.out.println("0으로 나누려 했습니다. 숫자를 재대로 작성해서 다시 실행하세요");
			}
			catch(WrongThreadException woe){  // 연산자를 잘못 작성했을 때 처리
				System.out.println("지원하지 않는 연산자 입니다 + , - , * ,/ 중에서 선택해서 다시 실행하세요."); // 
			}
			System.out.println(result);
			
			try {
				result = sc.calc(10, 0, "-");			
			}
			catch(NullOperatorException noe){  // 연산자가 null  일때 처리
				System.out.println("연산자가 비어있습니다. 연산자를 채워서 다시 실행하세요");
			}
			catch(DevideZeroException dze){  // 숫자가 0일때 처리
				System.out.println("0으로 나누려 했습니다. 숫자를 재대로 작성해서 다시 실행하세요");
			}
			catch(WrongThreadException woe){  // 연산자를 잘못 작성했을 때 처리
				System.out.println("지원하지 않는 연산자 입니다 + , - , * ,/ 중에서 선택해서 다시 실행하세요."); // 
			}
			
			System.out.println(result);
			
			try {
				result = sc.calc(10, 0, "*");			
			}
			catch(NullOperatorException noe){  // 연산자가 null  일때 처리
				System.out.println("연산자가 비어있습니다. 연산자를 채워서 다시 실행하세요");
			}
			catch(DevideZeroException dze){  // 숫자가 0일때 처리
				System.out.println("0으로 나누려 했습니다. 숫자를 재대로 작성해서 다시 실행하세요");
			}
			catch(WrongThreadException woe){  // 연산자를 잘못 작성했을 때 처리
				System.out.println("지원하지 않는 연산자 입니다 + , - , * ,/ 중에서 선택해서 다시 실행하세요."); // 
			}
			System.out.println(result);
			
			try {
				result = sc.calc(9, 0, "/");			// 0으로는 나눌수가 없다 라는 코드를 넣던지 0을 1로 강제로 바꿔버리던지 선택
			}
			catch(NullOperatorException noe){  // 연산자가 null  일때 처리
				System.out.println("연산자가 비어있습니다. 연산자를 채워서 다시 실행하세요");
			}
			catch(DevideZeroException dze){  // 숫자가 0일때 처리
				System.out.println("0으로 나누려 했습니다. 숫자를 재대로 작성해서 다시 실행하세요");
			}
			catch(WrongThreadException woe){  // 연산자를 잘못 작성했을 때 처리
				System.out.println("지원하지 않는 연산자 입니다 + , - , * ,/ 중에서 선택해서 다시 실행하세요."); // 
			}
			
			System.out.println(result);
			
			try {
				result = sc.calc(10, 0, "%");			
			}
			catch(NullOperatorException noe){  // 연산자가 null  일때 처리
				System.out.println("연산자가 비어있습니다. 연산자를 채워서 다시 실행하세요");
			}
			catch(DevideZeroException dze){  // 숫자가 0일때 처리
				System.out.println("0으로 나누려 했습니다. 숫자를 재대로 작성해서 다시 실행하세요");
			}
			catch(WrongThreadException woe){  // 연산자를 잘못 작성했을 때 처리
				System.out.println("지원하지 않는 연산자 입니다 + , - , * ,/ 중에서 선택해서 다시 실행하세요."); // 
			}
			
			System.out.println(result);
			
			try {
				result = sc.calc(10, 0, null);			
			}
			catch(NullOperatorException noe){  // 연산자가 null  일때 처리
				System.out.println("연산자가 비어있습니다. 연산자를 채워서 다시 실행하세요");
			}
			catch(DevideZeroException dze){  // 숫자가 0일때 처리
				System.out.println("0으로 나누려 했습니다. 숫자를 재대로 작성해서 다시 실행하세요");
			}
			catch(WrongThreadException woe){  // 연산자를 잘못 작성했을 때 처리
				System.out.println("지원하지 않는 연산자 입니다 + , - , * ,/ 중에서 선택해서 다시 실행하세요."); // 
			}
			
			System.out.println(result);
			
		}
	
}
