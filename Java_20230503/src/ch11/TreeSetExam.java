package ch11;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExam {

	public static void main(String[] args) {

		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(8);
		set.add(2);
		set.add(15);
		set.add(5);
		
		
		
			System.out.println(set + ",");
	} //애초에 출력 자체부터 정렬이 된다 !

}
