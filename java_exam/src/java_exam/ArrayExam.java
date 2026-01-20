package java_exam;

public class ArrayExam {

	public static void main(String[] args) {
		/*
		int[] scoreArray = new int[7];  //java 지원 공식 문법
		// 0 | 0 | 0 | 0 |0 | 0 | 0 |
		System.out.println(scoreArray); // ????
		
		int score = 60 ;
		System.out.println(score);
		
//		int scoreArray2[] = new int[7]; // C 언어 스타일
		*/
		int[] scoreArray = new int[7];
		
		for (int i = 0 ; i < scoreArray.length; i++ ) {	
			scoreArray[i] = (int) (Math.random() * 45 + 1);	
		}
		
		
		
		
		scoreArray[0] = (int) (Math.random() * 45 + 1) ;
		scoreArray[1] = (int) (Math.random() * 45 + 1) ;
		scoreArray[2] = (int) (Math.random() * 45 + 1) ;
		scoreArray[3] = (int) (Math.random() * 45 + 1) ;
		scoreArray[4] = (int) (Math.random() * 45 + 1) ;
		scoreArray[5] = (int) (Math.random() * 45 + 1) ;
		scoreArray[6] = (int) (Math.random() * 45 + 1) ;
		
		
		
		
		for (int i = 0 ; i < scoreArray.length; i++ ) {
		System.out.println(scoreArray[i]);
		
		}
		
		
		System.out.println();

	}

}
