package java_exam;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//int inputNumber = 0;
		//
		// 사용자가 입력하는 값이 100 이하일 동안만  {..} 실행해라
		//while ( inputNumber <= 100 ) {
			
			
			// 사용자로 부터 정수 입력받음
		//	inputNumber = keyboard.nextInt();
		//	System.out.println(inputNumber);
		//}
		
		//System.out.println("application을 종료 합니다");
		
		double randomNumber = Math.random();
		int answer = (int) (randomNumber * 100);
		int value = 0;
		
		while(true){
			System.out.print("숫자를 입력하세요. ");
			value = keyboard.nextInt();
			if ( answer == value) {
				System.out.print("정답입니다! ");
				break; // 정답일 경우 무한 반복 종료
			}
			else if (answer > value ) {
				System.out.println("up!");
			}
			else {
				System.out.println("Down!");
			}
		}
		

	}

}
