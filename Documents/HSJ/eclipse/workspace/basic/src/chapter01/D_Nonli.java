package chapter01;

public class D_Nonli {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean result = a || b;
		System.out.println(result);
		boolean c = true;
		boolean d = true;
		boolean result2 = c || d;
		System.out.println(result2);
		
		boolean a1 = true;
		boolean b1 = false;
		boolean result6 = a1 && b1;
		System.out.println(result6);
		
		boolean c2 = true;
		boolean d2 = true;
		boolean result5 = c2 && d2;
		System.out.println(result5);
		
		boolean e = true;
		boolean result3 = !e;
		System.out.println(result3);
		
		boolean f = false;
		boolean result4 = !f;
		System.out.println(result4);
		
		boolean booleanResult  = !true;
		// 논리 AND 연산자 ( && ) : 좌항과 우항이 모두 true일 경우에 true를 반환한다.
		System.out.println(booleanResult);
		
		boolean booleanResult2  = true;
		System.out.println(!booleanResult2);
		
		boolean booleanResult3  = !true;
		System.out.println(!booleanResult3);
		
		boolean booleanResult4  = (a == b) && (c == d);
		System.out.println(!booleanResult4);
	}
}
