package ex03;

public class Exam01 {

	public static void main(String[] args) {
		
	
		
	try {
		Class.forName("java.lang.String");	//자바 내에 String lang이 있는 지 없는 지를 찾아내는 메서드
		System.out.println("java.lang.String 클래스 존재함.");
		
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	System.out.println("프로그램 종료");
		
	}
}
