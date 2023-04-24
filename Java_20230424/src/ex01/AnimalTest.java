package ex01;

abstract class Animal{ //추상 클래스 화 - class 앞에 abstract
	abstract void makeSound(); //추상 메소드
	void sound() {};
		//하위 클래스에서 makeSound를 사용하기 위해선, 반드시 해당 하위 객체에서 재정의를 내려줘야 한다.
	
}
							   // 추상 클래스 : 뼈대/양식 만 제공하겠다. 
							    	
class Cat extends Animal{

	@Override	//어노테이션
				//Override->상위클래스는 재정의 하겠다는 적극적 표현
				//만약 Override 어노테이션을 작성한 다음
				//알맞은 메서드를 재정의하지 않을 시, 오류가 발생한다.
				//오타를 잡아주는 역할 (잘못치면 뻑나니까)
	void makeSound() {}
				
}

class Dog extends Animal{ 	//만약 makeSound를 재정의 내리지 않으면 에러가 난다.
	void makeSound() {		//추상메소드를 상속받은 경우 반드시 그 메소드를 재정의(오버라이딩)해야 한다.
		System.out.println("멍멍~");
	}
}

class Pig extends Animal{
	void makeSound() {
		System.out.println("꿀꿀~");
	}
}

class Rabbit extends Animal{
	void makeSound() {
		System.out.println("토끼~");
	}
}

class Tiger extends Animal{
	void makeSound() {
//		super.makeSound();
		System.out.println("어흥~");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		//고양이-야옹, 강아지-멍멍, 돼지 짓는 소리- 꿀꿀
		Animal [] animals = {new Cat(), new Dog(), new Pig(), new Rabbit(), new Tiger()};

		for(Animal animal : animals) //향상된 for 문 //animals 자리엔 배열, 객체 등이 온다. 왼쪽엔 단수, 오른쪽엔 복수
			animal.makeSound();		 // 타입이 Animal 이므로 Animal을 적고, 변수는 복수이므로 오른쪽
	
		for(int i =0; i<animals.length; i++)
			animals[i].makeSound();
		
		System.out.println("--------");
//		Animal an = new Animal(); // Animal class 앞에 abstract를 만들면, 해당 설계도 자체로는 객체를 만들지 못하게 된다.
		Dog d = new Dog();
		d.makeSound();
		
		Tiger ti = new Tiger();
		ti.makeSound();
		
	} // public static void main
} 	  //Animal Test 끝