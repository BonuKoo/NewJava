package ex10;

class Box<T> {          //box ob 0x100
	private T ob;				

	public T getOb() {
		return ob;				
	}

	public void setOb(T ob) { //현재 ob = 123
		this.ob = ob;
	}
}
//개발자 실수가 있는 부분을 컴파일 과정에서 발견될 수 있도록 매개변수를 수정하라
public class BoundedWildcardBase {
	// ? extends 
	public static void addBox(Box<? super Integer> b1, Box<? extends Integer> b2, Box<? extends Integer> b3) {
//	b3.setOb(b1.getOb()+b2.getOb());	// 개발자의 실수가 있는 부분 - 여기가 싹 다 빨간줄		
	b1.setOb(b2.getOb()+b3.getOb());	//원래 b1이 set이어야 하는데, 지금 b3이 set이다. 근데 오류는 안뜬다.		
										//오류가 뜨게 수정해라.
	} 

	
	
public static void main(String[] args) {		
		
		Box<Integer> box1 = new Box<>();
		box1.setOb(24); 		//bo1에 24가 들어간다
		Box<Integer> box2 = new Box<>();
		box2.setOb(37);			//box2에 37이 들어간다.
		Box<Integer> result = new Box<>();
		result.setOb(0);		//result 초기화 
		addBox(result, box1, box2); // result에 24+37의 결과 저장
		System.out.println(result.getOb()); //61출력
	}
//
//	Integer a = new Object(); //불가능    	Object extends Integer = 가능,
//											Object가 Integer를 참조할 수 있음 == getOb할 수 있음 
//	Object obj = new Integer();				Super = 상위 클래스로 값을 전달 할 수 있음 == setObt 가능
}
//extends는 get, super는 set 기능이다. super는 저장 기능, extends는 출력 기능
//extends는 값을 넣을 수 없고 super로는 값을 뺄 수 없다