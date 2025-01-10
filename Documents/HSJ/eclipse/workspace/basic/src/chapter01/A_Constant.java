package chapter01;

public class A_Constant {
	public static void main(String[] args) {
		// 상수 (Constant)
		// 초기화가 이루어지면 변경이 불가능한 변수
		// 변수 선언 시에 데이터 타입 앞에 final 키워드를 붙여서 선언
		// final 데이터타입 변수명(상수명);
		final int NUMBER;
		NUMBER = 100;
		System.out.println(NUMBER);
		
		final double PI = 3.14;
		// 상수는 초기화 이후 재할당 불가능
		// PI = 3.1415;
		// NUMBER = 111;
		System.out.println(PI);
		
		// 1. 리터럴에 이름을 부여하기 위해 많이 사용된다.
		// 리터럴으로만 표현을 한다면 해당하는 리터럴이 무엇인지 이해하기 어렵다.
		// 포갈적인 이름으로 변수명을 지으면 저 변수명이 무엇을 의미하는지 모른다.
		// double result = 77.6 * 163;
		
		final double I_PHONE_16_PRO_MAX_WIDTH = 77.6;
		final double I_PHONE_16_PRO_MAX_HEIGHT = 163.0;
		
		double iPhone16ProMaxArea = 
				I_PHONE_16_PRO_MAX_WIDTH * I_PHONE_16_PRO_MAX_HEIGHT;
		
		// 2. 데이터를 보호하기 위한 목적
		int INPUT_NUMBER = 8;
		
		// 리터럴 상수 : 데이터 그 자체 ( 코드 상에서 )
		// int age = 32; 
		// 이라는 구문에서 '32'가 리터럴에 해당한다.
		// 32 = 10;
		// 이러한 형태는 불가능하다.
	}
}
