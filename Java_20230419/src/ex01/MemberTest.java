package ex01;

class Bag{
	int capacity; //용량
	Suncream sun;           //포함 관계
							//객체 주소값, Suncream을 넣어야 한다.
							//현재는 아무 값도 안들어가있는 상태
	
	public Bag() {			
		System.out.println("Bag()");
	}
	
	void move(){  //포함 관계				//백 안에 선크림을 집어넣은 상태
	System.out.println("가방 옮기다");
	};
}

class Suncream {
	int vol;
	public Suncream() {
		System.out.println("Suncream()");
	}
	void cover() {
		System.out.println("선크림 바르다.");
	
	}
}
public class MemberTest {

	public static void main(String[] args) {
	
		Bag bg = new Bag();
		bg.sun = new Suncream(); //여기서 suncream 객체를 만들고
								 //
		bg.move();
		bg.sun.cover();
	}

}
