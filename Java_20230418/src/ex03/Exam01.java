package ex03;
//멤버변수는 
class Member{	//접근제어자 private(캡슐화)를 넣는 순간, 멤버 안에서만 사용이 가능.  
	private String name;
	private int age;
	
	//디폴트 생성자는 자바가 직접 생성한다. 다만 개발자가 생성자를 생성하지 않는 경우에만 생성해준다.
	//개발자가 직접 생성자를 만든 경우는 자바가 따로 생성자를 만들어주지 않는다.
	
	//생성자 : 반환타입x, 클래스 이름과 같다. 생성자는 오버로딩이 가능하다.
	//생성자 : 초기화 기능을 가지고 있다.
	public Member(String n, int a) { //생성자 Member를 s1, s2에 
		name = n;					// 생성자는 디폴트다. 만들지 않아도 자바가 메모리 내에 알아서 생성
//		if(a>=0 && a<=120)
		age  = a;
//		else
//		age  = 1;
	}
	public Member() {
		name = "미정의";
		age = 0;
	}
	public Member(String n) {
		name = n ;
		age = 2;
	}
//-------------------------------------------------------------------	
	void display() {
		System.out.println(name + ", " + age);
	}
//-------------------------------------------------------------------	
	void setData(String n, int a) { //멤버의 속성을 차단했으므로 새로운 값을 넣기 위해 함수를 만든다.
		name = n;
		if(a>=0 && a<=120)
			age  = a;
		else
			age  = 1;
			
	}
//-------------------------------------------------------------------	
}	
//-------------------------------------------------------------------
//정적변수,정적메소드는 공유자원이면서 지들끼리만 데이타를 주고 받을 수 있다.

public class Exam01 {

	public static void main(String[] args) {
		
		Member s1 = new Member("구본우",26);//호출함수가 없어도
										  //지가 먼저 '생성자'를 찾는다.
										  
		Member s2 = new Member("추명선",26);
		s1.display();
		s2.display();
		
		Member s3 = new Member(); // 만약 위에 public Member(){}를 만들어준다면, 이 생성자로 대입이 된다. 
		s3.display();
		
		Member s4 = new Member("이성진");
		s4.display();
	}
}
