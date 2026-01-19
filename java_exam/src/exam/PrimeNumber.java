package exam;

public class PrimeNumber {
//2부터 10만까지의 수중 소수(약수가 1과 자신뿐 인 수)만 나오는 출력코드
	public static void main(String[] args) {
		
		for (int i = 2; i < 100001; i++ )  {
			if(i % 1 == 0  &&  i % i == i) {
				System.out.println(i);
			}
			
		
		}
	}

}
