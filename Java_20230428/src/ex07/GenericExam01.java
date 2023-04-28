package ex07;


class A{}
class B extends A{}
class C extends B{}

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
	public static void peekBox(Box<? extends B> box) { //상한 제한 , B를 상속한 자손은 다 가능
		System.out.println(box.getOb());
	} 
}
public class GenericExam01 {

	public static void main(String[] args) {
		Box<A> abox = new Box<>();
		Box<B> bbox = new Box<>();
		Box<C> cbox = new Box<>();
		
//		Unboxer.peekBox(aBox);
		Unboxer.peekBox(bbox);
		Unboxer.peekBox(cbox);
		
		
		//Super로 하한제한을 두고 있는 경우엔 Box<String>일 땐 불가능
//Unboxer.peekBox(sBox); 에러 //peekBox를 extends Number로 제한해둬서 String은 안됨
		
	}


}
