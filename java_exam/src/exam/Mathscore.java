package exam;

public class Mathscore {

	public static void main(String[] args) {
		int korScore = 95;
		int engScore = 98;
		int mathScore = 96;
		int progScore = 97;
		
		
		int sum = korScore + engScore + mathScore + progScore; //모든 과목의 합
		int average = sum / 4;  // 평균 점수
		
		
		
		
		if( average >= 95 ) {
			System.out.println("총점: " + sum + " 평균 점수:" + average + " A+학점 입니다");
			
		}
		else if (average >=90 ) {
			System.out.println("총점: " + sum + " 평균 점수:" + average + " A학점 입니다");
						
		}
		else if (average >=85 ) {
			System.out.println("총점: " + sum + " 평균 점수:" + average + " B+학점 입니다");
						
		}
		else if (average >=80 ) {
			System.out.println("총점: " + sum + " 평균 점수:" + average + " B학점 입니다");
						
		}
		else if (average >=70 ) {
			System.out.println("총점: " + sum + " 평균 점수:" + average + " C학점 입니다");
						
		}
		else if (average <=70 ) {
			System.out.println("총점: " + sum + " 평균 점수:" + average + " F학점 입니다");
						
		}		
	}
	

}
