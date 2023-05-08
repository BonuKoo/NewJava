import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lambda {
@FunctionalInterface
	interface A{	//@FunctionalInterface를 쓰는 순간
					//해당 인터페이스엔 메서드가 하나만 존재 할 수 있게 된다.
					//-> 이 인터페이스가 '람다식'이라는 것을 확신하게 나타낼 수 있게 된다.
		int max(int a, int b);
		
}
	
	interface B{ 	// 근데 람다식 구현하게 된다면 메서드 2개일 시 뻑나니까
					// 람다식 쓸 일 있다면 그냥 @FunctionalInterface 붙여두자. 구분하기 편하게
		void printVar(String name, int i);
	}

	interface C{
		int square(int x);
	}
	
	interface D{
		int roll(); //매개변수 없고 반환타입은 있다
	}
	
	interface E{
		int sumArr(int[] arr);
	}
	
	public static void main(String[] args) {
		
//		A aa = (a,b) ->  a>b ? a:b;  // = 말고 -로 해야함
//		
//		System.out.println(aa.max(10,5));
//		
		BiFunction<Integer, Integer, Integer> bi = (a,b) -> a>b ? a:b ;
		System.out.println(bi.apply(20, 30));
		
		B bb = (name,i) -> {System.out.println(name + "="+i);};
		BiFunction<String, Integer, String> bi2 = (name,i) -> "이름은 " + name + "이고, 나이는 " + i + "입니다" ;
		System.out.println(bi2.apply("응애", 1));
//		bb.printVar("김두한", 35);
//		System.out.println(bb); //bb의 주소값이  출력이 됨 신기하다
		
		BiConsumer<String, Integer>  bi3 = (name,i) -> System.out.println(name + "=" +i);
		bi3.accept("애웅", 2);
		
		C cc = x -> x * x;
		System.out.println(cc.square(3));
	
		D dd = () -> (int)(Math.random()*6);
		System.out.println(dd.roll()); 
		Supplier<Integer> bi4 = () -> (int)(Math.random()*6);  
		System.out.println("----");
		System.out.println(bi4.get());
		System.out.println("----");
		
//		E ee = (int[] arr) -> {
//		int sum = 0;
//		for(int i : arr) 
//		sum += i;	//i의 값을 끊임없이 sum에 더 함 
//		return sum;
//		};
		int [] arr = {3,2,1};
//		System.out.println(ee.sumArr(arr));
		Function<int[],Integer> bi5 = (arr2) -> 
		{int sum = 0;
		for(int i : arr)
		sum +=i;
		return sum;};
		int num2 = bi5.apply(arr);
		System.out.println("num2:" + num2 );
		//함수형 인터페이스 : 인터페이스에 함수가 하나 존재한다 -> 람다로 쓸 수 있다. 왜냐면 인터페이스에 함수가 하나만 존재해야 람다를 사용 할 수 있기 때문에
	
	}
}