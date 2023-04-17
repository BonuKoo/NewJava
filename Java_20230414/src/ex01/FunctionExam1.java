/*함수
 * 함수의 4가지 형태
 * 더하기 : 반환타입 , main : 함수명 , () : 매개변수 타입
 *  1. : 반환타입 x , 매개변수 2개
	2. : 반환타입 o, 매개변수 o 
	실수값을 전달하면, 실수값을 정수로 변환해서 출력하는 함수 작성.
	
	3. 더하기 : 반환타입 0, 매개변수 x
	3. 실수값을 전달하면 실수값을 정수로 변환해서 출력하는 함수 작성
	
	4. 더하기 : 반환타입 x, 매개변수 o  
	호출함수에게 실수값을 전달하면 호출함수에서 정수로 변환해서 출력
. */
package ex01;

public class FunctionExam1 {

	
//	static void add(int num1, int num2) {
//		int result = (num1+num2) ;
//		System.out.println(result);     
//	}
//	
//	static int convertInt(double f) {   //return을 안쓸거면 void를 붙여라. - 암기사항
//		double result = f;
//		
//		System.out.println(result);
//	
//	}

	//	static void converInt(double f) {
//		System.out.println((int)f);
//	}
	//3. 더하기 : 반환타입 0, 매개변수 x
	// 실수값을 전달하면 실수값을 정수로 변환해서 출력하는 함수 작성
	static int add() {
		
		double i = 10+20;
		return i;
	}
//	4. 더하기 : 반환타입 0, 매개변수 x
//	함수에서 호출함수에게 실수값을 전달하면 호출함수에서 정수로 변환해서 출력
	static double convertInt() {
		return 10.2;			//10.2 실수값
		
		 
}
public static  void main(String[] args) {
		
		// 3. 더하기 : 반환타입 0, 매개변수 x
		// 실수값을 전달하면 실수값을 정수로 변환해서 출력하는 함수 작성
		System.out.println("프로그램 시작");
				add(30.2);
				System.out.println();
		System.out.println("프로그램 끝" + ", ");	
		//4.함수에서 호출함수에게 실수값을 전달하면 호출함수에서 정수로 변환해서 출력
		double df = convertInt();	 //호출함수에게 실수값, 10.2를 전달 	
		System.out.println((int)df); //정수로 변환해서 출력
		
	}
}
