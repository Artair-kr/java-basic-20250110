package chapter03;

import java.util.Random;

public class R_Random2 {
	public static void main(String[] args) {
		Random random = new Random();
		boolean randomBoolean = random.nextBoolean();
		System.out.println(randomBoolean);
	}
}
