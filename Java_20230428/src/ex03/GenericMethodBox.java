package ex03;

class Box<T extends Number> {  // T가 불러올 수 있는 값을 정수형, 실수형으로 제한시키겠다.		
	private T ob;				

	public T getOb() {
		return ob;				//ob 123
	}

	public void setOb(T ob) { //현재 ob = 123
		this.ob = ob;
	}
}

class Unboxer{
	public static <T extends Number> T openBox (Box<T> box) { 
		return box.getOb();  //box 클래스의 getOb를 실행
	} 
}



public class GenericMethodBox {

	public static void main(String[] args) {

//		Box<String> box = new Box<String>(); // Box<T>에서 정수형,실수형으로 제한을 했기 때문에 문자열인 string은 안된다. 
		Box<Float> box = new Box<Float>();
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

//정규식 전화번호
//이메일 정규식 - 개인정보니까 모든 정보는 private

//세터 게터
//정보 담을 수 있는 배열을 만들어서 info를 담고, 배열로 출력
//유저에게 입력, 생성자
//

