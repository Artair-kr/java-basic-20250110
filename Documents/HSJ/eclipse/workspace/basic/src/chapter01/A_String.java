package chapter01;

import java.util.Scanner;

public class A_String {
	public static void main(String[] args) {
		
		// String : 문자의 배열(문자열)을 표현하는데 사용되는 참조형 데이터 타입
		// 선언 
		// String 변수명;
		// 생성
		// new String();
		// 초기화
		// 변수명 = "문자열";
		String string1;
		string1 = "늦은";
		// 선언과 동시에 초기화
		String string2 = "오후";
		
		System.out.println(string1 + " " +string2);
		
		String string3 = new String();
		string3 = "식사";
		// 실재로는 배열이 아니기 때문에 주소값이 아닌 변수의 내용이 출력된다.
		System.out.println(string3);
		
		char[] chars = {'e', 'x', 'a', 'm'};
		String string4 = "exam";
		System.out.println(chars);
		System.out.println(string4);
		chars[0] = 'd';
		System.out.println(chars);
		// string4[0] = 'd';
		// 이런 행위는 실행되지 않는다.
		// 역할은 배열이긴 하지만 실재로는 배열이 아니다.
		string4 = "dxam";
		System.out.println(string4);		
		// 내용을 바꿀려면 값을 다시 입력 해주어야한다.
		
		// String 클래스의 주요 기능
		String statment = " My name is BoB ";
		
		// 1. 문자열 결합
		// + 혹은 concat(문자열)으로 두 문자열을 연결할 수 있다.
		System.out.println(statment + "I'am Man");
		System.out.println(statment.concat("!!!"));
		
		// 2. 문자열 비교
		// equals(문자열) : 두 문자열이 동등한지 비교
		// compareTo(문자열) : 두 문자열을 사전순으로 비교 (대,소문자 구분)
		// compareToIgnoreCase(문자열) : 두 문자열을 사전순으로 비교 (대,소문자 구분안함)
		// 참이면 true, 거짓이면 false (대,소문자 띄어쓰기도 비교한다.)
		System.out.println(statment.equals("My name is Bob "));
		System.out.println(statment.equals("my name is Bob "));
		System.out.println(statment.equals("My name is Bob"));
		
		// 사전순으로 비교하기때문에 동일하면 0, 양수면 사전순으로 먼저오고, 음수면 사전순으로 뒤에온다.
		System.out.println(statment.compareTo("My name is Bob "));
		System.out.println(statment.compareTo("Ay name is Bob "));
		System.out.println(statment.compareTo("My mame is Bob "));
		System.out.println(statment.compareTo("Zy name is Bob "));
		
		// 3. 문자열의 길이
		System.out.println(statment.length());
		
		// 4. 문자열 변환
		// toUpperCase() : 모두 대문자로 변환
		System.out.println(statment.toUpperCase());
		// toLowerCase() : 모두 소문자로 변환
		System.out.println(statment.toLowerCase());
		// trim() : 앞,뒤 공백 제거
		System.out.println(statment.trim());
		// replace(찾을문자열, 바꿀문자열) : 특정 문자열을 찾아서 변경
		System.out.println(statment.replace("Bob ","Bin" ));
		// replaceAll(찾을문자열, 바꿀문자열) : 특정 문자열을 찾아서 모두 변경
		System.out.println(statment.replaceAll("B","A" ));
		
		// 5. 문자열 찾기
		// indexOf(문자열) : 찾고자하는 문자열의 처음 찾은 위치를 인덱의 번호를 반환
		// lastIndexOf(문자열) : 찾고자하는 문자열의 마지막 위치의 인덱스 번호를 반환
		statment = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 못 그린 기린 그림이다";
		System.out.println(statment.indexOf("그림"));
		// 없는 단어 찾기
		System.out.println(statment.indexOf("사진"));
		
		System.out.println(statment.lastIndexOf("그림"));
		// 없는 단어 찾기
		System.out.println(statment.lastIndexOf("사진"));
		
		// 6. 부분 문자열
		// substring(시작인덱스) : 문자열의 시작인덱스 찾아 그 뒤를 전부 추출한다.
		// substring(시작인덱스, 종료인덱스) : 문자열을 시작인덱스 찾아 종료인덱스까지 전부 추출한다.
		System.out.println(statment.substring(13));
		System.out.println(statment.substring(13, 23));
		
		String str = "Hello, World!";
		Scanner scanner = new Scanner(System.in);
		System.out.println(str);
		String name = scanner.nextLine();
		System.out.println(name);
		
		
		
	}
}
