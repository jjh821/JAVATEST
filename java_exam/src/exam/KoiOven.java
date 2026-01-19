package exam;

public class KoiOven {

	public static void main(String[] args) {
		int A = 13;
		int B = 58 ;
		int C = 25 ;
		
		B = B + C;
			if ( B >= 60) {
				A = A + (B / 60);
				B = B % 60;			
			}
			if ( A >= 24) {
				A = A % 24;
			}
		
			
			System.out.println(A + " " + B);

	}

}
