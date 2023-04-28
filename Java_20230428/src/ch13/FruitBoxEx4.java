package ch13;

import java.util.*;

class Fruit	{
	String name;
	int weight;
	
	Fruit(String name, int weight){
		this.name = name;
		this.weight = weight;
	}
	public String toString() { return name+"("+weight+")"; }

}

class Apple extends Fruit{
	Apple(String name, int weight){
		super(name,weight);
	} 
}

class Grape extends Fruit{
	Grape(String name, int weight){
		super(name,weight);
	} 
}


class AppleComp implements Comparator<Apple> {
	public int compare(Apple t1, Apple t2) {
		return t2.weight = t1.weight;
	}
}

class GrapeComp implements Comparator<Apple> {
	public int compare(Apple t1, Apple t2) {
		return t2.weight = t1.weight;
	}
}

class FruitComp implements Comparator<Fruit> {
	public int compare(Fruit t1, Fruit t2) {
		return t2.weight = t1.weight;
	}
}


public class FruitBoxEx4 {
	public static void main(String[] args) {
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
		appleBox.add(new Apple("GreenApple",300));
		appleBox.add(new Apple("GreenApple",100));
		appleBox.add(new Apple("GreenApple",200));
		
		grapeBox.add(new Grape("GreenGreen",400));
		grapeBox.add(new Grape("GreenGreen",300));
		grapeBox.add(new Grape("GreenGreen",300));
		
		Collections.sort(appleBox.getList(), new AppleComp());
		Collections.sort(grapeBox.getList(), new GrapeComp());
		
		
		
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println();
		
		System.out.println(appleBox.getList(), new FruitComp());
		System.out.println(grapeBox.getList(), new FruitComp());
		
		System.out.println(appleBox);
		System.out.println(grapeBox);
	} //main
} //FruitBoxEx3

class FruitBox<T extends Fruit> extends Box<T> {}
class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {list.add(item);}
	
	T get (int i) {return list.get(i);}
	
	ArrayList<T> getList() {return list;}
	
	int size () {return list.size();}
	

	public String toString() {return list.toString();}
	
	
	}}
