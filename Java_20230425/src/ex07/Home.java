package ex07;

public class Home {
	
	
	private RemoteControl rc = new RemoteControl() {
		//익명 구현객체
		@Override 
		public void turnOn() {
			System.out.println("Tv를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV 끕니다.");
		}
		
	};
	
	public void use1() {
		rc.turnOn();
		rc.turnOff();

	}
	
	public void use2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}


