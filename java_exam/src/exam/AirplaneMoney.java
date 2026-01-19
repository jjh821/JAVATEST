package exam;

public class AirplaneMoney {

	public static void main(String[] args) {
		int money = 900_000;
		
		int father = 40 ;
		int mother = 36 ;
		int daughter = 20;
		
		int adultOnewayFlightFare = 300_000;
		int kidOnewayFlightFare = 120_000;
		
		int totalfare = 0;
		
		
		
		if (father >=19 ) {
			totalfare += adultOnewayFlightFare;	
			}
		else {
			totalfare += kidOnewayFlightFare;
		}
		if (mother >=19 ) {
			totalfare += adultOnewayFlightFare;	
			}
		else {
			totalfare += kidOnewayFlightFare;
		}
		if (daughter >=19 ) {
			totalfare += adultOnewayFlightFare;	
			}
		else {
			totalfare += kidOnewayFlightFare;
		}
		
		int adultcount = 0;
		int kidcount = 0;
		
		if(father >= 19){
			adultcount++;
		} else {
			kidcount++;
		}
		if(mother >= 19){
			adultcount++;
		} else {
			kidcount++;
		}
		if(daughter >= 19){
			adultcount++;
		} else {
			kidcount++;
		}
		
		totalfare = (adultcount * adultOnewayFlightFare) + (kidcount * kidOnewayFlightFare);
		
		
		
		if (money >= totalfare) {
		    System.out.println("결과: 여행 가능!");
		    System.out.println("필요 요금: " + totalfare + "원");
		    System.out.println("가진 돈: " + money + "원");
		    System.out.println("여행가자!");
		} else {
		    System.out.println("결과: 여행 불가...");
		    System.out.println("필요 요금: " + totalfare + "원");
		    System.out.println("가진 돈: " + money + "원");
		    System.out.println("모자란 돈: " + (totalfare - money) + "원");
		    System.out.println("다음에가자");
		}
	}

}
