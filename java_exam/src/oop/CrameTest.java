package oop;


public class CrameTest {

	public static void main(String[] args) {
		CrameGameMachine count = new CrameGameMachine();
	    count.dolls = 10;
	    count.insertCoin(); 
	    int num = count.doGame(); 
	    
	    System.out.println("이번 판 결과(뽑은 개수): " + num); 
	    System.out.println("남은 인형 갯수: " + count.dolls);
	    }
}