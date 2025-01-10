package chapter01;

public class J_While2 {
	public static void main(String[] args) {
		int number = 0;
		while(number < 10) {
			if(number % 3 != 0) { // 3의 배수가 아니면 while문 으로 돌아간다.
				break;
			}
			System.out.println(number);
			number++; // 무한 반복에 빠진다.
		}
	}
}
