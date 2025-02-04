package chapter03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class C_Package2 {

	public static void main(String[] args) {
		/*
		// Collection Framework : Java에서 데이터 구조에 대한 표준화된 기법을 제공한다.
		
		// List : 데이터를 저장할 때 중복을 허용하고, 순서가 존재하는 데이터 구조
		// 중복(o), 순서(o)
		// Collection Framework에서 데이터 타입을 지정할 땐 제너릭을 사용하여 지정한다.
		// <> : 데이터 타입 지정, 제너릭
		// 제너릭(Generic)은 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법
		// 참조형 데이터 타입을 가져와서 지정해줘야 한다. ( int 불가 )
		// Integer가 들어가야한다.
		List<Integer> list;
		
		// ArrayList 구현 클래스 : 인덱스를 이용한 작업을 수행할 때 유리
		// 일반적인 배열의 형태이다.
		// Integer을 지워도 정상적으로 동작을 하긴하지만, 
		// 아주 정확하게 작업을 하려 한다면 있는것이 좋다.
		// list = new ArrayList<Integer>();
		
		list = new ArrayList<>();
		
		// LinkedList 구현 클래스 : 데이터 추가, 삭제 작업을 수행할 때 유리
		// list = new LinkedList<Integer>();
		
		list = new LinkedList<>();
		
		// add() : List에 요소를 추가
		// 추가할 요소는 제너릭으로 지정한 데이터 타입의 요소여야 한다.
		// Integer로 지정했기에 정수만 가능하다.
		list.add(10);
		// new를 사용했기에 주소가 들어가있음
		System.out.println(list);
		
		// 문자열이기 때문에 들어가지 않는다.
		//list.add("12");
		
		list.add(20);
		System.out.println(list);
		// 길이를 걱정하지 않아도 된다.
		
		// 인덱스 위치 지정해서 삽입
		// list.add(인덱스 번호, 넣을 값);
		list.add(1, 5);
		System.out.println(list);
		
		// get() : 특정 인덱스 요소를 가져온다.
		// List의 인덱스 범위를 초과하지 않도록 주의
		// list.get(5);
		list.get(1);
		// 기본형 데이터 타입의 변수로 리스트의 요소를 받을 땐 null이 올수 있음을 주의해야한다.
		Integer integer = list.get(0);
		System.out.println(integer);
		
		// set() : List의 특정 인덱스 요소를 변경
		// List 인덱스를 범위를 벗어난 인덱스를 짖어할 수 없다.
		list.set(1,-20);
		System.out.println(list);
		
		// remove() : List의 특정 인덱스 요소를 제거
		list.remove(0);
		System.out.println(list);
		
		List<String> fruitsList = new ArrayList<>();
		// add : 추가
		fruitsList.add("사과");
		fruitsList.add("바나나");
		fruitsList.add("카카오");
		
		System.out.println(fruitsList);
		
		// remove : 제거
		fruitsList.remove("바나나");
		System.out.println(fruitsList);
		
		// size() : List의 크기를 반환
		System.out.println(list.size());
		System.out.println(fruitsList.size());
		*/
		// int[][] ->  List<List<Integer>>
		
		// set : 데이터를 저장할 때 증복을 허용하지 않고, 순서가 존재하지 않는 데이터 구조
		// ( 중복x, 순서x), 인덱스를 다루지 않는다.
		// Set<E>
		Set<String> set;
		
		// HashSet 구현 클래스 : 검색이 빠르다.
		// set = new HashSet<String>(); 
		// String 생략 가능
		set = new HashSet<>();
		
		// TreeSet 구현 클래스 : 요소를 정렬해서 추가
		// set = new TreeSet<String>();
		// String 생략 가능
		set = new TreeSet<>();
		
		// TreeSet 구현 클래스 이기 때문에 정렬해서 나온다.
		// add() : Set에 요소를 추가, 만약 동일한 요소가 존재한다면 추가하지 않는다.(중복x)
		set.add("banana");
		System.out.println(set);
		set.add("apple");
		System.out.println(set);
		set.add("banana");
		System.out.println(set);
		
		// contains() : Set에 특정 요소가 존재하는지 확인
		System.out.println(set.contains("banana"));
		System.out.println(set.contains("banana1"));
		
		// remove() : Set의 특정 요소를 제거
		System.out.println(set);
		set.remove("banana");
		System.out.println(set);
		
		// List와 Set을 적절히 사용하면 List의 중복 제거 및 정렬을 손쉽게 수행할 수 있다.
		List<Integer> list;
		list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(4);
		System.out.println(list);
		
		// Set<Integer> set = new HashSet<>(매개변수);
		Set<Integer> set1 = new HashSet<>(list);
		System.out.println(set1);
		list = new ArrayList<>(set1);
		System.out.println(list);
	}
}
