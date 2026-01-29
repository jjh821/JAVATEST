package com.ktdsuniversity.edu.implement;
// 컨트롤 + 1 을 삼성 커서에 올려두고 누르기 

/**Before
 * 
 * TV
 * SamsungSmartTV
 * 		samsungTV(TV + SamsungSmartTv)
 *	LgSmartTV
 * 			LGTV(TV + LgSmartTv)
 * 
 * 
 * After
 * TV
 * 		SamsungSmartTV
 * 			SamsungTv
 * 		LgSmartTV
 * 			LgTV
 * 
 */
public class SamsungTV implements SamsungSmartTV {
	@Override
	public void turnOn() {
		System.out.println("삼성 티비를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("삼성 티비를 끕니다.");
	}
	@Override
	public void changeCannel(int channelNumber) {
		System.out.println("삼성 티비의 채널을 바꿉니다." + channelNumber);
		
	}@Override
	public void changeVolumn(int volumn) {
		System.out.println("삼성 티비의 볼륨을 바꿉니다." + volumn);
		
	}
	@Override
	public void runNetflix() {
		System.out.println("삼성 티비의 넷플릭스를 실행합니다.");
		
	}
	@Override
	public void runMenu() {
		
		System.out.println("삼성 티비의 메뉴를 엽니다.");
	}
	@Override
	public void runCoupangPaly() {
		System.out.println("삼성 티비의 쿠팡 플레이를 실행합니다.");
		
	}
}
