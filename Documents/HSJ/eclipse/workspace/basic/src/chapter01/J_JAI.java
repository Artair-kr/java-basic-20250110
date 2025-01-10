package chapter01;

public class J_JAI {
	public static void main(String[] args) {
		// 제어문 : 조건에 따라서 코드의 흐름을 결정하는 것
		// 조건문 : 조건문은 특정 조건이 만족될 때만 코드의 일부를 실행하게 한다. 
		// if문 : 주어진 논리표현식(조건)이 true이면 코드 블럭을 실행하게 하는 것
		// else문 : if 문의 condition이 거짓일 경우에만 실행할 코드 블록을 결정한다.
		System.out.println("조건문 시작");
		
		int number = 10;
		    if( number > 10) System.out.println("10보다 크다");
		    else { 
		        if(number == 10) System.out.println("10과 같다");
				else System.out.println("10보다 작다");
		        }
		System.out.println("조건문 종료");
		
		// else 문 :  if 문의 논리표현식이 거짓일 경우에만 실행할 코드 블록을 결정한다.
		// if(논리표현식){ true일 때 싫행할 코드블럭 }
		// else { false일 때 실행할 코드 블럭 }
	}
}
