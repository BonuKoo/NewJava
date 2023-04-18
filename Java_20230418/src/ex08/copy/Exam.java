package ex08.copy;
//Parent 클래스를 상속해서 chile 클래스를 다음과 같이 작성했는데,  chile 생성자에서 컴파일러에러가 발생
//했습니다. 그 이유와 해결 방법을 설명하세요
 class Parent {
	public String nation;
	
	
	public Parent() {				//3. 
		this("대한민국");				//부모클래스에는 이름만 갖고 있다.
	System.out.println("Parent() call"); 				//2
	}
	public Parent(String nation) {		//4.
		this.nation = nation;
		System.out.println("Parent(String nation) call");//1
	}

	}

 class Child extends Parent {
	public String name;
	
	public Child() {  							//1.첫번째 실행
		this("홍길동");				//this.name //2. 다른 생성자를 만나러 슝
		System.out.println("Child() call");		        //4
	}
	public Child (String name) {  				//3.
		this.name = name;				//this.name 
		System.out.println("Child(String name) call");	//3
		  
		
	}
}

 public class Exam {

		public static void main(String[] args) {
			Child child = new Child();
		}
			
			
 }





//public static void main(String[] args) {
// public 클래스는 파일명과 같아야 한다. 그런데 public 클래스가 parent, child 이므로
// 클래스 명 중 하나를 바꾼다. super 클래스인 parent 를 public로 만들고, child는 일반 class화
 