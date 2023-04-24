package ex08;

interface Animal{
	void eat();
	public abstract void sleep();  // public abstract 생략 가능
	default void sound() {};       //앞에 default를 붙이면
								   //구현 할 클래스에선 구현을 해도 괜찮고
								   //안해도 괜찮아진다. - 필수사항이었던 것을 선택사항으로 바꿔줌.

}

class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("고양이는 먹는다.");
		
	}

	@Override
	public void sleep() {
		System.out.println("고양이는 잔다.");
		
	}
	
}

class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("개는 먹는다.");
		
		
	}

	@Override
	public void sleep() {
		System.out.println("개는 잔다.");
	}
	
}
public class Exam01 {

	public static void main(String[] args) {
		
		Animal an = new Dog();		//Interface는 참조만 가능하다.
		an.eat();					// 직접 객체를 만들지는 못함.
		an.sleep();					//늘 최상위 클래스만 앞에 놓인다고 생각하자.
	}

}
