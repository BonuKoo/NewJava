package ex08;

class Box<T>{			
	T ob;
	public void set (T o) {
		ob = o;
	}
	public T get() {
		return ob;	
	}
		
}

class SteelBox<T> extends Box<T> {
	public SteelBox(T o) {
		ob = o;
	}
}
public class BoundedGenericMethod {

	public static void main(String[] args) {
		
		Box<Integer> iBox = new SteelBox<Integer>(100);
		Box<String> sBox = new SteelBox<String>("korea");
		
		Box<Integer> iiBox = new SteelBox("kim"); // 왜 됨?
		System.out.println(iBox.get());
		System.out.println(sBox.get());
		System.out.println(iiBox.get());
	}
}
		//Box가 int타입이면 Box를 상속중인 Steel 박스도 int타입이어야 한다.
		//Box가 String 타입인 경우 Integer 타입의 SteelBox는 상속을 받지 못한다.