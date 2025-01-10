package chapter01;
import java.util.Scanner;

public class A_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("안녕하세요.");

        System.out.print("나이를 입력해주세요. : ");

        int age = scanner.nextInt();

        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}