package ex05;

import java.util.Calendar;
import java.util.Date;

class Sample{}

class Singleton{
	
	private static Singleton instance;
//Singleton에서만 접근이 가능한, 싱글톤 타입의 instance
										//참조변수 instance
	private Singleton() {} //싱글톤 내에서만 접근이 가능한 싱글톤 매서드
	
	public static Singleton getInstance(){ //생성자 호출
		
		if(instance == null)			//sing2를 만들 시에는 instance 값이 null이 아니다.
			instance = new Singleton(); //
										//결과적으로 sing1과 sing2의 값은 instance를 가리키고 있다.
		return instance;				
	}
	
}  //static 변수는 클래스명 . 함수 로 호출이 가능

public class SingleTonTexts {

	public static void main(String[] args) {
	Sample s1 = new Sample();			//s1은 Sample 타입의 인스턴스 객체
	Sample s2 = new Sample();
	System.out.println(s1 == s2);
	System.out.println("-----------------");
	
	Calendar now = Calendar.getInstance();
	System.out.println(Calendar.getInstance().getTime());
	
	// Singletion sing1 = new Singleton(); - Singleton()에 private가 붙어있어서 외부 클래스에서 접근이 불가능하다.
	Singleton sing1 = Singleton.getInstance();
	Singleton sing2 = Singleton.getInstance();
	System.out.println(sing1 == sing2);//서로 주소값이 같다.
	} 
}
