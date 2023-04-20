package ex01;

public class CastingTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;		
	
	fe.water();
	car = fe; //car = (Car)fe;에서 형변환이 생략된 상태
	car.water();                           //   -오류
	fe2 = (FireEngine)car; // 자손<-조상
	fe2.water();
	
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("dirve, Brrrr~");
	}
	
	void stop() {//멈추는 기능
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car{//소방차
	void water() {//물 뿌리기
		System.out.println("water!!!");
	}
}