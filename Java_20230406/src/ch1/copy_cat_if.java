package ch1;

import java.util.Scanner;
//exam 04 복습
//성적을 입력 받아서 70이상이면 "합격했습니다. 메시지 출력"

public class copy_cat_if {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int point;
		System.out.println("점수를 입력하세요.");
		point = sc.nextInt();
		
		if(point>=70) {
			System.out.println("합격했습니다.");
			
		}else System.out.println("불합격했습니다.");
	}
}

//성공