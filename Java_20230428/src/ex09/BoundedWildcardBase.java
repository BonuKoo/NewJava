package ex09;

class Box<T> {          //box ob 0x100
	private T ob;				

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
	public static void outBox(Box<Toy> box) {
		Toy toy = box.getOb(); //set 처리가 된다.	
		//꺼내는 기능 (getter 기능)
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
