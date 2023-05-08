package ex01;

class Person{
	private String name;
	private int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
		@Override
		public String toString() {
			return "이름 : " + name + ", 나이 : " + age;
		}
}

//class Student extends Person{
	
	private int grade;

	public Student(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}
	
//	public void setGrade(int grade) {
//		this.grade = grade;
//	}
//	
//	public int getGrade() {
//		return grade;
//	}

//	@Override
//	public String toString() {
//		
//		System.out.println("이름 : " + getName() + ", 나이 : " + getAge() + " .학년 " + getGrade());
//		return "이름 : " + getName() + ", 나이 : " + getAge() + " .학년 " + getGrade();
//	}
	@Override
	public String toString() {
		
		
		return super.toString() + " .학년 : "+ grade; //이런 방법도 있다
	}
	
}
	
	//하위 타입에서 상위 타입으로 

public class mainExam {

	public static void main(String[] args) {
		Person p = new Student("홍길동",20,3); //새로운 객체를 만들고서 
		p.toString();
		System.out.println(p.toString());
	}
} //출력 ==> 이름 : 홍길동, 나이 : 20. 학년 : 3학년
