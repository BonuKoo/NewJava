package ch05;

import java.util.Scanner;

public class ex12 {
//랜덤함수 1~100 사이 숫자를 가지고 있다.
//유저가 컴퓨터 숫자를 맞추는거임.
	public static void main(String[] args) {
	int com = (int)(Math.random()*100);	
	System.out.println(com);

	
	int count = 0;
	while (true) {                     
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		if (user==com) {
			System.out.println("맞췄습니다. 답은 =" + com + "입니다.");
			count++; break;
		}	else {
			System.out.println("틀렸습니다.");
			count++; continue;
		}
		
	} System.out.println("횟수:" + count);
		
	//
	//
	
	}
}