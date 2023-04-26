package ex02;

public class Exam01 {

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]");
		printLength("ThisisJava");
		printLength(null); //null값엔 길이가 없기 때문에 오류 발생
		System.out.println("프로그램 종료");
	}
	
	private static void printLength(String data) {
		int result = 0;
		try {
			result = data.length();//data 주소값 입력받은 길이 = result 결과
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace(); //제일 디테일하다.
		}
		System.out.println("문자수 : " + result);
	}
}
