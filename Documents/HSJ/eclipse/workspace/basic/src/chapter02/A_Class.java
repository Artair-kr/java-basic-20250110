package chapter02;

// 클래스 : 공통된 속성과 기능을 정의한 것
// [접근제어자] class 클래스명 { 속성, 기능 }
// 접근제어자 : public, protected, private, default 
class ExampleClass1 {
	// 속성 : 객체가 가지는 정보나 상태의 정의
	// 일반적으로 변수형태로 표현
	int attribute1; // 정의만 하기에 일반적으로 할당하지 않는다.
	double attribute2; // 예 : double attribute2 = 10;
	
	// 인스턴스 변수 : 각 인스턴스마다 독립적으로 값을 가지는 변수
	// 반드시 인스턴스가 생성된 후에 사용 가능
	int instanceVariable;
	// 클래스(static) 변수 : 해당 클래스로 생성된 모든 인스턴스가 공유하는 변수
	// 필드의 데이터 타입 앞에 static 키워드를 사용하여 지정(정적이다.변함이 없다.)
	// 인스턴스 생성 없이 사용 가능
	static int classVariable; // 클래스 변수의 경우 글꼴이 바뀐다.
	
	// int intstanceMethod1 까지만 입력하면 일반 변수이다.
	// 인스턴스 메서드 : 인스턴스 생성 후 인스턴스를 통해 호출 가능한 메서드
	// 인스턴스, 클래스 변수 및 메서드를 모두 사용 가능하다.
	int intstanceMethod1(int arg1) {
		return arg1 * attribute1;   
	}
	// 클래스 메서드 : 인스턴스 생성없이 클래스로 호출 가능한 메서드
	// 반환타입 앞에 static 키워드를 붗여서 선언 가능
	// 클래스 메서드에서는 인스턴스 변수 사용 및 인스턴스 메서드 호출이 불가능하다.
	// 인스턴스 변수 및 인스턴스 메서드를 사용하지 않는 기능에 주로 사용된다.
	static int classMethod1(int arg1) {
		return arg1 * classVariable; // 인스턴트가 생성된 후에만 사용가능
		            // 빨간줄 그어짐
	}
}
// 스마트폰
// 가로 길이
// 세로 길이
// 운영체제
// 용량
// 식별번호 - string 16진수를 쓴다(알파벳을 쓰기도함)
// 전화번호 - string 숫자로 입력하면 전화번호 시작이 0일때 0이 없어질 수도 있다.
class SmartPhone1{
	// 글로벌 변수(전역 변수)
	double width; // 가로
	double height; // 세로
	String os; // 운영체제
	int volume; // 용량
	String serialNumber; // 식별번호
	String telNumber; // 전화번호
} 
// 배열은 데이터타입[] 변수 = new (데이터타입[])
// new : 새로운 공간에 컨테이너를 하나 새로 만든다.
// 변수에는 새로 만든 컨테이너 1번째의 주소가 들어간다.
class TriangleMath{
	// F_LIGHT는 TriangleMath 클래스의 단일 책임 원칙에 위배된다.
	// 빛의 속도
	static final int SPEED_OF_LIGHT = 300_000_000;
	
	// 삼각형과 관련된 수학 연산
	// 빗변 구하기 - 독립적 x 클래스 메서드로 작업
	// 둘레 구하기 - 독립적 x
	// 넓이 구하기 - 독립적 x
	static double getHypotenuse(double bottom, double height) { // 빗변
		if(bottom <= 0 || height <= 0) {
			System.out.println("입력이 틀렸습니다.");
			return 0; // 밑의 식에서 절대로 나올수 없는 값을 입력해준다.
		}
		double hypotenuse2 = Math.pow(bottom, 2) + Math.pow(height, 2);
		double hypotenuse = Math.sqrt(hypotenuse2);
		return hypotenuse; // 값을 리턴 해 줘야한다.
	}
	static double getCircuference(double bottom, double height, double hypotenuse) {
		if(bottom <= 0 || height <= 0 || hypotenuse <= 0) {
			System.out.println("입력이 틀렸습니다.");
			return 0; // 밑의 식에서 절대로 나올수 없는 값을 입력해준다.
		}
		double circumference = bottom + height + hypotenuse;
		return circumference;
	}
	static double getArea(double bottom, double height){
		if(bottom <= 0 || height <= 0){
			System.out.println("입력이 틀렸습니다.");
			return 0; // 밑의 식에서 절대로 나올수 없는 값을 입력해준다.			
		}
		double area = (bottom * height)/2; 
		return area;
	}
}
public class A_Class {
	// 함수 : 특정한 기능에 대한 정의
	// 반환타입 함수명(매개변수타입 매개변수명, ...){ 함수의 기능 }
	int fx1(int x) {
		int y = x * x + 2 * x + 1;
		return y;
	}
	public static void main(String[] args) {
		// 인스턴스 : 특정 클래스로 정의된 것을 실체화한 것
		// 클래스명 참조변수명 = new 클래스명();
		// 배열에서는 []였지만 클래스 인스턴스 만들시는 ()여야 한다.
		// instance1 : 지역변수
		ExampleClass1 instance1 = new ExampleClass1();	
		ExampleClass1 instance2 = new ExampleClass1();
		
		System.out.println(instance1);
		System.out.println(instance2);
		
		// 인스턴스가 가지고 있는 속성 접근 방법
		// 인스턴스.속성명;
		instance1.attribute1 = 10;
		instance2.attribute1 = 20;
		new ExampleClass1().attribute1 = 30;
		// 인스턴스로도 접근가능하다.
		instance1.classVariable = 10;
		// 구조체로 접근가능하다.
		ExampleClass1.classVariable = 20;
		instance2.classVariable = 99;
		
		System.out.println(instance1.classVariable); // 99
		System.out.println(instance2.classVariable); // 99
		System.out.println(ExampleClass1.classVariable); // 99
		// instance2 만 99로 바꿨는데 결과값이 다 99이다.
		// a = new int[3];
		// b = a;
		// b[1] = 99;
		// a[1] = ?, ? = 99 이다.
		// new로 배열을 만든경우 a는 주소 값이 들어있기 때문에 
		// b를 바꿨을때 a도 같이 바뀐다.
		// 변수를 바꾼게 아니라 변수안에 저장된 주소에 든 값을 바꿨기 때문이다.
		
		// 클래스 변수를 사용할 때 주의할 점
		// 클래스 변수는 모든 인스턴스에 영향을 미치기 때문에 
		// 클래스로 접근하길 권장한다.
		// 일반적으로 클래스 변수는 final 키워드와 함께 사용한다.(모두 그런것은 아님)
		
		SmartPhone1 iPhone16 = new SmartPhone1();
		SmartPhone1 galaxyS24 = new SmartPhone1();
		
		iPhone16.os = "iOS";
		iPhone16.telNumber = "010-1111-1111";
		galaxyS24.os = "Android";
		galaxyS24.telNumber = "010-9999-9999";
		
		System.out.println(iPhone16.os);
		System.out.println(iPhone16.telNumber + "가 ");
		System.out.println("010-2222-2222로 전화를 겁니다.");
		
		System.out.println(galaxyS24.os);
		System.out.println(galaxyS24.telNumber + "가 ");
		System.out.println("010-3333-2222로 전화를 겁니다.");
		
		double result = TriangleMath.getHypotenuse(3, 4);
		System.out.println(result);
		TriangleMath.getHypotenuse(3, 0);
		double result2 = TriangleMath.getCircuference(2, 3, 4);
		System.out.println(result2);
		double result3 = TriangleMath.getArea(2, 3);
		System.out.println(result3);
	}
}            