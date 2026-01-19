package exam;

public class ExamScoreabcd {
//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 
//C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
	
	public static void main(String[] args) {
		int examScore = 100;
		if(examScore >= 90 && examScore <= 100){
			System.out.println("A");
		}
		else if(examScore >= 80 && examScore <= 89) {
			System.out.println("B");
		}
		
		else if(examScore >= 70 && examScore <= 79) {
			System.out.println("C");
		}
		else if(examScore >= 60 && examScore <= 69) {
			System.out.println("D");
		}
		else if(examScore < 60) {
			System.out.println("F");
		}

	}

}
