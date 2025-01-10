package chapter01;

public class J_Jogun {
	public static void main(String[] args) {
		
		// 대한민국, 성인(age > 19), 남성 - 현역
		String country = "대한민국";
		int age = 23;
		String gender = "남성";
		boolean isActive = country.equals("대한민국") && (age > 19) && gender.equals("남성");
		if(!isActive) return;
			System.out.println("현역");
	
	}
}
