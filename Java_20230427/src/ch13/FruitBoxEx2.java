package ch13;

import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() {return "Fruit";}
	
}

class Apple extends Fruit { public String toString() {return "Apple";}}

class Grape extends Fruit { public String toString() {return "Grape";}}

class Toy 				  { public String toString() {return "Toy";}}

interface Eatable {}

public class FruitBoxEx2 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Apple> appleBox = new FruitBox<Apple>(); //에러
//		FruitBox<Apple> toyBox   = new FruitBox<Toy>(); 
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
//		fruitBox.add(new Toy());
		
//		appleBox.add(new Fruit());
		appleBox.add(new Apple());
		appleBox.add(new Grape()); //
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox-" + fruitBox);
		System.out.println("appleBox-" + appleBox);
		System.out.println("grapeBox-" + grapeBox);
		
	}//main
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}
					//Fruit를 상속받고 있고 , Eatable을 구현하고 있는 클래스들
class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {list.add(item);}
	
	T get (int i) {return list.get(i);}
	
	int size() {return list.size();}
	
	public String toString() {return list.toString();
	}	
}

