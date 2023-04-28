package ex01;

class Box<T>{						
	private T ob;

	public T getOb() {
		return ob;					//ob 123
	}

	public void setOb(T ob) { //현재 ob = 123
		this.ob = ob;
	}
}

class Unboxer{
	public static <T> T openBox (Box<T> box) { 
		return box.getOb();  //box 클래스의 getOb를 실행
	} 
}



public class GenericMethodBox {

	public static void main(String[] args) {

		Box<Integer> box = new Box<Integer>(); 
		box.setOb(10);
		
		Unboxer.openBox(box);						//
		
		System.out.println(box.getOb());
		
		
//		Box box = new Box();
//		box.setOb(123);	//Integer ob에 123을 집어넣은 상태
//		
////	Unboxer.openBox(box);
////	Integer tmp = Unboxer.openBox(box);
////	int num = tmp.intValue();
//		
////	Unboxer 클래스 openBox를 이용해서 ob를 꺼내서 변수에 담아서 출력해보자.
//		
//		int tmp = (Integer)Unboxer.openBox(box);
//		System.out.println(tmp);
//		
//		box.setOb(12.5);
//		double f = (Double)Unboxer.openBox(box); //setOb에 12.5가 들어있으므로 double로 형을 맞춰준다.
//		
//		box.setOb("korea");
//		String str = (String)Unboxer.openBox(box); //setOb에 korea가 들어있으므로 String으로 형을 맞춰준다.
//												   
//												 // 논리적 오류를 찾기 힘들어진다.
		
	}					
}

