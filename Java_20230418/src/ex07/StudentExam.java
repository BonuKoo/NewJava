package ex07;

class 사람{
	String name = "홍길동" ;
	int age = 20 ;
	public 사람(String name, int age) {
		this.name = name;
		this.age = age; 	//사람이란 부모 클래스에서 name,과 age라는 인자값을 요구한다.
	}						//만약 자식 클래스에서 이 name과 age를 준비해주지 못하면 계산이 뻑이 난다.

	void info() {
		System.out.println(name + ", " + age);
	}
//	
	
	
}
class 구본우 extends 사람{ // 구본우 class는 사람이란 class를 상속한다.
						//
//	String name;  
//	int age;
	double weight;
	
//	public 구본우() {
//		super("구본우",29); //this 대신 super. super는 부모 클래스를 호출한다.
//	}
	
	public 구본우(String name, int age, double weight) {
		super(name,age);
		this.weight = weight;
	}
	void display( ) {
//		System.out.println(name + "," + age + "," + weight);
	}
}

class 추명선 extends 사람{
	
	double height;
	
	public 추명선(String name, int age, double height) {
		super(name,age); //여기서 부모 클래스에게 준다.
		this.height = height;
		
	}
	
	void display( ) {
		System.out.println(name + "," + age + "," + height);
	}
}

//class 박종진{
////	String name;
////	int age;
//	String grade;
//	
////	public 박종진(String name, int age, String grade) {
////		this.name  = name;
////		this.age   = age;
////		this.grade = grade; //학점 
////	}
//	void display( ) {
////		System.out.println(name + "," + age + "," + grade);
//}
//	}
public class StudentExam {

	public static void main(String[] args) {
			구본우 구 = new 구본우("로이",11,120); //구본우란 class에 사람이란 클래스가 들어가있다
//			구.age = 100;
//			구.name = "로이";
//			구.weight = 89;
			구.info();
//			
//			추명선 추 = new 추명선();
//			추.info();
	}
}

//'사람'이란 부모 클래스를 개개인 클래스가 상속받아서 사용
