/*함수
 * {} : 함수가 수행 문장
 * 1. 더하기 : 반환타입 0, 매개변수 0 (2개)
 * 2. 실수값을 전달하면 실수값을 정수로 변환해서 돌려주는 함수작성.

 */
package ex01;

public class FunctionExam2 {
//				  (반환타입이 없다)
	public static  void       main(String[] args) {
		
		System.out.println("프로그램 시작");
		//2.
		int num = add(20,30);
		//1.
		int number = convertInt(10.2);
	//						
		System.out.println("프로그램 끝" + num + ", " + number);
		
		
		
	}
	//1.
	//(반환타입) (함수)		(매개변수)
	static int convertInt(double f) {
		int result = (int)f;
		return result;
	}
	//2.
	static int add (int n1, int n2) {
		System.out.println("add함수 시작");
		int result = n1 + n2;
	
		return result;
	}
	
}