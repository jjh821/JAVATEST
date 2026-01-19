package exam;

public class Q120829 {

	public static void main(String[] args) {
		int angle = 180;
		int num = 0;
		
		
		if (angle > 0 && angle < 90){
			num = 1;	
		}
		else if( angle == 90 ){
			num = 2 ;
		}
		else if( angle > 0 && angle < 180 ){
			num = 3 ;
		}
		else if( angle == 180 ){
			num = 4 ;
		}
		System.out.println(num);
	}

}
