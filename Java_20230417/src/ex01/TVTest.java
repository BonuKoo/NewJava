package ex01;
//Tv 클래스 설계			예  int num, int kor 등
class Tv{
	//멤버변수, 필드
	String color;  //
	boolean power; //on off 기능
	int channel;
	
	//메소드, 멤버함수
	void power() { power = !power;}
	void channelup() {channel++;}
	void channeldown() {channel--;}
	
}

public class TVTest {

	public static void main(String[] args) {
		
		int num = 10;
		int kor = 90;
		Tv tv = new Tv();//color가 나오고 싶으면 (안에 tv.color)  
		tv.color = "검정";
		tv.channelup(); //channel 1
		tv.channelup(); //channel 2
									//모든 클래스는 기본적 object 상속을 받는다.
		System.out.println(tv.color); 
		System.out.println(tv.channel);
		
		Tv lgtv = new Tv();
		lgtv.color = "흰색";
		
		
	}

}
