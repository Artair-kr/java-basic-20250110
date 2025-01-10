package chapter02_sub;

// import chapter02.*;
// chapter02 package에 선언된 AccessModifierSub2 클래스
// 사용하기 위해 import
import chapter02.F_AccessModifier;

// public으로 지정되어 있지 않은 클래스는 import가 불가능하다.
// import chapter02.AccessModiferSub1;

// 다른 패키지 상속
public class AccessModifierSub2 extends F_AccessModifier{
	
	void method() {
		// 현재 위치 : 다른 패키지의 상속받은 하위 클래스
		// public, protected 접근 제어자는 접근 가능
		super.publicInt = 0;
		super.protectedInt = 0;
		
		// package, private 접근 제어자는 접근 불가 
		// super.packageInt = 0;
		// super.privateInt = 0;
		}
}

// 특정 클래스파일(.java 파일)에서 public 클래스는
// 파일명과 일치해야하고, 하나만 지정할 수 있다.
class ExampleClass{
	// 자기 파일로 지정된것만 public으로 지정이 가능하다.
}

class AccessModifier3{
	
	void method() {
		
		F_AccessModifier instance = new F_AccessModifier();
		// 현재 위치 : 다른 패키지와 관련 없는 클래스
		// public접근 제어자는 접근 가능
		instance.publicInt = 0;
		
		// protected, package, private 접근 제어자는 접근 불가 
		// instance.protectedInt = 0;
		// instance.packageInt = 0;
		// instance.privateInt = 0;
	}
}