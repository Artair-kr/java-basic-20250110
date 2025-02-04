package chapter02;

// 다형성 : 하나의 표현으로 여러가지 형태를 나타낼 수 있는 것
// 오버로딩(Overloading) : 같은 클래스 내에서 동일한 이름의 메서드를 여러 정의 할 수 있는 것
// 오버라이딩(Overriding) : 자손 클래스에서 조상 클래스에 정의된 메서드를 재정의 하는 것

// 상속과 추상화가 되어있는 코드에만 적용이가능하다.
// 업캐스팅 : 하위 클래스의 객체를 상위 클래스 혹은 구현한 인터페이스의 타입에 참조변수로 저장하는 것
// 다운캐스팅 : '업캐시팅된' 객체를 다시 원래 타입의 변수에 담는 것

class People{
	String name;
	int age;
	
	// 생성자
	People(String name, int age){
		//  클래스의 인스턴스 변수(name, age)에 매개변수로 전달된 값을 할당
		this.name = name;
		this.age = age;
	}
}
// 반드시 Teacher의 생성자여서 부모클래스의 생성자를 불러와야한다.
class Teacher extends People{
	
	String subject;
	
	Teacher(String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}
}
class Student extends People{
	
	int grade;
	
	Student(String name, int age, int grade) {
		super(name,age);
		this.grade = grade;
	}
}
public class J_Polymorphism {
	public static void main(String[] args) {
		
		// people1 에는 주소가 들어가는 것을 잊지 않기! (new 사용)
		// 부모 클래스
		People people1 = new People("홍길동", 20);
		
		// 자식 클래스
		Teacher teacher1 = new Teacher("이선생", 30, "역사");
		Student student1 = new Student("이학생", 15, 3);
		
		// 업캐스팅
		People people2 = teacher1;
		
		System.out.println(people1.name);
		System.out.println(people1.age);
		System.out.println(people2.name);
		System.out.println(people2.age);
		// subject cannot be resolved or is not a field
		// 힙영역에 남아있지만 보는 시각이 달라져서(subject의 보는 구멍을 막아)찾아볼수 없다.
		// System.out.println(people2.subject);
		
		// 다운캐스팅
		// 이미 업캐스팅이 되어있는 것만 다운캐스팅이 가능하다.
		// 자동으로는 불가능하다.
		// Type mismatch: cannot convert from People to Teacher
		// Teacher teacher2 = people2;
		// 보는 시각을 강제로 늘린다. (subject를 보는 막힌 구멍을 뚫어버린다.)
		Teacher teacher2 = (Teacher)people2;
		
		System.out.println(teacher2.name);
		System.out.println(teacher2.age);
		System.out.println(teacher2.subject);
		
		// 업캐스팅이 되지 않은 참조변수에 대해서는 다운캐스팅 작업이 불가능하다.
		// 정상적인 것 처럼 보이지만 업캐스팅을 한적이 없기 때문에 오류가 발생한다.
		// The value of the local variable student2 is not used
		// Student student2 = (Student)people1;
		
		// Object를 활용한 업캐스팅 다운캐스팅
		Object object1 = student1;
		Student student2 = (Student)object1;
		
		System.out.println(student2.age);
		System.out.println(student2.name);
		System.out.println(student2.grade);
		
		}
}
