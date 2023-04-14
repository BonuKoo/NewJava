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

public class FunctionExam4 {
//함수를 호출하면서 인자값 하나 전달(정수)하면 함수는 1부터 전달한 인자값까지 더해서
//더한 결과값을 호출함수에게 반환해서 출력
	

	
	//입력해서 홀수면 홀수값, 짝수면 짝수값이라고 출력해라.
	static int intFuction(int num) {
	 int total = 0;
	 for (int i=1; i <= num; i++) {
		 total+= i;
		 }
	 	// sum%2 =1 면 출력 홀수
	 	// sum%2 =0 면 출력 짝수
	 
	}
	static int intFuction(int num) {
		int total = 0;
		for (int i =1 ; i <= num; i++)
			total+= i;
		
		return sum;
	}
	
	public static  void main(String[] args) {
	
	System.out.println("프로그램 시작");
	int total = intFuction(6);
	System.out.println("프로그램 끝"+ total);
	if (total %2 ==1) System.out.println("홀수");
	 if (total %2 ==0) System.out.println("짝수");
	 
}
}