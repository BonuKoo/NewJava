package ex01;

import java.util.Scanner;
/* 숫자를 하나 입력 받아서 양수, 음수, zero로 출력
 * 
 */
public class Exam03 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("정수 입력.");
    int number = sc.nextInt();
    if (number>0) System.out.println("num은 양수입니다.");
    else if ( number == 0) System.out.println ("num은 zero입니다.");
    else System.out.println("num은 음수입니다.");
	
	}
	}
