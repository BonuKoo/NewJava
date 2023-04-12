package ex01;

public class Exam05 {
//1부터 100까지 합
	public static void main(String[] args) {
		int sum = 0;
		
		
		for (int i = 1; i<=100; i++){     // 1~100 회전
			sum += i  ;
			// i값을 계속 sum 누적
			
		}
		System.out.println("1부터 100까지의 합" + sum);
	}

}
