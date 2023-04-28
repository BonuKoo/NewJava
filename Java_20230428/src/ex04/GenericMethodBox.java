package ex04;

//class A {
//	int a ;
//	byte aa;
//	short aaa;
//	long aaaa;
//	
//	A (int a) {
//		this.a = a;
//	}
//	A ( a) {
//		this.a = a;
//	}
	
//} // A는 정수
//class B {
//	float bb;
//	double b;
//	B (float bb){
//		this.bb = bb;
//	}
//	B (double b){
//		this.b = b;
//	}

//} // B는 실수
//class C {
//	
//} // C는 wrapping처리한 '수'
class A{}
class B extends A{}
class C extends B{}

class Box<T extends A> { //Box에 A, B, C만 들어갈 수 있게 
	private T ob;				

	public T getOb() {
		return ob;				//ob 123
	}

	public void setOb(T ob) { //현재 ob = 123
		this.ob = ob;
	}
}

class Unboxer{
	public static <T extends A> T openBox (Box<T> box) { 
		return box.getOb();  //box 클래스의 getOb를 실행
	} 
}



public class GenericMethodBox {

	public static void main(String[] args) {
		
		Box<C> cbox = new Box<C>(); // Box<T>에서 정수형,실수형으로 제한을 했기 때문에 문자열인 string은 안된다. 
		
		//abox = new Box<B>(); // 에러.. 상속관계라서 참조가 될 것 같지만, 되지 않는다 !!!!
		
		
		
		
		
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

