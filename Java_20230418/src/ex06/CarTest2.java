package ex06;

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {						//1
		this ("white","auto",4);
	}
	Car(String color) {			//2
		this(color, "auto",4);	
	}
	Car(String color, String gearType, int door){	//3 //다 입력을 받아서 넣겠다
	this.color = color;
	this.gearType = gearType;
	this.door = door;
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		Car c1 = new Car();		  //1
		Car c2 = new Car("blue"); //2
		
		System.out.println("c1의 color = " + c1.color + ", gearType=" +c1.gearType +", door="+c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType=" +c2.gearType +", door="+c2.door);
	}

}
