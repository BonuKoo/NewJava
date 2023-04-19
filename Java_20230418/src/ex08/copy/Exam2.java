package ex08.copy;
class A{
	int a ; 
	int c = 100;
	A(int a , int c){				//super(a,b)에서 온 1,2를 대입
		this.a = a;
		this.c = c;
	}
	A(){}
	void func() {
		System.out.println("func()");
	}
}
class B extends A{
	int b ; 
	int c = 200;
	
	B(){		//B내에 매개변수가 필요없는 메서드를 생성했을 때, 부모 클래스인 A에 
		super(1,2); //A에 눈에 보이지 않는 생성자를 디폴트로 생성해준다.
	}			//그리고 상위 클래스로 갔다와서 다시 인스턴스 내 코드를 작업
	B(int a, int b){		//B(1,2)를 이곳에 대입
		super(a,b); //		//이 a,b를 상위 클래스에 넣는다.
	}
				
	void func2() {
		System.out.println("func()");
	}
}

class C extends A{
	int k;
	void func3() {
		System.out.println("func3()");
	}
}

class D extends B{			//D는 B와 A를 다 사용 가능 //단, 생성자는 제외.
	int d;
	void func4() {
		System.out.println("func4()");
	
}
}
public class Exam2 {

	public static void main(String[] args) {
		
		B b = new B(1,2); //B(1,2)의 값을
		b.a = 10;
		b.b = 20;
		b.func();
		b.func2();
		
		System.out.println(b.c);
		System.out.println("--------------");
		
		A a = new A();
		a.a = 1;
		a.c = 2 ;
		a.func();
		
		System.out.println("--------------");
		
	}

}
