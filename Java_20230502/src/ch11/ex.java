package ch11;

import java.util.ArrayList;
import java.util.Collections;

class Member{
	String name;
	int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class ex {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		//num[0] = 정수형;
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		//인자값을 설정 가능
		//만약 설정해두지 않으면 내부적으로 object가 받아준다//처리해준다.
		list1.add(10);
		list1.add(20);
		list1.add(50);
		list1.add(30);
		list1.add(40);
		
		System.out.println("size: "+ list1.size());
		
		for(int i=0; i<list1.size(); i++)
			System.out.println(list1.get(i));
		
		System.out.println("-------------");
		Collections.sort(list1);
		for(int i=0; i<list1.size(); i++)
			System.out.println(list1.get(i));
	}
}
