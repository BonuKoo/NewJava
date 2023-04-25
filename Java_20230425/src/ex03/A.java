package ex03;

public class A {
	
	static class B{
		B(){System.out.println("B객체생성");}
	}
	
	static class C{
		C(){System.out.println("C객체 생성");}
	}
	
	B field = new B();
	C field2 = new C();
	
	A(){
		B b = new B();
		System.out.println("A객체생성");
	}
	
	void method() {
		B b = new B();
	}
	
	static void method2(){
		B b = new B();
	}
}
