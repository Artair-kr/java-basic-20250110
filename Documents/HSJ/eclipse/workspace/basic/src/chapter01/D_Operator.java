package chapter01;

public class D_Operator {
	public static void main(String[] args) {
		
		int a = 15, b = 2;
		double c = 15.0, d = 7.0;
		int intResult = 0;
		double doubleResult = 0;
		
		// 산술 연산자 : 사칙연산을 수행하는 연산자
		// 더하기 : +
		// 좌항에 우항을 더한 값을 반환
		intResult = a + b;
		doubleResult = c + d;
		System.out.println(intResult);
		System.out.println(doubleResult);
		// 실수가 정수로 자동으로 형 변환은 불가능하므로 강제 형 변환을 해줘야 한다.
		intResult = (int) (a + c);
		System.out.println(intResult);
		intResult = (a + (int)c);
		System.out.println(intResult);
		// 정수에서 실수로는 자동 형 변환이 가능하다.
		doubleResult = a + d;
		System.out.println(doubleResult);
		
		// 빼기 : - 
		// 좌항에 우항을 뺀 값을 반환
		intResult = a - b;
		System.out.println(intResult);
		doubleResult = c - d;
		System.out.println(doubleResult);
		System.out.println((int)doubleResult);
		
		intResult = (int)(a - c);
		System.out.println(intResult);
		intResult = (a - (int)c);
		System.out.println(intResult);
		
		// 곱하기 : *
		// 좌항에 우항을 곱한 결과를 반환
		// 둘중 하나라도 실수가 있다면 결과값은 실수로 출력된다.
		intResult = a * b;
		System.out.println(intResult);
		doubleResult = a * c;
		System.out.println(doubleResult);
		
		// 나누기 : /
		// 좌항에 우항을 나눈 결과를 반환
		// 몫의 값을 출력한다.
		// 정수와 정수를 연산 하였지만 doubleResult는 실수이기에 7.0이 나온다.
		// 정수와 정수를 나누면 실수부가 소멸한다.
		doubleResult = a / b;
		System.out.println(doubleResult);
		intResult = a / b;
		System.out.println(intResult);
		// 둘중 하나만이라도 실수라면 7.5로 실수부가 소멸하지 않는다.
		// doubleResult = (double)(a / b); 
		// 의 경우 이미 a / b는 정수 계산을 완료해서 실수부가 나오지않는다.
		doubleResult = (double)(a / b);
		System.out.println(doubleResult);
		doubleResult = a / (double)b;
		System.out.println(doubleResult);
		doubleResult = c / b;
		System.out.println(doubleResult);
		
		// 나머지 : %
		// 좌항에 우항을 나눈 나머지를 반환
		intResult = a % b;
		System.out.println(intResult);
		// 둘중 하나라도 실수라면 실수형으로 출력된다.
		doubleResult = a % d;
		System.out.println(doubleResult);
		doubleResult = c % d;
		System.out.println(doubleResult);
		
		// 증감 연산자
		// 피연산자 값을 1 증가 혹은 감소
		// 단항 연산자(항이 1개이다.)이다.
		// 피연산자는 반드시 변수여야한다. (자기 자신의 값을 바꾸기 때문이다.)
		// 증가 연산자 : ++
		// 감소 연산자 : --
		int number = 7;
		System.out.println(number);
		number++;
		System.out.println(number);
		number--;
		System.out.println(number);
		// 선행 증가
		// 선행 증감 연산은 증감 연산을 먼저 수행하고 다른 연산을 진행한다.
		// number 값은 7인 상태이다.
		System.out.println(10 + ++number);
		// number값 7로 복원
		number--;
		// 후행 증가
		// 후행 증감 연산은 다른 연산을 먼저 진행하고 증감 연산을 수행한다.
		// 연산을 먼저 진행하고 값을 증가한다.
		System.out.println(10 + number++);
		
		// 사용 불가한 final 상수 증감식
		// final int NUMBER = 7;
		// NUMBER++;

	}
}
