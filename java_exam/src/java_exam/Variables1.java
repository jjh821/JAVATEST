package java_exam;

public class Variables1 {

	public static void main(String[] args) {
		// 중요한 타입( int, long,  float, double, boolean)
		// 나이가 몇살인지 구해보는 나이 계산기를 만들어보자
		// 현재 연도 - 나의 생년
		System.out.println(2026 - 1999 + 1);
		
		
		//  Var Naming Convention
		//1. 첫 번째 단어의 첫 번째 글자는 소문자로 작성
		//2. 두 번째 단어 이후의 단어의 첫번째 글자만 대문자로 작성 (Camel case)
		//3. 사용 가능한 특수기호 ( _ ) <-- 권장하지 않음
		{
			int nowYear = 2026;
			int myBirthYear = 1999;
			int myAge = nowYear - myBirthYear + 1;
			
			System.out.println(myAge);
		}
		final long price = 1000;
		long buildingPrice = 10_000_000_000L;
		
		float ratio = 5.111F;
		
		double dobuleRatio = 312123.12321321313214D;
		
		int numBer = (int) 1L;
		
		long num = Integer.MAX_VALUE;
		num = num + 1;
		System.out.println(num);
		
		byte bNumber = 127;
		//bNumber = bNumber + (byte) 1;
		bNumber = (byte) (bNumber + 1);
		
		System.out.println(10L + 3.5f);
		
		System.out.println(10 / 3f);
		
		System.out.println("계산 끝났습니다.");
		
	
	}

}
