package ex01;
//인터페이스 선언
public interface RemoteControl {
	//상수(public static final) 생략 가능
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//추상메소드 - body부분이 없음
	public void TurnOn( ) ;
	public void TurnOff();
	//public void setVolume(int n);
	
	//디폴트메서드 - 인터페이스에서 사용 : 구현을 해도, 안해도 괜찮다.
	//인터페이스에서 default인 메서드는, 하위클래스에선 default 대신 public을 써서 재정의 가능.

	//디폴트메서드 - 구현클래스에서 재정의 선택 가능
	default void setMute(boolean mute) { //추상메소드가 아님. 선언부()가 있고 구현부도 있음{} 
		if(mute)
			System.out.println("무음처리 합니다.");
		else
			System.out.println("무음처리 해제합니다.");
	}
	//정적메소드 -  public 생략 가능
	public static void changeBattry() {
		System.out.println("건전지를 교체합니다.");
	}
}