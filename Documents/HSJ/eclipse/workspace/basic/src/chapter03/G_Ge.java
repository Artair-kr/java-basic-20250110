package chapter03;

import java.util.ArrayList;
import java.util.List;

// Test 1,2,3의 문제점
// 1. 코드 중복 발생 : 유지보수성을 및 개발 속도를 낮춘다.
// 2. 실사용의 불편 : 사용시 코드가 복잡해진다.
class Test1{ // 정수형태일때
	String subject;
	int score;
}
class Test2{ // 실수형태일때
	String subject;
	double score;
}
class Test3{ // 문자형태일때
	String subject;
	char score;
}
// Test4의 문제점
// 타입의 안전성을 낮춘다.
// Object -> 타입 -> 컴파일 언어로 쓰는 이유가 없어진다.

class Test4{
	String subject;
	Object score;
}
//제너릭 : 클래스나 메서드에서 사용할 데이터 타입을 외부에서 지정하는 방법
//재너릭 클래스 : 클래스 내부에 있는 데이터 타입을 컴파일 시에 결정하는 클래스
//class 클래스명<>{} 
class Test5<S>{ // 의미가 없을때는 T
	String subject;
	// SCORE score;
	S score; 
}

class SuperClass{}
class MyClass extends SuperClass{}
class SubClass extends MyClass{}

// T extends 클래스명 : 특정 클래스 혹은
// 큭정 클래스를 상속한 클래스만 제너릭으로 지정할 수 있도록 제한
class ExtendsClass<T extends MyClass>{
	T variable;
}
public class G_Ge {
		// 재너릭 메서드 : 해당 메서드의 매개변수의 타입이나 반환 타입을 컴파일시에 결정하고자 할 때 사용
		// [제어자...]<매개타입> 반환타입 메서드명(...){...}
		static <T> void genericMethod(List<T> arg) {
			for(T item: arg) {
					
			}
		}
			
	public static void main(String[] args) {
		/*
		List<Test4> tests = new ArrayList<>();
		Test4 test1 = new Test4();
		test1.subject = "국어";
		test1.score = "우수";
		tests.add(test1);
		
		Test4 test2 = new Test4();
		test2.subject = "수학";
		test2.score = 100;
		tests.add(test2);
		
		System.out.println(test1.score);
		System.out.println(test2.score);
		*/
		//for(Test4 test: tests) {}
		// ? score = test.score;
		// 문자를 바꿀수 없다는 오류가 발생한다.
		
		// Object 타입으로 지정하면 모든 타입을 받을 순 있지만
		// 사용시 타입을 지정함에 있어서 안정성이 떨어딘다.
		// int score = (int)tests.get(0).score;
			
		// 제너릭으로 지정하면 컴파일시 타입을 결정하여
		// 원하는 형태의 데이터 타입으로 사용할 수 있다.
		// 제너릭의 타입을 전달할 땐 반드시 참조셩 데이터 타입이여야 한다.
		Test5<Integer> instance1 = new Test5<>();
		// 이때 데이터 타입이 결정된다.
		// instance1.score = "우수";
		// Integer자리이기에 문자 입력 안됨
		instance1.score = 100; 
		
		// extends 키워드로 제한을 걸어둔 매개타입은
		// 해당 클래스 혹은 하위 클래스만 제너릭으로 사용할 수 있다.
		ExtendsClass<MyClass> instance2;
		ExtendsClass<SubClass> instance3;
		// 부모이상이기에 안된다.
		// ExtendsClass<SuperClass> instance4;
		// 아무런 관련이 없는것도 안된다.
		// ExtensdClass<String> instance5;
		
		
		Test5<String> instance6 = new Test5<>();
		instance6.score = "우수";
		wildcardMethod(instance6);
		
		Test5<Integer> instance7 = new Test5<>();
		instance7.score = 100;
		wildcardMethod(instance7);
		
		List<SuperClass> superList = new ArrayList<>();
		List<MyClass> myList = new ArrayList<>();
		List<SubClass> subList = new ArrayList<>();
		
		// ? extends MyClass로 제한이 걸렸기 때문에
		// MyClass 혹은 MyClass 하위 클래스만 전달 가능
		// extendsMethod(superList);
		extendsMethod(myList);
		extendsMethod(subList);
		
		superMethod(superList);
		superMethod(myList);
		// ? super Myclass로 제한이 걸렸기 때문에
		// MyClass 혹은 MyClass 상위 클래스만 전달 가능
		//superMethod(subList);
		
		// 메서드의 매개타입을 직접 지정하지 않고 매개변수의 타입을 따라간다.
		genericMethod(myList);
		
		
	}
	// ? : 제너릭의 와일드 카드로 모든 타입을 받을 수 있도록 한다.
	// 와일드 카드는 메서드의 매개변수 혹은 반환타입에 사용한다
	static void wildcardMethod(Test5<?> test) { 
		// static을 붙여야지 위에서 호출가능
		// 매개변수로 받아올때 무엇을 받아올지 아직 결정안함
		System.out.println(test.score);
	}
	// ? extends 클래스명 : 특정 클래스 혹은 특정 클래스를 상속받은 클래스만 타입으로 받도록 제한
	static void extendsMethod(List<? extends MyClass> list) {
		
	}
	// ? super 클래스명 : 특정 클래스 혹은 특정 클래스의 상위 클래스만 타입으로 받도록 제한
	static void superMethod(List<? super MyClass> list) {
	}
}
