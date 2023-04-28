package ex03;
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

class Box{ //박스
	private Object obj;
	
	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}


public class FruitAndBox {
	public static void main(String[] args) {

		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.setObj(new Apple());
		oBox.setObj(new Orange());
			
		Apple ap = (Apple)aBox.getObj();
		Orange op = (Orange)oBox.getObj();
		
		System.out.println(ap);
		System.out.println(op);
	
	}
}
