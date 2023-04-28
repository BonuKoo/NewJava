package ex09.copy;

class Box<T> {          //box ob 0x100
	private T ob00;				

	public T getOb() {
		return ob;				
	}

	public void setOb(T ob) { //현재 ob = 123
		this.ob = ob;
	}
}

class Toy{
	public String toString() {
		return "I am a Toy()";
	}
}

class BoxHandler{ 
	
	//outBox 용도는 get 기능 역할만 담당
	public static void outBox(Box<? extends Toy> box) { // extends는 get, super는 set 기능이다. 
		Toy toy = box.getOb(); //set 처리가 된다.			//  extends는 값을 넣을 수 없고 super로는 값을 뺄 수 없다
		//꺼내는 기능 (getter 기능)
		box.setOb(new Toy());    //? extends Toy를 쓰니까 이제 setter 기능이 안먹힌다.
		System.out.println(toy);
	}
	
	public static void inBox(Box<Toy> box, Toy n) { // n : 0x 200
		box.setOb(n); //넣는 기능 (setter 기능) // getter 기능은 못하게 바꿔라 !
	}
}

public class BoundedWildcardBase {
	public static void main(String[] args) {		
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	}
}
