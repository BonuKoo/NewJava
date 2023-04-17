package ex03;

class Student{
	String name;
	String address;
	int age;
	static int count;		//몇번째 학생인지, 객체 수가 늘어날 때마다 1씩 늘어나야함
							//정적변수는 메모리 공간 안에 '미리' 만들어져있고
							//instance는 객체가 만들어질 때 생성이 된다.
							//따라서 메서드가 실행될 때, 메서드 저
	void displayInfo() {
		count++;
		System.out.println(name + "," + age + "," + address + "현재 학생수 : "+count);
	//static count = 공유하겠다는 의미
	//name, address, age 등은 각 Student 객체의 배열이 하나씩 따로 가지고 있다.
	//static count는 모두가 공유하는 단 하나의 값만 존재한다.
	}
	
	

	}
public class StudentTest {

	public static void main(String[] args) {
		
//		Student[] stuArr = new Student[i];
//		
		Student kim = new Student();
		kim.name = "김씨요" ;
		kim.age = 20;
		kim.address = "수원이요" ;
		
		Student park = new Student();
		park.name = "박씨요" ;
		park.age = 200;
		park.address = "천당이요" ;

		Student lee = new Student();
		Student hong = new Student();
	
		kim.displayInfo();
		park.displayInfo();
		lee.displayInfo();
		hong.displayInfo();
	}
}
