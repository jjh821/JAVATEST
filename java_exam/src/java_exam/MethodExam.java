package java_exam;

public class MethodExam {
	public static int computeAdd(int  number1, int number2) {
		int computeResult = number1 + number2;
		return computeResult;
	}	
	
	public static void printMyName(String name) {
		System.out.println("제 이름은  " + name + "입니다");
		
		
		if (name.length() < 3) {
			return;
		}
		
		System.out.println("제 이름은  " + name.length() + "글자 입니다");			
	}
	
	//프로그램이 실행 될 수 있는 메소드를 생성한다.
	public static void main(String [] args) {
		
		
		int resultAdd = computeAdd(19,21);
		System.out.println(resultAdd);
	}

}
