package chapter01;

public class D_Biguo {
	public static void main(String[] args) {
		
		// 비교 연산자 : 좌항과 우항을 비교하여 그 결과를 논리 값으로 반황하여 사용한다.
		boolean booleanResult = true;
		
		// 같다, 다르다 연산자
		// a : 15, b : 2, c : 15.0, d : 7.0;
		int a = 15, b = 2;
		double c = 15.0, d = 7.0;
		int intResult = 0;
		double doubleResult = 0;
		
		// == : 좌항이 우항과 같으면 true, 다르면 false
		booleanResult = a == b;
		System.out.println(booleanResult);
		// 정수와 실수를 비교할때 둘다 실수로 바꾸어 비교하게 된다.
		// true라는 결과 값이 출력된다.
		booleanResult = a == c;
		System.out.println(booleanResult);
		// != : 좌항이 우항과 다르면 true, 다르면 false
		booleanResult = a != b;
		System.out.println(booleanResult);
		booleanResult = a != c;
		System.out.println(booleanResult);
		
		// 작다, 작거나 같다 연산자
		// < : 좌항이 우항보다 작으면 true, 크거나 같으면 false
		// <= : 좌항이 우항보다 작으면 같으면 true, 크면 false
		booleanResult = a < c;
		System.out.println(booleanResult);
		booleanResult = a <= c;
		System.out.println(booleanResult);
		
		// 크다, 크거나 같다 연산자
		// > : 좌항이 우항보다 크면 true, 작거나 같으면 false
		// >= : 좌항이 우항보다 크거나 같으면 true, 작으면 false
		booleanResult = d > b;
		System.out.println(booleanResult);
		booleanResult = d >= b;
		System.out.println(booleanResult);
	}
}
