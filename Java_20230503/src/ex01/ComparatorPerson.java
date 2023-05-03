package ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class Person implements Comparable<Person>{ // 너 정렬할거니? 그럼 정렬 기준을 너가 직접 만들어
	String name;
	int age;
	public Person(String name, int age) {
	
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name +", " + age;
	}
	@Override
	public int compareTo(Person p) {
		
		return this.age- p.age; //서순이 안바뀜
	}
	
}

//class PersonComparator implements Comparator<Person>{ //인터페이스
//
//	@Override
//	public int compare(Person o1, Person o2) {
//		return o1.age - o2.age;
//		
//	}
//}

//	Collections.sort(list, new Comparator<Person>() { //익명객체
//		@Override
//		public int compare(Person o1, Person o2) {
//			return o1.age - o2.age;
//		}
//	});

//Collections.sort(list, (o1,o2)-> o1.name.length() - o2.name.lentgh()); //람다식
//Collections.sort(list, new PersonComparator());


public class ComparatorPerson {

	public static void main(String[] args) {
		List<Integer> list2 = new ArrayList<>();
		
//		list2.add(new Person("kim",26)); 
//		list2.add(new Person("park",21));
//		list2.add(new Person("yoon",36));
//		list2.add(new Person("Lee",32));
		
		list2.add(11);
		list2.add(55);
		list2.add(8);
		list2.add(99);
		list2.add(1);				//1.정수 값 입력
//		Collections.sort(list2); //   2. 컬렉션. 정렬 11부터 1까지 싹 다 정렬
		
		for(int p : list2)		// 정렬한대로 list2 를 싹 출력
			System.out.println(p);
	}
}

class PersonComparator implements Comparator<Person>{ //3 Comparator 인터페이스 구현

	@Override
	public int compare(Person o1, Person o2) {		  // compare를 재정의
		return o1.age - o2.age;						  
											
	}
}
//만약 반환 값이 0보다 작으면 o1이 o2보다 작은 것으로 판단하여 정렬 시에 o1을 먼저 위치시키고, 반환 값이 0이면 o1과 o2가 같은 것으로 판단하여 위치 변경이 필요하지 않습니다.
//반환 값이 0보다 크면 o1이 o2보다 큰 것으로 판단하여 정렬 시에 o2를 먼저 위치시키게 됩니다.

//	Collections.sort(list, new Comparator<Person>() { //익명객체
//		@Override
//		public int compare(Person o1, Person o2) {
//			return o1.age - o2.age;
//		}
//	});

//Collections.sort(list, (o1,o2)-> o1.name.length() - o2.name.lentgh()); //람다식
//Collections.sort(list, new PersonComparator());

