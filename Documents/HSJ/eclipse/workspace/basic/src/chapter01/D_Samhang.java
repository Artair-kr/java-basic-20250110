package chapter01;

public class D_Samhang {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int max = (a > b) ? a : b;
		System.out.println(max);
		
		int a2 = 20;
		int b2 = 20;
		int max2 = (a2 > b2) ? a2 : b2;
		System.out.println(max2);
		
		int a3 = 30;
		int b3 = 20;
		int max3 = (a3 > b3) ? a3 : b3;
		System.out.println(max3);
		
		String resultString = true ? "참" : "거짓";
		System.out.println(resultString);
		
		String resultString2 = false ? "참" : "거짓";
		System.out.println(resultString2);
	}
}
