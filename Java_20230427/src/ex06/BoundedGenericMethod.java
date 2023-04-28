package ex06;

class Box<T>{
	private T ob;
	public void set (T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
	class BoxFactory{
		public static <T extends Number> Box <T> makeBox(T o) { //Number는 모든 '수' 기본 타입을 인스턴스화 할 수 있는 wrapper의 조상클래스 
			Box<T> box = new Box<T>();	//T extends Number를 통해 지네릭 타입에 제약을 준다.
			box.set(o);					//T extends Number : Number , 실수,정수 등등의 number를 상속한 값만 T에 입력 할 수 있다.
													
			System.out.println("Boxed Data :" +o.intValue());
			return box;
		}
	}

	class Unboxer{	//double != Double double은 기본타입형     Double은 객체형으로 바꾼 형태 (wrapper)
		public static <T extends Number> T openBox(Box<T> box) {
			System.out.println("Unboxed Data : " + box.get().intValue()); //intValue를 쓰는 경우는
			return box.get();					//number형일 때만 가능 : 정수형 / 실수형 
		}										//T extends Number가 없으면 intValue에 정수형이 들어오지 않을 수도 있으니까 오류가 생긴다.
	}											//실수가 들어온 경우에도 'int'Value로 들어오면 실수값을 정수로 변환
												
public class BoundedGenericMethod {

	public static void main(String[] args) {
		Box<Double> sBox = BoxFactory.makeBox(new Double(7.77)); //sBox가 Box box의 주소값을 가리키게 됨 (BoxFactory의 return)
		double n = Unboxer.openBox(sBox);
		System.out.println("n :" + n);
	}
}
