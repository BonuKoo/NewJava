package ex05;

//중첩 인터페이스 : 해당 클래스와 밀접한 관계를 맺는 구현 객체를 만들기 위해서이다.
public class Button {

	public static interface clickListener {
		void onClick(); //반드시 구현을 해야 함 = 인터페이스니까
	}
	
	private clickListener clickListener;
	//해당 클래스 안에서만 통하는 주소값 clickListener
	
	public void setClickListener(clickListener ClickListener) { //구현 객체를 하나 생성해서, 생성된 객체의 주소값을 보내준다. (Body 부분까지 다 채운 객체의 주소값을 받는다)
		this.clickListener = ClickListener;
	}
	public void click() {
		this.clickListener.onClick();
	}
}

//더블클릭 했습니다.