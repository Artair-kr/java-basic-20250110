package chapter03;

import java.sql.Date;

// 어노테이션 : 코드의 메타데이터를 추가하는 방법
// 메타데이터 : 데이터를 설명하는 데이터
// 툴 또는 프레임워크에 특정 코드를 어떻게 해석해야 하는지에 대한 정보를 제공한다.
// 컴파일러에게 코드 작성의 의도를 알릴 수 있다.
// 실행시 특정 코드가 어떻게 동작하는지 지정할 수 있다.

// 기본적인 어노테이션 
// @Override : 재정의, 지정한 메서드가 상위 클래스의 메서드를 오버라이드하는 메서드임을 컴파일러에게 알려주는 어노테이션
// @Deprecated(사용안함) : 지정한 메서드가 더 이상 사용되지  않음을 명시한다.
// @SuppressWarnings(컴파일러 경고를 억제하는 데 사용) : 컴파일러 경고를 무시하도록 한다.


class Over{
	
	void method() {
	}
}

// 커스텀 오너테이션 : @interface를 이용하여 어노테이션을 직접 생성할 수 있다.
@interface CustomAnnotation {
	String value() default "";
}

@CustomAnnotation(value="Hello")
public class H_Annotation extends Over {
	@Override
	void method() {}
	/**
	 */
	
	@Deprecated
	static void deprecate() {}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int variable;
		deprecate();
	}
		// See Also:java.util.Calendar : Date 대신 Calendar을 사용해라
		Date date = new Date(2025, 0, 7);
}