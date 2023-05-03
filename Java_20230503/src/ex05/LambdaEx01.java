package ex05;

interface MyFunction{
	int max (int a, int b);
}

public class LambdaEx01 {

	public static void main(String[] args) {
		//ex04 익명 구현 객체에서 람다식으로 변환
		MyFunction m = 
			
			
				(int a, int b) ->{	
				return a>b? a:b;
			};
		// MyFunction m = (a, b) -> a>b? a:b; //여기까지 줄일 수 있다.
			System.out.println("max : " +m.max(10, 20));
		}
	}

//자바스크립트에선 =   // 자바에선 ->
// 람다식이 람다식인걸 알기 위해선
// 우선 MyFunction 등의 인터페이스 이름을 확인하고
// 역으로 추론을 해야 한다. - page 795쪽의 내용