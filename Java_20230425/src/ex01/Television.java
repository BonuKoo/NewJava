package ex01;

//RemoteControl 인터페이스 구현
public class Television implements RemoteControl, Searchable{

	@Override
	public void TurnOn() {
		System.out.println("Tv를 켭니다.");
	}

	@Override
	public void TurnOff() {
		System.out.println("Tv를 끕니다.");
	}

	@Override
	public void search(String url) {
		System.out.println(url+"검색합니다.");
	}
}
