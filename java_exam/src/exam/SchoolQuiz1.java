package exam;

public class SchoolQuiz1 {

	public static void main(String[] args) {
		int num1 = 27;
		int num2 = 19;

		int total = num1 * num2;
		
		System.out.println(total);
		
		
		int age = 40;
		int nowYear = 2022;
		
		int bornYear = (nowYear - age) + 1  ; 
		
		System.out.println("출생년도는 " + bornYear + " 년 입니다");
		
		
		int num3 = 2;
		int num4 = 3;
		
		int result = num3 - num4 ;
		
		System.out.println(num3 + "-" + num4 + "의 값은 " + result + " 입니다");
		
		
		int num5 = 3;
		int num6 = 2;
		
		int total2 = num5 % num6 ;
		
		System.out.println("나머지 값=" + total2);
		
		
		int num7 = 10; 
		int num8 = 5;
		
		int total3 = num7 / num8 ;
		
		System.out.println("몫=" + total3);
		
	}
	
}
