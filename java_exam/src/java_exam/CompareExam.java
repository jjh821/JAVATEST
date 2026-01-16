package java_exam;

public class CompareExam {

	public static void main(String[] args) {
		//int age = 10;
		
		// age가 10대인지 확인
		// 10 >= age < 20
		
		//10대 가 맞다면 true 아니면 false를 출력
		//boolean teenager = 10 <= age &&  20 > age;
		//System.out.println(teenager);
		
		// age가 20대인지 확인
		// 20 >= age < 30
		
		//20대가 맞다면  true 아니면 false를 출력한다.
		
		// 가게에 방문한 고객의 나이
		//int customerAge = 15;
		// 고객의 지갑에 들어있는 돈
		//int customerWallet = 3000;

		// A 가게는 19세 이상의 고객만 방문 할  수  있다.
		// A 가게에서 판매하는 모든 제품의 가격은 1500원이다.
		// 구매할 수 있다면 true 아니라면 false를 출력한다.
		// 빠른연산을 고려.
		
		//boolean teencustomerAge = 19 <= customerAge && customerWallet >= 1500 ;
		//System.out.println(teencustomerAge);
		
		// B의 가게는 19세 이상의 고객만 방문할 수 있다
		// B가게에서 판매하는 모든 제품의 가격은 2000원 이다
		// B가게는 특별이벤트로 고객의 나이가 3의 배수이면 돈이 모자라도 구매가능
		// 고객은 가게 제품 구매가능?
		// 구매할수 있다면 true 아니면 false 
		// 빠른연산을 고려
		int customerAge = 13;
		int customerWallt = 1300; 
		
		boolean isAdult = 19 <= customerAge ;
		boolean isBuyableCustomer  = customerWallt >= 2000  || customerAge % 3 == 0 ;
		
		System.out.println(isAdult && isBuyableCustomer);
	}

}
