package exam;

/*/1부터 피라미터로 전달된 수까지의 합을 구한다.
1부터 피라미터로 전달된 숫자중 소수만 출력한다
피라미터로 전달된 숫자 두개중 가장 큰수 하나만 출력한다
 피라미터로 전달된 나이가 성인인지 미성년인지 구분하여 출력한다
*/ 
/*
 * 랜덤한 숫자를 생성하고 아래 규칙에 따른 결과를 반환한다.   
- 3의 배수이면 "Fizz"    
- 5의 배수이면 "Buzz"    
- 3과 5의 공배수이면 "FizzBuzz"    
- 그 외의 숫자이면 숫자 자체를 문자로 변경하여 반환한다.    
- getFizzBuzz(9) => "Fizz"    
- getFizzBuzz(10) => "Buzz"    
- getFizzBuzz(15) => "FizzBuzz"    
- getFizzBuzz(7) => "7"

6. 서로 다른 숫자 7개를 배열에 할당하여 반환한다.
- getUniqueNumbers() => [3, 7, 11, 23, 29, 35, 42] (숫자는 예시일 뿐이며, 실행할 때마다 달라짐)
- 단, 배열에 할당된 숫자는 중복되지 않아야 한다.

7. 정수 파라미터 두 개를 전달받아 곱한 결과가 짝수인지 홀수인지 반환한다.
- getEvenOdd(4, 5) => "짝수"
- getEvenOdd(3, 5) => "홀수"

8. 전달된 정수 파라미터 5개의 합을 구해 반환한다.
- getSumOfFive(1, 2, 3, 4, 5) => 15

9. 합과 점수의 개수를 전달하여 평균을 구해 반환한다. (소수점 둘째 자리까지)
- getAverage(150, 3) => 50.00

10. 평균 점수를 파라미터로 전달하여 학점을 반환한다.
- getGrade(95) => "A"
- getGrade(85) => "B"
- getGrade(75) => "C"
- getGrade(65) => "D"
- getGrade(55) => "F"
 */
public class Onepuls {
	public static String getGrade(int num){
		String resultg= "";
		
		if(num >= 95) {
			resultg = "A";
		}
		else if (num <= 85 && num > 75 ){
			resultg = "B";
		}
		else if (num <= 75 && num > 65){
			resultg = "C";
		}
		else if (num <= 65 && num > 55){
			resultg = "D";
		}
		else {
			resultg = "F";
		}
		return resultg;
	
	}
	
	public static double getAverage(int num, int num2) {
		double ave = (double) num / num2;
		return ave;
		
	}
	
	
	public static int getSumOFfive(int num,int num2,int num3,int num4,int num5) {
		return num + num2 + num3+ num4 + num5;
	}
	
	
	public static String getEvenOdd(int num, int num2) {  // 두수 곱 짝수 홀수
		String resulta= "";
		
		if((num * num2) % 2 == 0) {
			resulta = "짝수";
		}
		else {
			resulta = "홀수";
		}
		return resulta;
	}
	
	
	/*
	public static int getUniqueNumbers() {
		
	}
	*/
	
	
	public static String getFizzBuzz( int randomnumber) {
		String result= "";
			if(randomnumber % 15 == 0) {
				result="Fizzbuzz";
			}
			else if(randomnumber % 5 == 0) {
				result = "Buzz";
			}
			else if(randomnumber % 3== 0 ) {
				result= "Fizz";
			}
			else {
				result= randomnumber +"";
			}
		return result;
		
	}
	
	
	
	
	
	public static String ageNum (int num) { // 성년 미성년 구분
		if (num >=20) {
			return ("성인");
		}
		else  {
			return ("미성년");
		}
		
		
	}
	
	
	public static int comparisonNum (int num ,int num2) { //두 수 입력 받아 큰 수 호출
		if (num > num2) {
			System.out.println(num);
		}
		else if (num < num2) {
			System.out.println(num2);
		}
		else {
			System.out.println("중복된 수 입니다");
		}
		return 0;
		
	}
	
	
	public static int printPrime (int num) {  //소수 출력 메소드
		for (int i = 2; i < num; i++) {
			if(	checkPrime(i) == 1){
				System.out.println(i + " ");
			}
		}
		return 1;
		
	}
	public static int checkPrime (int num) {  //소수가 아닌 숫자를 걸러내는 메소드
			
		if (num < 2) {
				return 0;
			}
			
			for (int i = 2; i <= Math.sqrt(num); i++ ) {
				if (num % i == 0) {
					return 0;
				}
			
			}
			return 1;
	}
	
	public static int plus(int num  ) {
		int plusnum = 0;
			while (num >= 1) {	
			plusnum += num;
			num--;
		
		}
		return (plusnum);
	}
	
	public static void main(String[] args) {
		int printsum = plus(10);
		System.out.println(printsum);
		
		printPrime(60);
		
		comparisonNum(19,27);
		
		System.out.println(ageNum(17));
		
		System.out.println(getFizzBuzz(7));
		
		System.out.println(getEvenOdd(5 ,5));
		
		System.out.println(getGrade(77)); 
		//System.out.println(getUniqueNumbers());
	}
	
}
