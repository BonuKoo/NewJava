package ex02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Num{
	private int num;
	public Num(int num) {
		this.num=num;
	}
	@Override
	public String toString() {
		return String.valueOf(num); //"10" num+
	}
	
	
}

public class HshSetCollection {

	public static void main(String[] args) {
		
		Set<Num> set = new HashSet<>();
		
		set.add(new Num(10)); 		// add를 통해서 기준없이 걍 저장이 됨.
		set.add(new Num(20)); 		// add를 통해서 기준없이 걍 저장이 됨.
		set.add(new Num(10)); 		// add를 통해서 기준없이 걍 저장이 됨.
		set.add(new Num(30)); 		// add를 통해서 기준없이 걍 저장이 됨.
		set.add(new Num(20)); 		// add를 통해서 기준없이 걍 저장이 됨.
		
		 // 출력해라
		
//		ArrayList<String> pr = new ArrayList<String>(set);
//		
		//example
//		for(String s : pr)			//중복, 정렬 X
//			System.out.println(pr);	//이거 안됨 
//		
		for(String s : pr)			//중복, 정렬 X
			System.out.println(s);	//이거 안됨 
		
	}

}
