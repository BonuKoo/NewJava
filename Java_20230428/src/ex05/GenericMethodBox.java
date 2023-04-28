package ex05;

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
	public static void peekBox(Box<? super Integer> box) { //하한을 제한 :: Integer 위만 된다.
//	public static void peekBox(Box<? extends Number> box) { //상한 제한
//	public static <T> void peekBox(Box<?> box) {
			
		System.out.println(box.getOb());
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {
		Box<Integer> iBox = new Box<>();
		iBox.setOb(123);
		
		Box<Double> dBox = new Box<>();
		dBox.setOb(123.124);
		
		Unboxer.peekBox(iBox);
//		Unboxer.peekBox(dBox);
//		
		Box<Object> sBox = new Box<>();
		sBox.setOb("korea");
		Unboxer.peekBox(sBox); //Super로 하한제한을 두고 있는 경우엔 Box<String>일 땐 불가능
//Unboxer.peekBox(sBox); 에러 //peekBox를 extends Number로 제한해둬서 String은 안됨
		
	}


}
