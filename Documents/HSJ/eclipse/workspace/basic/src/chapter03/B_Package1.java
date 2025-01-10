package chapter03;

public class B_Package1 {
	public static void main(String[] args) {
		
		// Wrapper 클래스 : 기본형 데이터 타입을 참조형 데이터 타입으로 다룰수 있도록
		// 도움을 주는 클래스
		
		
		// int -> Integer
		int basicInt = 10;
		// Integer wrapperInteger =  10;
		Integer wrapperInteger =  null;
		 wrapperInteger = basicInt;
		// wrapper 클래스는 null을 가질 수 있기 때문에
		// 기본형  데이터타입에 참조형 데이터 타입을 할당할때 주의해야한다.
		basicInt = wrapperInteger;
		
		System.out.println(basicInt);
		System.out.println(wrapperInteger);
		
		// double -> Double
		double  basicDouble = 1.0;
		Double  wrapperDouble = 1.0;
		
		// boolean -> Boolean
		boolean basicBoolean = false;
		Boolean wrapperBoolean = true;
		
		// Wrapper 클래스에서 자주 사용되는 기능
		// parse 메서드 : 문자열을 특정 타입으로 변경
		// parseInt, parseDouble 등
		
		double number = Double.parseDouble("10.11");
		// "10.11" 이라는 문자열을 10.11이라는  double타입으로 변경
		
		// toString 메서드 : 특정 타입을 문자열로  변경
		String string = Double.toString(10.11);
		// 10.11이라는 double타입을 문자열로 변경
		// string = wrapperDouble.toString(10.11);
		
		
		System.out.println("double형 : " + number);
		System.out.println("문자열 : " + string);
	}
}
