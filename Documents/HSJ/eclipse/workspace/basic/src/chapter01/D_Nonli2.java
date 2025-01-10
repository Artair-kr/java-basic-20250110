package chapter01;

public class D_Nonli2 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		System.out.println(a);
		boolean booleanResult  = true && (a++ > b);
		// 데드 코드라서 뒤의 a++ > b 코드 자체를 읽지 않아 실행이 되지 않았다.
		System.out.println(a);
	}
}
