package ex01;

import java.util.Scanner;

//사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 끝(포함)까지의 합을 출력
public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("start값을 입력하세요");
		int start = sc.nextInt();
		
		System.out.println("end값을 입력하세요");
		int end = sc.nextInt();
		
		int sum=0;   
		
		
		for(int i = start; i<=end; i++) {
			sum += i ;}
			
		System.out.println("값은 :" +sum+ "입니다.");
	}
}