package ex04;
							//public은 하나만 존재해야 한다 class Exam01 { 		//파일명은 public class와 같아야 한다.
class Member{
	int age ;		//멤버변수, 인스턴스 변수
	static int num ; //클래스변수, 정적변수, 공유변수
	
}

class Member2{
	int age;
	static int num;
}



public class MemberTest{		
	public static void main(String[] args) {
		
		Member m = new Member();
		
		m.age=20;
		m.num=30;
		
		Member m2 = new Member();
				
		
		m2 = m;
		
		m2.age = 50;
		
		System.out.println(m.age);
		System.out.println(m2.age);
	}
}



