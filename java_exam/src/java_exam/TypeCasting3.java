package java_exam;

public class TypeCasting3 {

	public static void main(String[] args) {
		// 29.37 을 29.4로 올림 처리하기
				double dnum = 29.37;
				double dnum2 = dnum * 10;
				System.out.println(dnum2); // 293.7
				dnum2 = Math.round(dnum2);
				System.out.println(dnum2); // 294.0
				double dnum3 = dnum2 / 10;
				System.out.println(dnum3); // 29.4


	}

}
