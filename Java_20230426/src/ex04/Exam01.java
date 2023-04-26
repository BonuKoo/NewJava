package ex04;

public class Exam01 {

	public static void main(String[] args) {
		String[] arr = {"kor", "200", "300"};
	
		 //배열 길이보다 많이 실행해서 문제
		for(int i=0; i<arr.length+1; i++) {
			try {
			int value = Integer.parseInt(arr[i]);
			System.out.println(value);
			
				
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(); //e의 주소값을 나타내는 함수
			System.out.println("배열 크기를 벗어났습니다.");
		}catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("숫자가 아닌 문자는 숫자로 변환불가합니다.");
		}catch(Exception e) {
			System.out.println("모든 예외 처리는 내가 한다.");
		
		}finally { //옵션사항. 
			System.out.println("예외가 발생하든 발생하지 않든 무조건 처리해야 되는 문장은 이곳에 기입");
			} // 실행하면 이 문장이 4번 돈다. 왜냐? 4번째 배열을 출력하지 못하더라도 (배열 개수 부족) 아무튼 finally로 인해 실패한 경우에도//(Array index`~ 가 발생한 경우 ) 해당 문장은 출력된다. 
		}
		System.out.println("프로그램 종료");
	}
}

