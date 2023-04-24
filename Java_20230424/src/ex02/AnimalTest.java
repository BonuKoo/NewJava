package ex02;

class Cat{
	void sound() {
		System.out.println("야옹~야옹");
	}
}

class Dog{
	void makeSound() {
		System.out.println("멍멍~멍멍~");
	}
}

class Pig{
	void sound() {

		System.out.println("꿀꿀~꿀꿀~");
	
	}

}

class Rabbit{
	void makesound() {
		System.out.println("토끼~");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		//고양이-야옹, 강아지-멍멍, 돼지 짓는 소리- 꿀꿀
	Cat cat = new Cat(); 
	cat.sound();
	
	Dog dog = new Dog();
	dog.makeSound();
	
	Pig pig = new Pig();
	pig.sound();

	Rabbit rabbit = new Rabbit();
	rabbit.makesound();
	} // public static void main
} 	  //Animal Test 끝
 //맥주 생각난다