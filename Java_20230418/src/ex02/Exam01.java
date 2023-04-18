package ex02;
//멤버변수는 
class Member{	//접근제어자 private(캡슐화)를 넣는 순간, 멤버 안에서만 사용이 가능.  
	private String name;
	private int age;
	
	void display() {
		System.out.println(name + ", " + age);
	}
	
	void setData(String n, int a) { //멤버의 속성을 차단했으므로 새로운 값을 넣기 위해 함수를 만든다.
		name = n;
		if(a>=0 && a<=120)
			age  = a;
		else
			age  = 1;
			
	}
}	

//정적변수,정적메소드는 공유자원이면서 지들끼리만 데이타를 주고 받을 수 있다.

public class Exam01 {

	public static void main(String[] args) {
		
		Member s1 = new Member();
		s1.setData("구본우", 30);
//		s1.name = "구본우";
//		s1.age = 29;
		
		Member s2 = new Member();
		
//		s2.name = "추명선";
//		s2.age = 29;
		
		s1.display();
		s2.display();
	}
}
