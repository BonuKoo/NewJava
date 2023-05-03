package ex01;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AsListCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		list.add("aaa");
		
		List<String> list2 = Arrays.asList("Toy","Box","Robot","Box");
		List<String> lis = new ArrayList(list2);
		
//		list2.add("bbb"); //오류, asList로 한번 배열을 만들면, 배열 크기를 변경 할 수 없다. //직접은 추가가 안된다.
		lis.add("bbb"); //오류, asList로 한번 배열을 만들면, 배열 크기를 변경 할 수 없다. //직접은 추가가 안된다.
		
//		for ( String str : list2)
//			System.out.println(str);
//		
		for (String str : lis) 			//lis에 list2의 주소값을 불러온 다음 , lis에 값을 추가하는 것은 가능
			System.out.println(str);
		}
}
//응애 무릎 아파
