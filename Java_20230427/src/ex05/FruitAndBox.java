package ex05;
class Apple{ //사과
	
	public String toString() {
		return "I am apple";
	}	
}

class Orange{ //오렌지
	public String toString() {
		return "I am an orange";
	}
}

class Box<T>{ //박스   // T : 자료형이 아직 정해져있지 않다
	private T obj;
	
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}


public class FruitAndBox {
	public static void main(String[] args) {

	Box <Apple> aBox = new Box<Apple>();
	Box <Orange> oBox = new Box<Orange>();
	
	aBox.setObj(new Apple()); 
	oBox.setObj(new Orange());					  
							
						
	Apple ap =  aBox.getObj();
	Orange op = oBox.getObj();
//	
	System.out.println(ap);
	System.out.println(op);
	
	System.out.println(aBox.getObj());
	System.out.println(oBox.getObj());
	
	}
}
