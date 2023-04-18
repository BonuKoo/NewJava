package ex08;
//Parent 클래스를 상속해서 chile 클래스를 다음과 같이 작성했는데,  chile 생성자에서 컴파일러에러가 발생
//했습니다. 그 이유와 해결 방법을 설명하세요
 class parent {
	public String name;
	
	
	public parent(String name) {
		this.name = name;				//부모클래스에는 이름만 갖고 있다.
	}
	

	}

 class Child extends parent {
	public int studentNo; //현재 child는 parent를 상속받은 상태
	
	Child (String name, int studentNo) {  //child의 매개변수 는 문자열 name, 정수 학생 번호
//		this.name = name;				//this.name 
//		this.studentNo = studentNo;		//
		super(name);
		this.studentNo = studentNo;     
		
	}
}

 public class Exam {

		public static void main(String[] args) {
			Child ch = new Child("까미", 2);
		}
			
			
 }





//public static void main(String[] args) {
// public 클래스는 파일명과 같아야 한다. 그런데 public 클래스가 parent, child 이므로
// 클래스 명 중 하나를 바꾼다. super 클래스인 parent 를 public로 만들고, child는 일반 class화
 