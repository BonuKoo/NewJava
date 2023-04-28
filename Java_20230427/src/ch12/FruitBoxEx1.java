package ch12;

import java.util.ArrayList;

import ch13.Apple;
import ch13.Box;
import ch13.Fruit;
import ch13.Grape;
import ch13.Toy;

class Fruit { public String toString() { return "Fruit";}}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy { public String toString() { return "Toy";}}

public class FruitBoxEx1 {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> ToyBox = new Box<Toy>();
		Box<Grape> grapeBox = new Box<Apple>(); //에러 grape과 apple 타입이 서로 안맞음
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); 
		fruitBox.add(new Grape()); 
		fruitBox.add(new Toy()); // Toy는 상속을 하고 있지 않아서 오류 
		
		appleBox.add(new Apple());
		appleBox.add(new Fruit()); //Fruit가 Apple보다 상위이기 때문에 Apple의 참조변수 applebox는 fruit를 참조하지 못함.
		appleBox.add(new Grape()); //grape는 apple을 상속받고 있지 않기 때문에 오류 발생
		appleBox.add(new Toy()); //
		
		ToyBox.add(new Toy());
		ToyBox.add(new Apple()); //에
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(ToyBox);
		//메인 끝
	}
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add (T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	
	public String toString() {return list.toString();}
}
