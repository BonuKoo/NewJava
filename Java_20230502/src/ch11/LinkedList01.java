package ch11;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		LinkedList<Integer> lists = new LinkedList<Integer>();
	
		lists.add(10);
		lists.add(20);
		lists.add(30);
		
	  //int num = lists.peek();
		int num = lists.poll();  // 첫 번째 요소를 반환. LinkedList에서는 '제거'된다.
		int num = lists.remove();// 
		num = lists.remove();
		System.out.println(num);
		System.out.println(lists);
		
	}

}
