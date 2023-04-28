package ex08;


class A{}
class B extends A{}
class C extends B{}
class D extends B{}
class Box<T> { 
	private T ob;				

	public T getOb() {
		return ob;				
	}

	public void setOb(T ob) { //현재 ob = 123
		this.ob = ob;
	}
}

class Unboxer{
	public static void peekBox(Box<? super B> box) { //하한 제한 
		System.out.println(box.getOb());
	} 						
}
public class GenericExam01 {

	public static void main(String[] args) {
		Box<A> abox = new Box<>();
		Box<B> bbox = new Box<>();
		Box<C> cbox = new Box<>();
		Box<D> dbox = new Box<>();
		Box<Object> ibox = new Box<>();
		
		Unboxer.peekBox(abox); //가능
		Unboxer.peekBox(bbox); 
//		Unboxer.peekBox(cbox); 에러 :: a 위만 된다.
//		Unboxer.peekBox(dbox); 에러 :: a 위만 된다.
		Unboxer.peekBox(ibox); //Integer일 땐 불가능, Object일 땐 가능
							   //Object는 모든 타입의 조상
		//Super로 하한제한을 두고 있는 경우엔 Box<String>일 땐 불가능
//Unboxer.peekBox(sBox); 에러 //peekBox를 extends Number로 제한해둬서 String은 안됨
		
	}


}
