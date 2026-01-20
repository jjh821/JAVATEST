package exam;

public class primenum {

	public static void main(String[] args) {

		int max = 100000;



		for (int i = 2; i <= max; i++) {
			boolean isPrime = true; 



			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false; 
					break; 
				}
			}



			

			if (isPrime) {
				System.out.println(i);
			}
		}
	}
}
