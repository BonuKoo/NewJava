package ex06;

class Box<T> { 
	private T ob;				

	public T getOb() {
		return ob;				
	}

	public void setOb(T ob) { //현재 ob = 123
		this.ob = ob;
	}

}
 

//class swap extends Box{ //swap을 Box<T>로부터 상속받기
////
//	Box box1; //box1의 주소값을 받아줄 변수
//	Box box2; //box2의 주소값을 받아줄 변수
//	Box tmp;  //Box tmp 주소값을 받아줘서 서로 교환
//	
//	//box1객체와 box2객체의 주소값을 서로 교환
//	//box1 인스턴스와 box2 인스턴스,  tmp를 하나 만들고
//	// 1에 2값을, 2에 tmp값을, tmp에 1값
//	
//	public swap(Box box1, Box box2, Box tmp) { 
//		super();
//		this.box1 = box1;
//		this.box2 = box2;
//		this.tmp = tmp;
//	}
//	
//	void swapBox(Box box1, Box box2) {
//		box1.getOb();//ob를 반환값으로
//		box2.setOb();// ob가 들어가면, 변수 ob에 방금 set ob를 통해 들어간 ob값을 대입
//		
//		}
//	} //swap 끝
	
	
	
//	@Override
//	public String toString() { 
//		return "swap [box1=" + box2 + ", box2=" + box1 + "]";
//	}
//	

////	public static <T> T swapBox (Box<T> box1,Box<T> box2) { 
//		
		
		
		//box1의 ob 주소값과, box2의 ob 주소값을 서로 교환하라.

public class GenericMethodBox {

	public static void main(String[] args) {
		
		Box<Integer> box1 = new Box<Integer>(); // Box<T>에서 정수형,실수형으로 제한을 했기 때문에 문자열인 string은 안된다. 
		box1.setOb(99);
		Box<Integer> box2 = new Box<Integer>();
		box2.setOb(55);
		//99&55
		System.out.println(box1.getOb() + "&" + box2.getOb());
		
		Box<Integer> boxTmp = new Box<Integer>();
		boxTmp.setOb(0);
		
		swapBox(box1,box2);
		//55&99
		System.out.println(box1.getOb() + "&" + box2.getOb());
	
		Box<String> box3 = new Box();
		Box<String> box4 = new Box();
		swapBox(box3, box4);
	}

 //선생님 답안
	static <T extends Number > void swapBox(Box<T> box1, Box<T> box2) {
	
	Box<T> tmp= new Box<T>();
	tmp.setOb(box1.getOb()); //tmp에 setOb의 주소값에 box1의 주소값이 들어가있고
	box1.setOb(box2.getOb());//box1에 box2가 들어가있고
	box2.setOb(tmp.getOb()); //box2에 tmp가 들어가있다

	
	}


}
