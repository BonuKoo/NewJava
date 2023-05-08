import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ArrangeList {

	public static void main(String[] args) {
		List<Integer> is = Arrays.asList(1,3,5,7,9);
		//is.add(10); 어레이 - 배열은 이미 짜놓으면 추가 불가
	is = new ArrayList<>(is); //어레이리스트를 만들고 is를 참조
	is.add(11);
	
	System.out.println(is);
	
//	Consumer<List<Integer>> c = t -> Collections.reverse(t); //뒤집음
	Consumer<List<Integer>> c = Collections::reverse; 
									//클래스 이름 ::매서드
	c.accept(is);			//void accept(List<Integer>t){Collections.reverse(t)}
	System.out.println(is);
	
	
	
	}

}
