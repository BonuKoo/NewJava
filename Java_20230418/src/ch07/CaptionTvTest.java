package ch07;
class Tv{
	boolean power;
	int channel;
	
	void power() { power = ! power;}
	void channelup() {++channel;}
	void channel1down() {--channel;}
}

class CaptionTv extends Tv{
	boolean caption; //캡션상태 (on/off)
	void displayCaption (String text) {
		if (caption) { //캡션 상태가 on(true)일 때만 text를 보여 준다.
			System.out.println(text);
		}
	}
}
public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;				   //조상 클래스로부터 상속받은 멤버
		ctv.channelup();				   //조상 클래스로부터 상속받은 멤버
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello, world");
		ctv.caption = true;				   //캡션 기능을 켠다.
		ctv.displayCaption("Hello, world");//캡션을 화면에 보여 준다.
	}
}
