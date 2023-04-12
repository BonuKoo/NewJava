package ch1;

import java.util.Scanner;

public class copy2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    String str = sc.nextLine();
		//int str = sc.nextInt();
		int num = Integer.parseInt(str);    //Integer.parseInt(str); 처리를 하지 않으면 아래 num+10은 'string, 문자처리가 되어서
		                                    // println(num+10)의 출력은 "2010"이 되어버린다.
		                                    //Integer.parsedouble(str); ->  str은 실수 ,  str 값에 10을 입력하게 되면 10.0 + 10
		System.out.println(num+10);
		System.out.println("프로그램  종료");
	}

}
