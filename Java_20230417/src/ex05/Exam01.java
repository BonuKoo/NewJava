package ex05;

//오버로딩의 조건.
//1. 함수 이름 같음, 2. 매개변수 타입이 틀려야 한다.
class Member{
	int func (int n) {
		System.out.println("int");
		return n;
	}
	double func (double d) {
		System.out.println("double");
		return d;
	}
	String func (String str) {
		System.out.println("string");
		return str;
	}
	int func (int n1 ,int n2 ) {
		
		System.out.println("int+int");
		return n1+n2;
	}
}


public class Exam01 {

	public static void main(String[] args) {
		Member m = new Member();
		
		System.out.println(10.2); //만약 10을 넣으면 , 지가 알아서 int n으로 작동
	}

}
