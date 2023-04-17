package ex04;
class Data{ int x;}

public class ReferenceParamEx {
	
	public static void main(String[] args) {
		Data d = new Data(); //class Data의 새로운 인스턴스, d 생성
		d.x= 10;			 //이 d의 매개변수 값은 10
		System.out.println("main() : x =" +d.x); //main():x의 값은 10
	
		change(d);			//정태적 객체, static change는 public 밖에 있지만 static이라 늘 활동한다. 	
							
		System.out.println("After change(d)");
		System.out.println("main() : x = " +d.x);
	}

	static void change (Data d) { //위에 있던 class Data d의 값 10
		d.x = 1000;				  // data d의 값 10을 1000으로 바꾼다.
		System.out.println("change () : x = " +d.x); // 이제부터 change () 
}

}
