package ex01;
//스트림을 공부하기 위해선 람다식, 
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyFirstStream {

	public static void main(String[] args) {
		int[] ar = {1,2,2,3,4,5,5,6} ;
					//
		//배열의 짝수 합을 구함, 단 중복은 제거.
		
		IntStream stm1 = Arrays.stream(ar); //배열 ar로부터 스트림 생성
		//				중복제거		짝수만 입력
		int total = stm1.distinct().filter(n-> n %2 ==0).sum(); 				
		System.out.println("total : " + total);
	
	
		//배열에서, 중복제거 후 홀수 갯수는 몇개인가? 
						//중복제거
		
		stm1 = Arrays.stream(ar);
		long count = (int)stm1.distinct().filter(n-> n%2 ==1).count();
//		int count = (int)stm1.distinct().filter(n-> n%2 ==1).count();
		//이것도 된다.
		System.out.println("홀수 갯수 : " + count);
		
		String[] names = {"kim","park","hong","lee","kor","eng","math"};
		//1.이름출력
		 Stream<String> stm2=Arrays.stream(names);
		 stm2.forEach(str -> System.out.println(str));
		 System.out.println("----------------");
		 //2. 첫글자가 k인 출력
		 stm2 = Arrays.stream(names);
		 stm2.filter(name->name.startsWith("k"))
		 .forEach(str->System.out.println(str));
		 System.out.println("----------------");
		 //3. 글자수가 4자 이상만 출력
		 stm2 = Arrays.stream(names);
		 stm2.filter(n->n.length()>=4).forEach(n->System.out.println(n));
		System.out.println("----------------");
		
		List<String> list = Arrays.asList("Toy","Box","Robot");
		Stream<String> s = list.stream();
		s.sorted().forEach(n->System.out.println(n));
		
		//2. 리스트 글자 숫자합을 출력. //11개
		s = list.stream();
		long count2 =s.map(n->n.length()).count();
		System.out.println("단어 개수 : " +count2); // 단어 수
		System.out.println("----------------");
		
		s = list.stream();
		int sum2 = s.mapToInt(n->n.length()).sum();
		//맵으로 나온 것 자체를 정수형으로 타입을 바꾼다.
		System.out.println("단어 개수 합: " +sum2);
		System.out.println("----------------");
				
		boolean t = test(10);	//이 test를 위의 stream에 놓았다고 생각하면 됨
		System.out.println(t);
		System.out.println(apply("korea"));
	}
	static boolean test (int n) {
		return n %2 ==0;
	}	
	static void acept(String str) {
		System.out.println(str);
	}
	
	static int apply(String s) {
		return s.length();
	}
}
