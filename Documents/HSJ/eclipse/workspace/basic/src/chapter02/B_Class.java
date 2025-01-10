package chapter02;

import java.lang.reflect.Method;
import java.util.concurrent.SubmissionPublisher;
class ExampleClass1 {
	
	//메서드(기능) : 객체가 가질수 있는 행동이나 작업
	// [접근제어자] 반환타입 메서드명 (매개변수타입 매개변수명. ...) -> 메서드 선언부
	// {메서드의 기능 구현} -> 메서드 구현부
	static void method1 () {
		System.out.println("메서드");
		// return : 메서드의 결과를 반환하는 역할
		// 일반적인 메서드는 반드시 제일 마지막에 return이 필수
		// 메서드 중간에서 조건문 등을 활용하여 강제 메서드 종료에도 사용된다.
		return;
		}
}
public class B_Class {
	// 함수 : 특정한 기능에 대한 정의
	// 반환타입 함수명(매개변수타입 매개변수명, ...){ 함수의 기능 }
	static int fx1(int x) {
		int y = x * x + 2 * x + 1;
		// return : 함수를 종료하면서 함수 결과를 반환하는 역할
		// 함수에서 반드시 return 작업이 수행되어야 한다.
		// 단, void 반환타입 일때는 return이 필수는 아니다.
		// void : 타입 없음
		// return : 호출부로 되돌려주다, 반환하다
		return y;
	}
	// 함수의 목적
	// 1. 기능을 미리 정의해 두고, 사용할때 호출하여 사용할 수 있도록 한다.
	// (코드 중복 제거, 유지 보수성 향상, 실제 구현 내용을 알 필요 없다.)
	// 예를들어 println의 구현 내용은 알 필요는 없고, 사용만 하면 된다.
	// (중복되는 코드에 사용)
	
	// 2. 기능에 이름을 부여하여 사용할 수 있도록 한다.
	static void printBMI() {
		double x = (183 * 183); // bmi 계산을 한번만 쓸 것
		double y = 84 / x;
		System.out.println("bmi : " + y);
	}
	public static void main(String[] args) {
		
		// 매개변수라는 이름으로 x의 값을 요구하고 있다.
		// 아래 fx1()안은 x의 값을 넣는다.
		// 호출부
		System.out.println(fx1(10));
		// System.out.println(10 * 10 + 2 * 10 + 1);을 대신하여 사용
		// 여러번 작성하기 귀찮고, 실수가 발생 할 수 있다.
		// 유지 보수성이 떨어진다. 함수만 바꾸면 함수 계산을 이용한 부분이 다 바뀐다.
	
		System.out.println(fx1(4));
		
		// 기능에 이름을 부여하여 사용할 수 있게 하였다. 
		// printBMI() 라는 이름에 기능을 부여하였다.
		printBMI();
		// System.out.println(printBMI()); // void 이기 때문에 불가능
		
	}
}
