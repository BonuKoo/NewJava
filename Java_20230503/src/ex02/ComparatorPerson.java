package ex02;

import java.util.ArrayList;
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
//
public class ComparatorPerson {

	public static void main(String[] args) {
		TreeSet<Person> list = new TreeSet<>();
		
		list.add(new Person("kim",26));
		list.add(new Person("park",21));
		list.add(new Person("yoon",36));
		list.add(new Person("Lee",32));
		
		for(Person p : list)
			System.out.println(p);
	}

}
//응애는 무릎이 아파~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//으아앙거망;ㅓㄱ마니러마닝ㄹ미ㅏ어리;머라미ㅓㄹ망ㄹ미러미러미ㅓㄹ 멀 미;ㅓㄻ 내 무르퍼 ㅇㄹ;ㅓ 망ㄹ;ㅓ ㅏㅁ;ㅓ ;ㅣㄹㄹ