package chapter01;

public class D_Deip {
	public static void main(String[] args) {
		// 대입 연산자 : 좌항에 우항을 할당한다.
		
		// 일반 대입 연산자 : =
		// 좌항에 우항의 연산 결과를 할당한다.
		// 좌항에 일반 변수와 상수형 변수 모두 올 수 있다.
		// 단, 상수형 변수에는 초기화 시에만 사용 가능하다.
		int number = 10 + 5;
		System.out.println("number : " + number);
		
		// 복합 대입 연산자
		// 좌항에 우항의 연산 결과를 할당
		// 좌항은 반드시 초기화가 이루어진 일반 변수이어야 한다.
		
		// number = 15
		// 15 + 3 연산이다.
		number += 3;
		System.out.println("number : " + number);
		// number = 18
		// 18 - 3 연산이다.
		number -= 3;
		System.out.println("number : " + number);
		// number = 15
		// 15 * 3 연산이다.
		number *= 3;
		System.out.println("number : " + number);
		// number = 45
		// 45 / 3 연산이다.
		number /= 3;
		System.out.println("number : " + number);
		// number = 15
		// 15 / 2 연산이다.
		number %= 2;
		System.out.println("number : " + number);
		
		// 불가능 하다.
		// 초기화를 하지않아 초기값이 없기 때문이다.
		// int number2;
		// number2 += 1;
		// final int NUMBER2 = 10;
		// 불가능 하다
		// NUMBER2 += 1;
		
	}
}
