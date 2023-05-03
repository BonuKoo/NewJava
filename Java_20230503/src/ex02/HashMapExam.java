package ex02;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {
		HashMap<Integer, String>map= new HashMap<>();
			//		key		value
		map.put(5, "kim");
		map.put(10, "park");	//키 값 중복이라 park이 출력이 안됨.
		map.put(9, "Lee");
		map.put(10, "Hong");
		map.put(8, "park");
		map.put(1, "kim");	//key중복은 허용x value 중복은 가능
		
		System.out.println(map);
		System.out.println(map.get(9)); //이러면 키 값 9를 불러서,value lee를 출력
//		map.clear(); // map 을 초기화
		map.remove(9);
		System.out.println(map); //'9'를 삭제해서 9,lee가 사라짐
		System.out.println("-------------");
//		for(HashMap m :map);			//오류
//		System.out.println(m.get(m));	//오류
		Set<Integer> set = map.keySet();
		for(int n : set) {
			System.out.println(n);
		}
		System.out.println("-------------");
		for(int n : set) {
			System.out.println(map.get(n));
		}
	}
}