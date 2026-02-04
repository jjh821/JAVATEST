package com.ktdsuniversity.edu.constants;


public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator(40, 20);
		System.out.println(calc.compute(Calculator.ADD));
		System.out.println(calc.compute(Calculator.SUB));
		System.out.println(calc.compute(Calculator.MUL));
		System.out.println(calc.compute(Calculator.DIV));
		
		
		
		
		System.out.println(calc.compute2(Operator.ADD));  // 값이 없는 상수
		System.out.println(calc.compute2(Operator.SUB));
		System.out.println(calc.compute2(Operator.MUL));
		System.out.println(calc.compute2(Operator.DIV));
		
		
		
		
		
	}
}
