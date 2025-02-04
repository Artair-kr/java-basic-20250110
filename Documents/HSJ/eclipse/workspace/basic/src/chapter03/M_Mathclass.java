package chapter03;

public class M_Mathclass {
	public static void main(String[] args) {
		// Math 클래스 : 수학 연산과 관련된 다양한 메서드 제공 클래스
		// 모든 메서스다 static인 클래스 메서드
		
		// ceil() : 올림 메서드
		System.out.println("ceil(올림) : " + Math.ceil(3.14));
		// floor() : 내림 메서드
		System.out.println("floor(내림) : " + Math.floor(3.14));
		// round() : 반올림 메서드
		System.out.println("round(반올림) : " + Math.round(3.14));
		
		// 소수점 자리에서 반올림
		// 3.1415 -> 3.14
		System.out.println("round(반올림,소수점2자리까지)과정");
		System.out.println(Math.round(3.1415*100));
		System.out.println(Math.round(3.1415 * 100) / 100 ); // 소숫점 표현 불가
		System.out.println(Math.round(3.1415 * 100) / 100.0 ); // 소숫점 표현 가능
		
		// 정수 자리에서 반올림
		// 98765 중 10의 자리에서 반올림
		// 98765 -> 98800
		System.out.println("round(반올림, 정수 10의 자리에서 반올림과정)");
		System.out.println(Math.round(98765 / 100.0));
		System.out.println(Math.round(98765 / 100.0) * 100);
		System.out.println(Math.round(98765 / 100.0) * 100.0);
		System.out.println(Math.round(98765 / 100.0) * 100.00000); 
		// 소숫점 자리가 없으므로 1번째 자리까지 표현된다.
	}
}
