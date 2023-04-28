package ex04;
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
	
	aBox.setObj("Apple"); //오브젝트라서 문자열로 넣어도 오류가 발생하지 않는 것으로 보인다.
	oBox.setObj("Orange"); // 이 경우 프로그램의 안정성이 떨어지게 된다.
						  
						// 이런 경우 , " apple " 자리에 제한을 둬야 한다 -> ex 05	
							
						
//	Apple ap = (Apple)aBox.getObj();
//	Orange op = (Orange)oBox.getObj();
//	
//	System.out.println(ap);
//	System.out.println(op);
	
	System.out.println(aBox.getObj());
	System.out.println(oBox.getObj());
	
	}
}
