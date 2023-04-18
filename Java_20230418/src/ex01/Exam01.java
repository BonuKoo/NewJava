package ex01;

class Member{
	String name;
	int age;
	int num;
	
	static int ban = 100;
	static String ac;
	
	
	void info() {
		age = ban ; 
		ban = num ;
		}
	static void info2() {};
	static void sInfo() {
		ban = 200;
		info2();
		ac = "이젠";
		
		//num=20;
		//name "홍길동";
		//info();
		//age = 20;
	}
//정적인 변수 애들은 자기들끼리 끼리 가능
	// 근데 아직 형성되어있지 않은 인스턴스 변수는 정적인 메서드로 호출하는게 불가능하다.
	// 메모리 상에 아직 존재하지 않기 때문에 호출하는 것이 불가능
		
	
}

//정적변수,정적메소드는 공유자원이면서 지들끼리만 데이타를 주고 받을 수 있다.
//정적은 정적 지들끼리
public class Exam01 {

	public static void main(String[] args) {
		
		Member m = new Member();
		
		
	}

}
