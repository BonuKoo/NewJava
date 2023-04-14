/*함수
 * 더하기 : 반환타입 , main : 함수명 , () : 매개변수 타입
 * 1.더하기 : 반환타입 x , 매개변수 2개
	2. 실수값을 전달하면, 실수값을 정수로 변환해서 출력하는 함수 작성.
	
	3. 더하기 : 반환타입 0, 매개변수 x
	3. 실수값을 전달하면 실수값을 정수로 변환해서 출력하는 함수 작성
	
	4. 더하기 : 반환타입 0, 매개변수 x
	호출함수에게 실수값을 전달하면 호출함수에서 정수로 변환해서 출력
. */
package ex01;

public class FunctionExam3 {

	public static  void main(String[] args) {
		//4. 더하기 : 반환타입 X, 매개변수 x
		//
		System.out.println("프로그램 시작");
		add();
		System.out.println("프로그램 끝"+ ", ");
}

//4. 더하기 : 반환타입 X, 매개변수 x
//함수에서 호출함수에게 실수값을 전달하면 호출함수에서 정수로 변환해서 출력
static void add() {
	int num  = 10;
	int num2 = 20;
	System.out.println(num+num2);
	 
	
}
}