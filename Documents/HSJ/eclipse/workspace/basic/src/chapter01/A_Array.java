package chapter01;

import java.util.Arrays;

public class A_Array {
	public static void main(String[] args) {
		// 배열 : 동일한 타입의 변수를 묶어서 저장하는 컨테이너
		// new 연산자를 이용해서 컨테이너를 먼저 생성해야한다.
		// 한번 생성된 컨테이너의 크기는 변경할 수 없다.
		
		// 배열 변수 선언 방법
		// 데이터타입[] 배열변수명;
		int[] numbers;
		// 배열 생성
		// new 데이터타입[배열의길이];
		numbers = new int[3];
		// 배열 주소 출력
		System.out.println(numbers);
		
		// numbers = {1, 2, 3}; // 실행안됨
		// {, }로 끝나는 것을 코드블럭이라고 한다.
		int[] numbers2 = {1,2,3};
		int[] numbers3 = new int[] {4,5,6};
		System.out.println("배열 주소 출력");
		System.out.println(numbers);
		System.out.println(numbers2);
		System.out.println(numbers3);
		System.out.println("배열 0번째 숫자 출력");
		System.out.println(numbers[0]);
		System.out.println(numbers2[0]);
		System.out.println(numbers3[0]);
		
		// 배열의 요소에 접근 혹은 사용할 때는 '인덱스' 사용
		// 배열의 시작 인덱스는 0, 마지막 인덱스는 길이 -1 이다.
		int number = numbers3[1];
		System.out.print("number의 값 : ");
		System.out.println(number);
		numbers3[1] = 22;
		// numbers3[1] 을 바꾸어도 number의 값은 바뀌지 않는다.
		System.out.print("number의 값 : ");
		System.out.println(number);
		System.out.print("numbers3[1]의 값 : ");
		System.out.println(numbers3[1]);
		
		// 배열의 길이를 초과하는 인덱스에 접근할 시 예외 발생
		// 문법상으로는 맞지만 없는 배열이기에 예외가 발생한다.
		// System.out.println(numbers3[99]);
		
		// 배열의 길이를 확인하고자 할때 .length
		System.out.print("numbers3[]의 길이 : ");
		System.out.println(numbers3.length);
		System.out.print("numbers3[]의 마지막 인덱스값 : ");
		System.out.println(numbers3[numbers3.length - 1]);
		
		int lastIndex = numbers3.length - 1;
		System.out.print("변수 lastIndex를 이용한 numbers3[]의 마지막 인덱스값 : ");
		System.out.println(numbers3[lastIndex]);
		
		System.out.println("배열 출력 2가지 방법");
		System.out.println(Arrays.toString(numbers3));
		
		for (int i = 0; i <= lastIndex; i++) {
            System.out.print(numbers3[i]);
            System.out.print(" ");
		}
		System.out.println("");
		
		// 배열의 주소 
		int[] example1 = new int[] {1,2,3,4,5};
		int[] example2 = example1;
		System.out.print("example1의 주소 값 : ");
		System.out.println(example1);
		System.out.print("example2의 주소 값 : ");
		System.out.println(example2);
		
		example1[0] = 99;
		System.out.print("example1[0]의 값 : ");
		System.out.println(example1[0]);
		System.out.print("example2[0]의 값 : ");
		System.out.println(example2[0]);
		System.out.print("example1의 주소 값 : ");
		System.out.println(example1);
		System.out.print("example2의 주소 값 : ");
		System.out.println(example2);
		
		int example3 = 100;
		System.out.print("example3의 값 : ");
		System.out.println(example3);
		
		char[] chars = {'e', 'x', 'a', 'm'};
		System.out.print("chars의 값 : ");
		System.out.println(chars);
		System.out.println(Arrays.toString(chars));
		
	}
}
