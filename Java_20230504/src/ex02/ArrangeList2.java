package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class JustSort{
	public void sort(List<?> list) {
		Collections.reverse(list);
	}
}

public class ArrangeList2 {

	public static void main(String[] args) {
		List<Integer> is = Arrays.asList(1,3,5,7,9);
		is = new ArrayList<>(is);
		
		JustSort ju = new JustSort();
//		Consumer<List<Integer>> c = t -> ju.sort(t); //매개변수 t
		Consumer<List<Integer>> c = ju::sort; //매개변수 t		
		c.accept(is);
		System.out.println(is);
	}
}

//정수 객체를 받는 list . is , 안에 현재 1,3,5,7,9가 들어가있다.
// is의 참조값을 , 안에 13579가 들어가있는 ArrayList 주소값으로 변경
// 이제 값을 마음 껏 추가 할 수 있음.

// ju는 클래스 JustSort의 참조값. JustSort에 접근이 가능해
//consumer는 accept 사용 가능.     매개변수가 있고, 반환값이 없다.
//이 컨슈머 c의 매개변수가 t야. 이 t는 Integer 타입의 List의 주소값
//JustSort 안에 있는 sort를 사용하면 , Collection 클래스의 reverse 매서드를 사용한다.
// 근데, 이 reverse 매서드는 List의 list를 값으로 받는다.
// t는 Integer 타입만을 받는 List니까, sort의 매개변수로 가능
// Consumer 를 호출, 내장된 accept 매서드를 사용해서, 인자값을 1,3,5,7,9가 들어있는 Integer 타입의 List로 받아냄
// 