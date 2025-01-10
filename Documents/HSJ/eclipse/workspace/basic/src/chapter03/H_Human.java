package chapter03;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class H_Human {

	public static void main(String[] args) {
	
	
		class Human{
			String name;
			String address;
			int age;
		}
	
		Human human1 =  new Human();
		human1.name = "이성계";
		human1.address = "개성";
		human1.age = 30;
		// {name = 이성계, address = 개성, age = 30}
	
		Map<String, Object> human2 = new HashMap<>();
		human2.put("name", "이성계");
		human2.put("address", "개성");
		human2.put("age", 30);
		
		System.out.print(human1.name + " ");
		System.out.print(human1.address + " ");
		System.out.println(human1.age);
		System.out.println(human2);
		
		// 1. 문제점 : 사용 혹은 추가 작업에 실수 발생 가능
		// 키의 값을 모를수 있다, 번거로워 질 수 있다.
		System.out.println(human2.get("Name"));
		System.out.println(human2.get("name"));
		// 2. 문제점 : 타입의 안정성의 문제
		// Type mismatch: cannot convert from Object to int
		// int age = human2.get("age");
		// 가능은 하나 오류가 발생할 수 있다.
		int age = (int)human2.get("age");
		System.out.println(age);
		// int age = (int)human2.get("Age");
		
		// 3. 문제점 : 데이터의 무결성 보당 안됨
	}

}
