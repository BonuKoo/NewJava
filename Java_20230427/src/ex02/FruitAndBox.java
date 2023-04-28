package ex02;
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

class Applebox{ //사과 담는 박스
	private Apple ap;
	public Apple getAp() {
		return ap;
	}

	public void setAp(Apple ap) {
		this.ap = ap;
	}
}

class OrangeBox{ //오렌지 담는 박스
	private Orange or;

	public Orange getOr() {
		return or;
	}

	public void setOr(Orange or) {
		this.or = or;
	}
}

public class FruitAndBox {
	public static void main(String[] args) {

		Applebox aBox = new Applebox();
		OrangeBox oBox = new OrangeBox();
		
		aBox.setAp(new Apple());
		oBox.setOr(new Orange());
		
		Apple a = aBox.getAp();
		Orange o = oBox.getOr();
		System.out.println(a);
		System.out.println(o);
	}
}
