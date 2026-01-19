package exam;




public class Q120830 {

	public static void main(String[] args) {
		int meet = 12000;
		int drink = 2000;
		
		int n = 10;
		int k = 3 ;
		
		int subdrink = 0;
		
		if (n >=10 ){
			subdrink = n / 10  ;
		}
		
		System.out.println((n * meet) + (k - subdrink) * drink);
		}

}
