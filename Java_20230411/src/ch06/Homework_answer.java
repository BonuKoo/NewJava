package ch06;

import java.util.Scanner;

public class Homework_answer {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int count = 0 ;
		int sum = 0 ;
		System.out.println("몇회 입력>");
		int number=sc.nextInt();
		
		while (count < number) {
			System.out.println("숫자를 입력하세요.");
	if (sc.hasNextInt()) { 						//정수가 아니면 false처리
		int num = sc.nextInt();
		if (num%2==0) {
			sum += num;
		}
		count ++;
	}else
		sc.next();
	System.out.println("정수가 아닙니다. 다시 입력해주세요");
		}
		System.out.println("짝수의 합:"+sum);
	}
	}


////else if(sc.hasNextDouble()){				//실수가 아니면 false
//sc.next();
//System.out.println("실수는 입력 불가입니다. 다시 입력하세요"); //해당 과제에선 '정수'만 처리해야 하므로, 실수가 입력되면 다시 입력
//}else {
//	sc.next();
//	System.out.println("문자는 입력 불가입니다. 다시 입력해주세요"); //정수, 실수가 아닌 경우 -> 문자 . 문자는 입력 불가 처리
//}