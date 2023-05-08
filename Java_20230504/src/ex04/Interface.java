package ex04;

/*
<택시기사와 고장난 미터기>

Meter 인터페이스는 start와 stop이라는 추상 메소드를 가지고 있습니다. 
stop메소드는 달린 거리에 해당하는 값(distance)를 매개변수로 받아
요금을 int형으로 반환하는 메소드입니다. 
Meter 인터페이스를 구현하는 택시 클래스를 완성해 보세요.
승객이 내야할 요금은 (기본요금 + distance) x 2로 계산하세요.
//  stop 메서드 -> (20000+100) x2 
기본요금(FARE)은 20000원으로 지정
*/

interface Meter{
	void start();
	int stop(int distance);
}

class Taxi implements Meter{
	int fare = 20000;
	int distance;
	int fee;
	
	@Override
	public void start() {
		System.out.println("운행을 시작합니다.");
	}	
	@Override
	 public int stop(int distance) { 
		int fee =(fare+distance)*2;
		System.out.println("운행을 종료합니다. 요금은" + fee +" 입니다.");
		return fee;
	}
}

//직접 입력을 했으므로 getter/setter 는 아님
public class Interface {
	//아래는 실행을 위한 코드 입니다. 수정하지 마세요
	public static void main(String[] args) {

		Taxi taxi = new Taxi();
	     taxi.start();
	     taxi.stop(100);		 
	}

}

/*******************코드 실행 결과******************
운행을 시작합니다.
운행을 종료합니다. 요금은 40200원 입니다.*/