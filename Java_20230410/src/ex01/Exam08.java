package ex01;

import java.util.Scanner;
 // 통장 만들기
public class Exam08 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
//정답
int balance =0;                                   //잔고
boolean flag = true;

for(;flag;) {                                                   
System.out.println("------------------------");
System.out.println("1. 예금 |2.출금|3.잔고|4.종료");
System.out.println("-------------------------");
int number = sc.nextInt();

switch(number) {
case 1: 
	System.out.println("예금");
	balance += sc.nextInt(); 
	break;
	
case 2:
	System.out.println("출금");
	balance -= sc.nextInt();
	break;
	
case 3:
	System.out.println("잔고");
	System.out.println("현재 잔고 : " + balance); 
	break;
	
case 4:
	System.out.println("종료");
	flag = false;
	break;
}
}
	}
}



	

