package exam;

public class primenum {

	public static void main(String[] args) {
		int max = 100000; // 10만까지

		for (int i = 2; i <= max; i++) {
			boolean isPrime = true; // 일단 i는 소수라고 가정

			// 2부터 i의 바로 전 숫자까지 나누어본다
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false; // 한 번이라도 나누어떨어지면 소수가 아님!
					break; // 더 계산할 필요 없으니 안쪽 반복문 탈출
				}
			}

			// 소수라고 판명된 숫자만 출력
			if (isPrime) {
				System.out.println(i);
			}
		}
	}
}