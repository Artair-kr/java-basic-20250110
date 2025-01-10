package chapter02;

// 생성자(Constructor) : 클래스의 인스턴스가 생성되는 순간에 호출되는 메서드
// 클래스와 같은 이름을 가지고, 반환타입이 존재하지 않는다.
// 클래스명(매개변수, ...){인스턴스가 생성될때 수행할 작업}
class Human1{
	String name; // 이름
	int age; // 나이
	String gender; // 성별
	
	// final로 선언된 인스턴스 변수는 생성자에서 반드시 초기화 해야한다.
	final String address; 
	// The blank final field address may not have been initialized
	// null로 초기화 된 다음, 변경된 값을 지정할 수 없다.
	// Human1에서 반드시 초기화 작업이 이루어져야한다.
	// 생성자에대한 필수 값
	
	int[] numbers;
	
	// 만약 다른 생성자(매개변수가 존재하는 생성자)가 존재한다면
	// 기본 생성자는 자동으로 생성되지 않는다.
	Human1(){ 
		// this() : 클래스의 다른 생성자를 호출하는 키워드
		// 반드시 생성자에서만 사용가능
		// 생성자의 제일 첫 구문으로 들어와야 한다.
		this("홍길동");
		// 1. 인스턴스를 생성할 때 특정 작업을 수행하고 싶을 때
		System.out.println("Human1의 인스턴스가 생성됩니다.");
		
		// 2. 인스턴스를 생성과 동시에 초기화 하고 싶을 때
		// 의존성을 내부에서 주입하는 행위
		// 초기화 전에는 null, 또는 0이 들어있다.
		// 밑 작업이 초기화 작업이다.
		// address가 final이기 때문에 반드시 초기화 해줘야한다.
		name = "홍길동";
		age = 20;
		gender = "남";
		// address = "부산";
		
		// this("홍길동");
		// Constructor call must be the first statement in a constructor
		
	}
	Human1(String name){
		// this : 현재 자기 자신의 인스턴스를 지칭하는 키워드
		// 인스턴스 변수나 인스턴스 메서드를 정확하게 지칭할때 사용한다.
		this.name = name;
		age = 20;
		gender = "남";
		address = "부산";
		
	}
	Human1(String name1, int age1, String gender1){
		// 의존성을 모두 외부에서 주입하는 행위
		// address가 final이기 때문에 반드시 초기화 해줘야한다.
		name = name1;
		age = age1;
		gender = gender1;
		address = "부산";
		numbers = new int[]{1,2,3};
	}
	Human1(Human1 human1){
		// 새로운 인스턴스값이 생성되고 human1의 값을 가져온다.
		// 똑같지만 독립적이다.
		name = human1.name;
		age = human1.age;
		gender = human1.gender;
		address = human1.address; // 주소가 들어갔다.
		numbers = human1.numbers; // 주소가 들어갔다.
	}
}
public class D_Constructor {
	public static void main(String[] args) {
		
		// 만약 클래스에 생성자를 정의하지 않으면
		// 컴파일러가 자동으로 기본 생성자를 제공한다.
		// 주소가 들어가기에 반환타입 고정이 되어있다.
		Human1 human1 = new Human1(); // 특별한 작업(x), 인스턴스만 제공
		// human1에 들어있는 인스턴스
		human1.name = "이성계";
		human1.age = 60;
		human1.gender = "남";
		
		Human1 human2 = new Human1();
		System.out.println(human1.name);
		System.out.println(human1.age);
		System.out.println(human1.gender);
		// 초기화된 정보가 들어가있다.
		System.out.println(human2.name);
		System.out.println(human2.age);
		System.out.println(human2.gender);
		
		Human1 human3 = new Human1("태조"); 
		System.out.println(human3.name);
		
		Human1 human4 = new Human1("선녀",19,"여"); 
		System.out.println(human4.name);
		System.out.println(human4.age);
		System.out.println(human4.gender);
		
		Human1 human5 = human4;
		// 주소가 복사된다.(독립적x)
		// human4 를 new로 선언했기 때문이다.
		
		human5.name = "이남수";
		human5.age = 30;
		human5.gender = "남";
		
		Human1 human6 = new Human1(human4);
		// 새로운 주소 생성 후, 그 값은 human4를 복사한다. (독립적)
		human6.name = "이성계";
		human6.age = 60;
		human6.gender = "남";
		
		// human4의 주소를 human5로 끌고 왔기에 4의 값도 바뀐다.
		System.out.println(human4.name);
		System.out.println(human4.age);
		System.out.println(human4.gender);
		
		System.out.println(human5.name);
		System.out.println(human5.age);
		System.out.println(human5.gender);
		
		// human6는 4의 내용만 복사했기에 독립적이다.
		System.out.println(human6.name);
		System.out.println(human6.age);
		System.out.println(human6.gender);
		
		Human1 human7 = new Human1(human4);
		human4.numbers[0] = 99;
		System.out.println(human4.numbers[0]);
		// 독립적이지만, 값이 99이다.
		// 결국은 같은 곳을 바라보고있다.(주소값이 복사되었다.)
		// 얕은 복사라고한다.
		System.out.println(human7.numbers[0]);
			
	}
}
