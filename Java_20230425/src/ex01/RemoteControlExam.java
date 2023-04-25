package ex01;

public class RemoteControlExam {

	public static void main(String[] args) {
		
		RemoteControl rc = new Television();
		rc.TurnOn();
		
		rc = new Audio();
		rc.TurnOn();
		rc.setMute(true);
		System.out.println(RemoteControl.MAX_VOLUME);
		RemoteControl.changeBattry(); //인터페이스에서 public static void 상태 - 굳이 하위 클래스에서 구현하지 않더라도
		
		Television tel = new Television();
		tel.search(null);
		
		Searchable se = new Television();
		se.search(null);
		
		System.out.println(RemoteControl.MAX_VOLUME);
		RemoteControl.changeBattry();
	}
}
