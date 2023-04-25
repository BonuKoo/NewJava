package ex01;

public class Audio implements RemoteControl {

	@Override
	public void TurnOn(){
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void TurnOff() {
		System.out.println("오디오를 끕니다.");
	}
	
	public void setMute(boolean mute) { //인터페이스에서 이미 정의내린 메서드를, 구현받은 하위메서드에서 재정의 내릴 수 있다. 
		System.out.println("setMute()재정의 합니다."); // 이 경우 default 대신 public을 써준다.
	}	
}


