package chapter01;

import java.util.Scanner;

public class F_Controll_Switch {
	public static void main(String[] args) {
		/* Switch 문 : 특정 변수 혹은 표현식에 따라 
		   실행할 코드 블럭의 범위를 결정하는 것 */
        // number 라는 변수에 사용자로부터 정수를 입력받아 할당
        // 0이면 ABC를 출력
        // 1이면 BC를 출력
        // 2이면 C
        // 3이면 DE를 출력
        // 0~3이 아니면 E를 출력   
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 : ");
		int number = scanner.nextInt();
		System.out.println(number);
		
		switch(number) {
		case 0: System.out.print("A"); 
		
		case 1: System.out.print("B"); 
		case 2: System.out.print("C"); break;
		case 3: System.out.print("D"); 
		default : System.out.println("E");			
		
		}
	}
}
