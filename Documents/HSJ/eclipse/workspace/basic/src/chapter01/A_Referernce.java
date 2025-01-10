package chapter01;

public class A_Referernce {
	public static void main(String[] args) {
	// 참조형 데이터 타입
	// 주소를 가지는 변수의 데이터 타입
	// null을 가질 수 있다. (null : 아무것도 지정되지 않은 상태)
	// 배열, 클래스, 인터페이스, 열거형이 참조형 데이터 타입에 속한다.
	String string1 = null;
	System.out.println(string1);

	char c = 'A';
	char c1 = 65; // 아스키값 'A'
	char c2 = '\u0041'; // 유니코드값 'A'
	System.out.println(c);
	System.out.println(c1);
	System.out.println(c2);
	}
}
