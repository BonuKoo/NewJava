package practice;

import java.util.Scanner;

public class pr_3 {
 // 문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("수를 입력하라.");
	
	if (num%3=0) System.out.println("3의 배수이다.");
	else System.out.println("3의 배수가 아니다.");
	}

}
