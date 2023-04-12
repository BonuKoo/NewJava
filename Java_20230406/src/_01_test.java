import java.util.Scanner;

public class _01_test {

	public static void main(String[] args) {
		
		
		// 점수 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력 해 주세요");
		double korScore = sc.nextDouble();
		System.out.println("영어 점수를 입력 해 주세요");
		double engScore = sc.nextDouble();
		System.out.println("수학 점수를 입력 해 주세요");
		double mathScore = sc.nextDouble();
		
		// 총점 계산
		double totalScore = korScore + engScore + mathScore;
		System.out.println("총 점수는 : " + totalScore + "점 입니다.");
		
		// 평균 점수 계산
		double averageScore = (double)totalScore/3;
		String average = new String();
		if (average.length()>5) {
		System.out.println("평균 점수는 : "+ average +"점 입니다.");
		}
		
		

		
		 
		
		
	}

}
