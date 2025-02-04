package chapter03;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class M_Package3 {

	public static void main(String[] args) {
		// Map : key와 value가 한 쌍으로 이루어진 요소들의 집합
		// key(키)는 중복 불가, value(값)는 중복 가능
		// Map<K, V>
		Map<String, String> map;
		
		// HashMap 구현 클래스 : 검색이 속도가 빠르다.
		// map = new HashMap<String, String>();
		map = new HashMap<>();
		
		// TreeMap 구현 클래스 : 키를 기준으로 정렬하여 저장한다.
		// map = new TreeMap<String, String>();
		map = new TreeMap<String, String>();
		
		// put() :  Map에 key와 value의 쌍을 추가
		// add와는 작업이 다르다.
		// 만약 동일한 key가 존재한다면 원래 값을 덮어씌운다.
		map.put("Apple", "사과");
		System.out.println(map);
		map.put("Banana", "바나나");
		System.out.println(map);
		map.put("Banana", "빠나나");
		System.out.println(map);
		map.put("GoldApple", "사과");
		System.out.println(map);
		
		// containsKey() : Map에 특정 키가 존재하는지 확인
		System.out.println(map.containsKey("Banana"));
		System.out.println(map.containsKey("사과"));
		
		// get() : Map에서 특정 키를 가지는 요소를 반환
		// 존재하지 않는 키로 조회하면 null을 반환
		// value로 조회 불가
		System.out.println(map.get("Banana"));
		System.out.println(map.get("banana"));
		System.out.println(map.get("빠나나"));
		// key값이 없다면 default로 입력된 값을 출력한다.
		System.out.println(map.getOrDefault("Banana", "없는값"));
		System.out.println(map.getOrDefault("banana", "없는값"));
		
		// remove() : Map에서 특정 key를 가지고 key와 value의 쌍을 삭제한다.
		// 삭제 작업에 성공하면 key에 해당하는 value를 반환
		System.out.println(map);
		// value의 값이라 실패하여 null을 출력한다.
		System.out.println(map.remove("사과"));
		System.out.println(map);
		map.remove("Apple");
		System.out.println(map);
		
	}
}
