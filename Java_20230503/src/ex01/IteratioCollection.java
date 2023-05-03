package ex01;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratioCollection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
//		for(String st : list ) //MZ식 for문으로 출력 가능
//			System.out.println(st);
//	
		Iterator<String> it = list.iterator(); //iterator string type
		while(it.hasNext()) {
			String st = it.next();			//
			System.out.println(st);
		}	// start-> hasNext -Toy, it에 Toy를 설정. 출력)  next로 넘어감(Box) -> Box를 출력-> (있으니 true) -> 
	
		System.out.println("-------------");
		
		it = list.iterator(); // 다시 출력하고 싶다면 반복자를 다시 써줘야함. 위 반복자에서 이미 Box 이후 it는 null값을 가리키고 있다.
		while(it.hasNext()) {
			String st = it.next();
			System.out.println(st);
		}
			
		it = list.iterator(); //Box만 삭제하고 싶다
		while(it.hasNext()) {
			String st = it.next();
			if(st.equals("Box"))
				it.remove();
		}
		
		}
}
//응애 무릎 아파
