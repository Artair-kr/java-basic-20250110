package chapter01;

public class F_for {
	public static void main(String[] args) {
		/*
		// 반복문 : 특정 조건에 만족하는 동안 지정한 코드 블럭을 반복 실행하도록 하는 것
		// for문 : 일반적으로 반복 횟수가 정해져 있을대 사용하는 반복문
		// for(조건에 사용할 변수 초기화; 논리표현식; 조건에 사용할 변수 증감){
		// 반복 실행할 코드 블럭}
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
		*/
		// 배열 선언
		// fruits 에는 주소가 들어가 있다.
		String[] fruits = new String[]{"apple", "banana", "cacao"};
		System.out.println(fruits);
		for(int i = 0; i < fruits.length; i++) {
			fruits[i] += " add";
			System.out.println(fruits[i]);
		}
		int[] arr = {1, 2, 3, 4, 5};

		for (int num : arr) {
		    System.out.println(num);
		}
		for (String fruit : fruits) {
		    System.out.println(fruit);
		}
		for (String fruit : fruits) {
		    fruit += " add";
		}
		for (String fruit : fruits) {
		    System.out.println(fruit);
		}
		// forEach문 : 컬랙션(배열)의 각 요소를 하나씩 변수에 복사해서 사용하는 반복문
		// for(배열 요소의 타입 변수명 : 배열) {반복할 코드 블럭}
		// forEach는 컬렉션의 실제 요소에 대해서 읽기전용 작업에 적합하다.
		// while문 :
	}
}
