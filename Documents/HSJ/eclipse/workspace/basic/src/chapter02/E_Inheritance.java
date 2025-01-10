package chapter02;

// 상속 : 객체지향 프로그래민의 특성 중 하나
// 원래 존재하던 클래스를 '확장'하여 재사용할 수 있도록 하는 것
// 재정의와 비슷하지만 있던 코드를 유지하면서 추가를 할수 있다는 점에서 다르다.
// 재정의는 있던 코드도 수정한다.
// 코드의 중복을 제거하여 코드 재사용성, 유지보수성, 확장성을 높일 수 있다.
// 상속을 너무 많이하면 복잡해서 유지보수가 힘들어질수 있으니 조심해야한다.
// 상속은 1~2개 많아도 3개 까지만 하는 것이 좋다.
// 부모 클래스만 수정한다면 자식 클래스에 상속된 코드를 동시에 수정할 수 있다.
// extends 상속

// class subClass extends SuperClass{ ... }
class Human{
	String name;
	int age;
	
	Human(){}
	// 부모 클래스의 생성자는 상속되지 않는다.
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	void sleep() {
		System.out.println(name + "이 잠을 잔다");
	}
	final void eat() {
		System.out.println("밥을 먹습니다.");
	}
}
// 중첩 상속
class Korean extends Human{


	static String country = "대한민국";
	 
    // 부모 클래스의 생성자를 호출
	Korean(String name, int age) {
        super(name, age);  // 부모 클래스 생성자 호출
    }
	// String name;
	// int age;
	// void sleep() {
	// System.out.println(name + "이 잠을 잔다");}
	// 위에 똑같이 sleep()이 상속이 되고 있지만 구동이 되고있다.
	@Override
	void sleep() {
		super.sleep();
		System.out.println("01시에 잠을 잔다.");
	}
}
// Human -> Korean -> Firefighter 중첩상속
class Firefighter extends Korean{

	// 상속 받은것은 작성하지 않아도 된다.
	String position;
	
	Firefighter(String name, int age) {
        super(name, age);  // Korean 클래스의 생성자 호출
    }
	// Human 클래스에서 상속받은 sleep 매서드를 오버로딩한 것
	// 다형성이 적용되었다.
	void sleep(int time) {
		System.out.println(name + "이 " + time + "시에 잠을 잔다.");
	}
	void firefight() {
		System.out.println(name + "이 소방활동을 한다.");
	}
}
class Police extends Human{

	String rank;
	
	Police(){
		// super(): 부모 클래스의 생성자를 지칭하는 키워드
		super("이향",32);
		// super : 부모 클래스를 지칭하는 키워드
		//super.name = "이향";
		//super.age = 32;
		rank = "경감";
	}	
	
	void patrol() {
		System.out.println(name + "이 순찰을 돈다.");
	}
}
// Java에서는 단일 상속만 지원한다.
// 다중 상속에 발생할 수 있는 다이아몬드 문제가 발생하지 않도록 하기 위함.
// 문제 : 두 개 이상의 상위 클래스가 동일한 메서드를 가질 때 어떤 메서드를 호출해야 하는지 모호하다.
// 인터페이스를 사용하여 다중 상속 효과를 볼수 있음, 중첩 상속을 사용하여 다중 상속 효과를 볼 수 잇다.

// java의 클래스는 object 클래스를 최상위 클래스로 상속받아 사용한다.
// person.을 쳤을때 사용가능한 메소드가 내가 입력하지 않은것도 있다.
class SalesMan extends Human{

	int sales;
	SalesMan(String name, int age) {
        super(name, age);  // 부모 클래스 생성자 호출
    }
	void sale(int amount) {
		sales += amount;
	}
	// 오버라이딩(Overriding) : 하위 클래스에서 상위 클래스의 메서드를 '재정의' 하는것 
	// 규칙
	// 1. 상위 클래스에서 선언된 메서드와 이름, 매개변수 조합, 반환타입이 같아야한다.
	// 2. 상위 클래스에서 선언된 메서드가 final로 선언되면 재정의가 불가능하다.
	// @Override : 컴파일러에게 현재 작업이 오버라이딩 작업임을 알려준다.
	// 문법적으로 오류가 없는지 확인해준다.
	@Override
	void sleep() {
		// 오버라이딩을 통해서 코드의 유연성을 증가 시킬수 있다.
		System.out.println("영업 사원이 잠을 잔다.");
		// 오버라이딩을 통해 코드의 재사용성을 증가 시킬수 있다.
		super.sleep();
		// = System.out.println(name + "이 잠을 잔다.");
		// 부모 클래스 호출
	}
	// 재정의 불가
	/*
	void eat() {
		// Cannot override the final method from Human
		// final 매서드라 재정의 불가능하다.
	}
	*/
}
final class FinalSuper{
	int a;
}
/*
class FinalSub extends FinalSuper{
	// 상속 불가
	// Cannot override the final method from Human
	// Final로 정의된 클래스는 상속 받을 수 없다.
}
*/
public class E_Inheritance {
	public static void main(String[] args) {
		
		Firefighter firefighter = new Firefighter(null, 0);
		firefighter.name = "소방인";
		System.out.println(firefighter.name);
		firefighter.sleep(5); // time = 5;
		firefighter.sleep();	
		
		Police police = new Police();
		police.sleep();
		firefighter.sleep();
		firefighter.sleep(5);
		
		SalesMan salesMan = new SalesMan("남산", 0);
		// 오버라이딩
		salesMan.sleep();

	}
}

