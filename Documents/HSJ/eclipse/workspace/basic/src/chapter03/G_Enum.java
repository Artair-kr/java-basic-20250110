package chapter03;

import java.time.LocalDateTime;
import java.time.Month;

// 열거형(enum) : 서로 관련된 상수들의 집합을 나타내는 특수한 클래스이다.
// enum 열거형타입이름 { 상수... }
// 상수 : 한 번 값을 설정한 후, 그 값을 변경할 수 없는 변수
enum Color1 {
	// 지정하고자하는 상수를 ,로 나열
	RED, ORANGE, YELLOW, GREEN, BLUE, NAVY, PUPLE
}
enum Color2{
	// 생성자 호출을 열거된 상수 위치에서 호출함
	RED("#ff0000", "rgb(255, 0, 0)"), 
	GREEN("#00ff00", "rgb(0, 255, 0)"), 
	BLUE("#0000ff", "rgb(0, 0, 255)");
	
	// 열거형도 클래스이기 때문에 필드, 생성자, 메서드를 모두 가질 수 있다.
	// enum의 필드는 상수로 사용되기 때문에 변경되면 안된다.
	// 캡슐화 작업이 필요하다.
	
	// 필드
	private final String hex;
	private final String rgb;
	
	// 생성자 : 생성자(Constructor)는 자바에서 객체가 생성될 때 호출되는 특별한 메서드
	// 생성자는 반환값이 없으며, 그 이름이 클래스의 이름과 동일
	// 매개변수화된 생성자 (Parameterized Constructor):
	// 매개변수화된 생성자는 인스턴스를 생성할 때 값을 전달하여 객체를 초기화할 수 있게 해준다.
	
	// 생성자의 접근제어자 private
	// 인스턴스 생성 자체를 외부에서 못하도록 막는다.
	private Color2(String hex, String rgb){
		this.hex = hex;
		this.rgb = rgb;
	}
	public String getHex() {
		return hex;
	}
	public String getRgb() {
		return rgb;
	}
}
public class G_Enum {
	public static void main(String[] args) {
		
		// Color1 : Color1은 enum 타입의 이름이지만, 클래스처럼 행동한다.
		Color1 color1 = Color1.RED;
		System.out.println(color1);
		
		// 열겨형을 사용하면 조건(동등 비교만)에 편하게 사용가능
		if(color1 == Color1.RED) {
			System.out.println("빨간색");
		}
		
		// 열거형을 사용하면 상수를 묶음으로 관리할 수 있다.
		Color2 color2 = Color2.BLUE;
		System.out.println(color2);
		//System.out.println(color2.hex);
		//System.out.println(color2.rgb);
		System.out.println(color2.getHex());
		System.out.println(color2.getRgb());
		
		Color2 color3 = Color2.GREEN;
		System.out.println(color3);
		System.out.println(color3.getHex());
		System.out.println(color3.getRgb());
		//System.out.println(color3.hex);
		//System.out.println(color3.rgb);
		
		// 변경이 되면 안되는데 변경이 된다.
		// 캡슐화가 필요하다.
		//color2.hex = "#000099";
		//System.out.println(color2.hex);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		Month month = localDateTime.getMonth();
		System.out.println(month);
		
		switch(month) {
		case Month.APRIL:
			System.out.println("작업");
		
		}
	}
}
