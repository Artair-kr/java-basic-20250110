package chapter02;
import java.util.*;

// 클래스 : 공통된 속성과 기능을 정의한 것
// [접근제어자] class 클래스명 { 속성, 기능 }
// 접근제어자 : public, protected, private, default 
class ExampleClass1 {
    // 속성 : 객체가 가지는 정보나 상태의 정의
    // 일반적으로 변수형태로 표현
    int attribute1; // 정의만 하기에 일반적으로 할당하지 않는다.
    double attribute2; // 예 : double attribute2 = 10;

    // 인스턴스 변수 : 각 인스턴스마다 독립적으로 값을 가지는 변수
    // 반드시 인스턴스가 생성된 후에 사용 가능
    int instanceVariable;

    // 클래스(static) 변수 : 해당 클래스로 생성된 모든 인스턴스가 공유하는 변수
    // 필드의 데이터 타입 앞에 static 키워드를 사용하여 지정(정적이다.변함이 없다.)
    // 인스턴스 생성 없이 사용 가능
    static int classVariable; // 클래스 변수의 경우 글꼴이 바뀐다.

    // int intstanceMethod1 까지만 입력하면 일반 변수이다.
    // 인스턴스 메서드 : 인스턴스 생성 후 인스턴스를 통해 호출 가능한 메서드
    // 인스턴스, 클래스 변수 및 메서드를 모두 사용 가능하다.
    int intstanceMethod1(int arg1) {
        return arg1 * attribute1;
    }

    // 클래스 메서드 : 인스턴스 생성없이 클래스로 호출 가능한 메서드
    // 반환타입 앞에 static 키워드를 붗여서 선언 가능
    // 클래스 메서드에서는 인스턴스 변수 사용 및 인스턴스 메서드 호출이 불가능하다.
    // 인스턴스 변수 및 인스턴스 메서드를 사용하지 않는 기능에 주로 사용된다.
    static int classMethod1(int arg1) {
        return arg1 * classVariable; // 정적 변수는 static 메서드에서 사용 가능
    }
}

// 스마트폰
class SmartPhone1 {
    // 글로벌 변수(전역 변수)
    String os; // 운영체제
    String telNumber; // 전화번호
    boolean power; // 전원상태

    void onOff() {
        // 전원 상태 변경 작업
        // 데이터를 받을 필요가 있는가? - power만 있으면 된다.
        power = !power;
    }

    void printInfo() {
        // 정보를 보여주는 작업
        // 혼자 작업 실행- 반환 데이터 x (void)
        if (!power) {
            System.out.println("전원이 꺼져있습니다.");
            return;
        }
        System.out.println("OS : " + os);
        System.out.println("Tel Number : " + telNumber);
    }

    void tel(String to) {
        if (!power) {
            System.out.println("전원이 꺼져있습니다.");
            return;
        }
        // 매개변수 : String to
        System.out.println(telNumber + "가 " + to + "에게 전화를 겁니다.");
    }
}

public class C_Class {

    // 함수 : 특정한 기능에 대한 정의
    // 반환타입 함수명(매개변수타입 매개변수명, ...){ 함수의 기능 }
    int fx1(int x) {
        int y = x * x + 2 * x + 1;
        return y;
    }

    	public static void main(String[] args) {
			
        // 인스턴스 : 특정 클래스로 정의된 것을 실체화한 것
        // 클래스명 참조변수명 = new 클래스명();
        // instance1 : 지역변수
        ExampleClass1 instance1 = new ExampleClass1();
        ExampleClass1 instance2 = new ExampleClass1();

        // 인스턴스가 가지고 있는 속성 접근 방법
        // 인스턴스.속성명;
        instance1.attribute1 = 10;
        instance2.attribute1 = 20;
        new ExampleClass1().attribute1 = 30;
        // 인스턴스로도 접근가능하다.
        instance1.classVariable = 10;
        // 구조체로 접근가능하다.
        ExampleClass1.classVariable = 20;
        instance2.classVariable = 99;

        System.out.println(instance1.classVariable); // 99
        System.out.println(instance2.classVariable); // 99
        System.out.println(ExampleClass1.classVariable); // 99

        // 스마트폰 객체 생성
        SmartPhone1 iPhone16 = new SmartPhone1();
        SmartPhone1 galaxyS24 = new SmartPhone1();

        // 스마트폰 속성 설정
        iPhone16.os = "iOS";
        iPhone16.telNumber = "010-1111-1111";
        galaxyS24.os = "Android";
        galaxyS24.telNumber = "010-9999-9999";

        // 스마트폰 메서드 호출
        iPhone16.printInfo();
        iPhone16.onOff();
        iPhone16.printInfo();
        iPhone16.tel("010-2222-3335");
        
        // 전화를 거는 메서드 호출
        iPhone16.tel("010-2222-2222");

        galaxyS24.printInfo();
        galaxyS24.tel("010-3333-3333");
    }
}