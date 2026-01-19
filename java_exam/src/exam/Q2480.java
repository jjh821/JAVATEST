package exam;


public class Q2480 {

	public static void main(String[] args) {
		int randomdice1= 6;
		int randomdice2 = 2;
		int randomdice3 = 5;
		
		int total = 0;
		
		
		if(randomdice1 == randomdice2 && randomdice2 == randomdice3 && randomdice3 == randomdice1) {
			total = 10_000 +randomdice1 * 1000;
		}
		else if(randomdice1 == randomdice2 || randomdice1 != randomdice3) {
			total = 1000 + randomdice1 * 100;
		}
		else if(randomdice2 == randomdice3 || randomdice2 != randomdice1) {
			total = 1000 + randomdice2 * 100;
		}
		else if(randomdice3 == randomdice1 || randomdice3 != randomdice2) {
			total = 1000 + randomdice3 * 100;
		}
		else {
		int max = randomdice1;
		if(max < randomdice2 ) {
			max = randomdice2;
		if(max < randomdice3 ) 
			max = randomdice3;
			
			total = max * 100;
		}
		
	}
		System.out.println(total);
	}
}


