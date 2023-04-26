package ex06;

public class Exam01 {

	public static void main(String[] args) {

		try {
			findClass(); //1 . 함수 호출   //여기로 다시 들어옴
		}catch(Exception e) {			//여기서 예외 발생 문제를 처리
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
	private static void findClass() throws ClassNotFoundException { //3 이쪽으로 들엉옴
								//나를 호출했던 문장에게 예외를 던져버림.
		
		Class.forName("java.lang.String2");
						//2. 문제가 발생
	
	}
	
}

//만약 find class에 try, catch가 없는 경우 ClassNotFoundException을 받아줄 곳이 없음.
// 이 경우 public static void main(String[] args) { throws ClassNotFoundException 을 붙인다. 
// - > 자바 가상 머신에서 임의로 처리를 해버린다 . = 좋은 방법은 아님.