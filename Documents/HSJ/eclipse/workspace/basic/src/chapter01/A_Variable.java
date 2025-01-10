package chapter01;

public class A_Variable {

	public static void main(String[] args) {
		// 변수 (Variable)
		// 데이터를 s메모리에 저장하는데 사용되는 공간 요소
		// 변수를 생성(선언)할 때는 반드시 해당 변수가 가질 수 있는 데이터의 형태를 지정해야 한다.
		
		// 선언(생성) 방법
		// 데이터타입 변수명;
		int number1;
		
		// 변수 초기화(초기값을 넣는다.)
		// 변수명 = 데이터;
		number1 = 22;
		
		// 선언과 동시에 초기화 방법
		// 데이터타입 변수명 = 데이터;
		int number2 = 30;
		
		System.out.println(number1);
		System.out.println(number2);
		
		// 변수는 선언 후 반드시 초기화한 다음 사용할 수 있습니다.
		int number3 = 10;
		System.out.println(number3);
		
		// 변수의 지정된 타입의 데이터가 아니면 할당이 불가능
		// number3 = 3.14;
		
		// 변수에 처음 데이터를 넣는 행위가 아니기 때문에 초기화가 아니다.
		// 할당 혹은 재할당
		number1 = 400;
		System.out.println(number1);
		
		
		
	}
}
