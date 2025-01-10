package chapter02;

// 인터페이스 : 클래스가 구현해야만 하는 메서드들의 집합을 정의한 것(기능 단위)
// 인터페이스의 모든 변수는 public static final 형태이다. (일반적으로)
// 인터페이스의 모든 메서드는 public abstract 형태이다. (일반적으로)
// Java 8 이후부터는 인터페이스에서 디폴트 메서드와 정적 메서드를 가질 수 있다.
// 인터페이스는 다중 구현이 가능하다. (다중 확장은 안된다.)

// 인터페이스는 개발자간의 상호 약속을 위한 수단으로 사용된다.
// 기능, 상수들에 대한 약속을 정의한다.

// 접근제어자 interface 인터페이스명 {...}
// 개발이 본격적으로 사작되기전 명시
interface AreaCalculation{
	// 넓이 공식 (3가지)
	// 선언을 할때 반드시 접근제어자는 public와 abstract가 강제된다.
	
	// 원주율에 넣을 상수를 지정해야한다. (약속)
	// public static의 경우 강제되기에 생략해도 이상이 없다.
	// public static final double PI = 3.14;
	final double PI = 3.14;
	
	// 메소드는 반드시 public abstract이 기본이기 때문에 생략이 가능하다.
	// 삼각형의 넓이 
	// public abstract double getTriangleArea(double bottom, double height);
	double getTriangleArea(double bottom, double height);
	// 사각형 넓이
	public abstract double getRectangleArea(double bottom, double height);
	// 원 넓이
	// 원주율에 넣을 상수를 지정해야한다.
	public abstract double getCircleArea(double radius);
}
interface NormalCaculation{
	// 인터페이스의 다중구현
	// 인터페이스는 인터페이스끼리는 상속(확장)이 가능하다.
	// 인터페이스의 상속(확장)은 다중 상속이 가능하다.
	// 클래스에서 다중 상속은 불가능 했다.
	
	// 생략
	double add(double a, double b);
	
}
// 인터페이스는 인터페이스끼리는 상속(확장)이 가능하다.
// 인터페이스의 상속(확장)은 다중 상속이 가능하다.
// 클래스에서 다중 상속은 불가능 했다.
interface Caculation extends AreaCalculation, NormalCaculation{

	
	
}
// implements 키워들르 이용하여 클래스에서 구현할 수 있다.
// 개발이 시작되면 명시한 대로 작성시작
// 명시한대로 작성에 강제성을 부여한다.
// 인터페이스는 인터페이스끼리는 상속(확장)이 가능하다.
// 인터페이스의 상속(확장)은 다중 상속이 가능하다.
// 인터페이스는 다중 구현이 가능하다. 
// 클래스에서 다중 상속은 불가능 했다.
class Calculator implements AreaCalculation, NormalCaculation{
	// add unimplemented methods를 눌러 강제된 것을 작성한다.
	
	@Override
	public double getTriangleArea(double bottom, double height) {
		double triangleArea = bottom * height / 2;
		return triangleArea;
	}

	@Override
	public double getRectangleArea(double bottom, double height) {
		double rectangleArea = bottom * height;
		return rectangleArea;
	}

	@Override
	public double getCircleArea(double radius) {
		double circleArea = radius * radius * PI;
		return circleArea;
	}

	@Override
	public double add(double a, double b) {
		double result = a + b;
		return result;
	}	
}

public class I_Interface {

	public static void main(String[] args) {
		// 
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.getCircleArea(5));
		System.out.println(calculator.getRectangleArea(5, 4));
		System.out.println(calculator.getTriangleArea(5, 4));
		System.out.println(calculator.add(5, 4));
		
	}
}
