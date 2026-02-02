package com.ktdsuniversity.edu.generics.collection.list.airplanelist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * 비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.

비행기 편의 이름을 입력하세요:  0001

 

"0001" 편은 존재하지 않습니다.

다른 비행기 편의 이름을 입력하세요: 0002

 

"0002" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)

1: O, 2: O, 3: O, 4: O, 5: X, 6: O, 7: O, 8: O, 9: O

 

좌석 예약을 하려면 번호를 입력하세요: 5

"5"번 좌석은 이미 예약된 좌석입니다. 다른 좌석을 입력하세요: 3

"3"번 좌석을 예약하시겠습니까? (y/N): y

"3"번 좌석이 예약되었습니다.

 

"0002" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)

1: O, 2: O, 3: X, 4: O, 5: X, 6: O, 7: O, 8: O, 9: O

 

비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.

비행기 편의 이름을 입력하세요:  0003

"0003" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)

1: X, 2: X, 3: X, 4: X, 5: X, 6: X, 7: X, 8: X, 9: X

 

예약 가능한 좌석이 없습니다. 다른 비행기 편을 이용해 주세요.

비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.


 */
public class Flight {
	
	
	
	/**
	 * 인풋아웃풋이랑은 관련없고 아까 수업했던 School의 로직을 짜볼것
	 * 
	 * 
	 * 순서가
		
	 * 항공편 입력(맞을때까지 반복)
	 * 항공편 확인
	 * 비행기 좌석 현황 확인
	 * 예약가능한 좌석이 없으면  메시지 출력후 다시 항공편 입력으로 복귀
	 * 예약 좌석 번호 입력
	 * 예약 성공 시 리스트에 추가되고 해당좌석 x
	 * 
	 * 
	 * 항공편 입력
	 * 		항공편 번호가 없으면 다시 항공편 번호 입력칸으로 돌아간다
	 * 		항공편 번호가 맞다면 좌석 현황과 함께
	 * 		좌석 번호 입력으로 넘어간다
	 * 
	 * 좌석 확인
	 * 		좌석번호를 입력받는다(맞을때까지 반복)
	 * 		예약하려는 좌석의 문자열이 X면 예약이 불가능하다고 하고 
	 * 		equals로 비교후에 변경   리스트 이름.set(O,x) 을 활용
	 * 		"좌석확인"으로 돌아간다
	 * 		예약하려는 좌석이 예약이 가능한 상태면 해당좌석에 X를 추가하고
	 * 		예약완료 메시지를 보내준다
	 * 
	 * 	
	 * 
	 * 		
	 * 	
	 * 
	 * 
	 */
	
	public static void Filght(
			Map<Integer, List<AirplaneSeat>> flight, int airplaneNum) {
			List<AirplaneSeat> aseats = flight.get(airplaneNum);
			
			for() {
				if(){
					System.out.println("비행기 편을 입력하면 해당 좌석내역을 볼 수 있습니다.");
				}
			}
			
			
			if(aseats == null){
				Systme.out.println("");
			}else if(aseats != null) {
				for (AirplaneSeat aseat : aseats) {
					System.out.println( aseat + "번 좌석이 예약 되었습니다.");
				}
				
			}
			
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int flight = sc.nextInt();
		Map<Integer, List<AirplaneSeat>> flight = new  HashMap<>();
	}
	
}
