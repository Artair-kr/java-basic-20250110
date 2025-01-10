package chapter02;

// 오버로딩(Overloading) : 같은 클래스 내부에서 같은 이름의 메서드를 여러개 작성할
//                       수 있도록 하는 방법
// 오버로딩의 조건 
// 1. 메서드의 이름을 중복해서 작성하고, 매개변수타입의 조합(개수, 순서)을 다르게 작성
// 2. 매서드의 반환타입과 매개변수의 이름은 영향을 주지 않는다. 
class NewMath{
	
	int add(int a, int b) {
		return a + b;
	}
	// 문제점
	// 1 메서드의 이름이 불규칙적이다.
	// 2 사용자의 불편함을 초래한다. (뭘 성택해야 할지 모른다.)
	/*
	double add2(double a, double b) {
		return a + b;
	}
	*/
	// 오버로딩 : 매개변수 타입의 조합이 다를 때
	double add(double a, double b) {
		return a + b;
	}
	// 오버로딩 : 매개변수의 개수가 다를 때
	int add(int a, int b, int c) {
		return a + b + c;
	}
	/*
	// Duplicate method ...
	// 반환 타입만 다를 땐 오버로딩 불가능
	double add(int a, int b) {
		return a + b;
	}
	// Duplicate method ...
	// 매개변수의 이름이 다를 땐 오버로딩 불가능
	int add(int x, int y) {
		return x + y;
	}
	// 반환타입, 매개변수 개수, 순서 중복 오버로딩 불가능
	// 그 중 하나는 달라야 한다.
	int add(int a,int b) {
		return a + b;
	}
	*/
}
public class C_Overloading {

	public static void main(String[] args) {
		
		NewMath newMath = new NewMath();
		// newMath.add2(); // add1,2,3처럼 이름을 바꿔도 되지만 
		// 사용자가 사용하기 힘들기 때문에 자동적으로 변경될수 있도록 한다.
		// System.out.println(newMath.add("0", "0"));
		// 지정된 타입으로만 작성해야 한다. String은 작성하지 않아 오버로딩 불가능
		System.out.println(newMath.add(1, 2)); // int a, b 자동 변경
		System.out.println(newMath.add(1.0, 2.0)); // double a, b
		System.out.println(newMath.add(1, 2, 3)); // int a, b, c
		// 사용되는 매개변수 타입과 개수에 맞게 자동적으로 변경된다.	
	}
}
