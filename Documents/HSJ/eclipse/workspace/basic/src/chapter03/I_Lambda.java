package chapter03;

import java.lang.classfile.MethodModel;

// 함수형 인터페이스 : 추상메서드가 하나만 존재하는 인터페이스
interface TriangleArea{
	double triangleArea(double bottom, double heigth);
}

public class I_Lambda {
	
	// 람다식 : Java에서 함수형 프로그래밍을 지원하기위한 함수 표현식
	// 메서드를 선언해서 사용하는 것이 아닌 익명의 일회성 함수를 사용하는 방법
	
	// 일반적인 메서드 선언
	// 한번사용할 목적의 함수라도 반드시 선언해서 사용해야하는 불편함이 있다.
	// 변수에 할당하여 사용할 수 없다.
	/*
	double triangleArea(double bottom, double height) {
		return bottom * height / 2;
	}
	*/
	public static void main(String[] args) {
		/*
		// 람다식 사용 방법
		// 반환타입까지 모두 없앤후 (,)를 사용한다.
		// ( 매개변수, ... ) -> { 구현부 }
		// 람다식에서는 반환타입을 지정하지 않는다.
		// 람다식을 사용할 땐 반환타입을 컴파일러가 추론한다.
		(double bottom, double height) -> { return bottom * height / 2; }
		
		// 람다식에서는 매개변수의 타입도 생략 가능
		(bottom,heigt) -> {
			return bottom * height / 2;
		}
		
		// 만약에 람다식의 구현부가 표현식(단순 반환 코드 한줄)만 존재할 땐 중 괄호를 생략할 수 있다.
		(bottom, height) -> bottom * height / 2;
		*/
		// 람다식은 변수에 할당할 수 있다.
		// 리터럴처럼 활용 가능
		// 해당 변수의 데이터 타입은 자바의 함수형 인터페이스여야 합니다.
		// 리터럴 : 변수에 직접 할당되는 고정된 값을 의미합니다. 
		// 자바에서는 리터럴을 사용하여 숫자, 문자, 문자열 등의 값을 표현할 수 있습니다. 
		// 리터럴은 변수의 값을 초기화할 때 직접적으로 사용되는 상수입니다. 
		// 자바에서 다양한 종류의 리터럴을 사용하여 데이터를 표현할 수 있습니다.
		TriangleArea lambda = (bottom, height) -> bottom * height / 2;
		
		// 매개변수로 람다식 전달
		// 특정 메서드의 기능(동작)을 호출부에서 결정할 수 있다.
		method((a,b) -> a + b); // lambda식 대신 a + b
		method(lambda); // lambda식 실행
	}
	
	static void method(TriangleArea lambda) {
		double result = lambda.triangleArea(10, 5);
		System.out.println(result);
	}
}
