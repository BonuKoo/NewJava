package ex02;

public class AExam {

	public static void main(String[] args) {
	
		A a = new A();
		System.out.println("-----------------");
	
		A.B b = a.new B();
		
		a.new B();
		a.method();
		b.test();
		
	}
}
