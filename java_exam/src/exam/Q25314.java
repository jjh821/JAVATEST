package exam;

public class Q25314 {

	public static void main(String[] args) {
		String type = "" ;
		int n = 20;
		while  (n >= 4) {
			type += "long ";
			n -= 4;
		}
		
		type += "int";
		System.out.println(type);	
		
	}

}
