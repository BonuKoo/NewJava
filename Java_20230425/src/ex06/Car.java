package ex06;

public class Car {
	private Tire tire = new Tire();
	
	//			익명자식객체 -> 부모클래스를 상속받아 아래같이 생성됨
	private Tire tire2 = new Tire() { //익명자식개체 new Tire()
		public void roll() {
			System.out.println("익명 자식 Tire 객체1이 굴러감");
		}
		public void test() {
			System.out.println("익명 자식 test");
		}
		 
	};
	
	public void run1() {
		tire.roll(); //타이어가 굴러갑니다.
		tire2.roll();//익명 자식 Tire 객체1이 굴러갑니다.
		//
	}
	
	public void run2() {
		Tire tire = new Tire() { //타이어 클래스를 상속받음
			@Override
			public void roll() {
				System.out.println("익명 자식 객체2가 굴러감");
			}
		};
		tire.roll();
	}
	public void run3(Tire tire) {tire.roll();} //익명 자식 객체 3이 굴러감.
		
}

//new Tire()