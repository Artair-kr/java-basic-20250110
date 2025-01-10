package chapter01;

public class J_Switch {
	public static void main(String[] args) {
		// 코드 블럭
		// 코드들의 묶음 (여러 구문을 하나의 묶음(기능)으로 취급)
		// {} 로 표시한다.
		// 각각 개별로 볼 수 있기에 {}로 묶어주면 하나의 작업단위다 라고 인식할 수 있다.
		// 코드가 여러 줄 이여야한다. (한 줄만 있어서 묶을수는 있지만 굳이 할 필요가 없다.)
		{
			// main의 입장에서는 코드 블럭이 있고 내가 처리할것이지만 내용은 모른다.
			int a = 10;
			int b = 20;
			int result = a + b;
			System.out.println(result);
			// 코드 블럭 안에서는 불가능 하다.
			// int a = 0;
		}
		// 코드 블럭 안에서는 불가능 하다.
		// 코드 블럭안에 내용이 있는지 모르기에 a를 선언할 수 있다.
		int a = 0;
		{
			// main의 입장에서는 코드 블럭이 있고 내가 처리할것이지만 내용은 모른다.
			// 위의 코드블럭과 아래의 코드블럭을 별개로 생각한다.
			// 코드 블럭 밖에 이미 int a를 선언하였기 때문에 독립적이지 않다.
			// int a 를 이미 선언했기에 선언할 수 없다.
			// main과 코드블럭은 종속적인 관계라 선언할 수 없다.
			// int a = 2;
			int b = 1;
			int result = a + b;
			System.out.println(result);
		}
	}
}
