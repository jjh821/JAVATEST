package exam;

import java.util.Scanner;

public class Q2739 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int i = 1;
		int value = 0;
		System.out.print("숫자를 입력하세요. ");
		value = keyboard.nextInt();
		
		while (i <= 9) {
			System.out.println( value + "*"+ i + "=" +(value * i));
			i++;
			}
			keyboard.close();
	}
	
		

	}



// print  = a를 출력해라
// println = a를 출력하고 한줄 띄어라