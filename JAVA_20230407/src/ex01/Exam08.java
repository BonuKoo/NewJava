package ex01;

import java.util.Scanner;

public class Exam08 {
 //컴퓨터랑 가위바위보 게임.
	public static void main(String[] args) {
		
		//int random = (int)(Math.random()*10);	// 0~9 정수
		//int random = (int)(Math.random()*10)+1; //1~10 정수
		int com = (int)(Math.random()*3)+1; //1~3 정수
		
		//System.out.println(()(sample*10));    // 

		System.out.println("1(가위), 2(바위), 3(보)중 입력하세요."); // 내가 이기는 경우 1. 가위 -3, 
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		
		switch (user-com) {
		case 0 :
			System.out.println("비김");
		break;
		case -2 : 	
		case 1 :
			System.out.println("user 승!");
		break;
		case -1 :
		case 2 :
			System.out.println("컴 승!");
			break;
		}
		System.out.println("User :" + user + ", Com : " + com);
	}

}
